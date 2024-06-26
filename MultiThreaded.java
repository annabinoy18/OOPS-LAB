import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                int randomNumber = random.nextInt(100);
                System.out.println("Generated Number: " + randomNumber);

                if (randomNumber % 2 == 0) {
                    synchronized (EvenSquareThread.class) {
                        EvenSquareThread.number = randomNumber;
                        EvenSquareThread.class.notify();
                    }
                } else {
                    synchronized (OddCubeThread.class) {
                        OddCubeThread.number = randomNumber;
                        OddCubeThread.class.notify();
                    }
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class EvenSquareThread extends Thread {
    static int number;

    public void run() {
        try {
            while (true) {
                synchronized (EvenSquareThread.class) {
                    EvenSquareThread.class.wait();

                    int square = number * number;
                    System.out.println("Even Thread - Square: " + square);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OddCubeThread extends Thread {
    static int number;

    public void run() {
        try {
            while (true) {
                synchronized (OddCubeThread.class) {
                    OddCubeThread.class.wait();

                    int cube = number * number * number;
                    System.out.println("Odd Thread - Cube: " + cube);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreaded {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        EvenSquareThread evenSquareThread = new EvenSquareThread();
        OddCubeThread oddCubeThread = new OddCubeThread();

        numberGenerator.start();
        evenSquareThread.start();
        oddCubeThread.start();
    }
}
