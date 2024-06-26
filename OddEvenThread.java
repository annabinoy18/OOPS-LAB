public class OddEvenThread {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());

        oddThread.start();
        evenThread.start();
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(10); // Sleep for a short duration for better visibility in the console
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
