import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n<2){
            System.out.println("number is not prime");
        }
        else{
            boolean isprime=true;
            for(int fact=2;fact<Math.sqrt(n);fact++){
                if(n%fact==0){
                    isprime=false;
                } 
            }  
            if(isprime==false)
                System.out.println("the number is not prime");
            else
                System.out.println("the number is  prime");
            sc.close();
        }
        

    }
    
}
