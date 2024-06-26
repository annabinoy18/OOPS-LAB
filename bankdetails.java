import java.util.*;
class bank {
    String holdernm;
    int accnum;
    String typacc;
    double balance;
    Scanner sc=new Scanner(System.in);
      void enterdata(){
        System.out.println("enter the  acc holder name: ");
        holdernm= sc.nextLine();
        System.out.println("enter the  acc num: ");
        accnum= sc.nextInt();
        sc.nextLine();
        System.out.println("enter the account type ");
        typacc= sc.nextLine();
        System.out.println("enter the account balance ");
        balance= sc.nextDouble();
        System.out.println("values initialised");
    }
      void deposit(){
        System.out.println("enter the amount to be deposited ");
        double dep=sc.nextDouble();
        balance += dep;
        System.out.println("Account balance:"+balance);
        }
      void withdraw(){
        System.out.println("enter the amount to be withdrawed ");
        double withdrw=sc.nextDouble();
        balance=balance-withdrw;
        System.out.println("Account balance:"+balance);

    }
      void display(){
        System.out.println("account holdername:"+holdernm);
        System.out.println("Account balance:"+balance);
        sc.close();
    }
    
}
public class bankdetails{
    public static void main(String[] args){
        bank obj1=new bank();
        obj1.enterdata();
        obj1.deposit();
        obj1.withdraw();
        obj1.display();
        
    }
}
