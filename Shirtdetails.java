import java.util.Scanner;
class Shirt{
    char collsize;
    int sleevlen;
    String mat="cotton";
    Shirt(char size,int slv){
        collsize=size;
        sleevlen=slv;
    }
    void display(int i){
        System.out.println("shirt"+(i+1));
        System.out.println("collorsize:"+collsize);
        System.out.println("sleevelength:"+sleevlen);
        System.out.println("material:"+mat);
    }
}
public class Shirtdetails {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of shirts");
        int n=sc.nextInt();
        Shirt[] sh=new Shirt[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the collorsize of shirt "+(i+1));
            char size=sc.next().charAt(0);
            System.out.println("enter the sleevelength of shirt "+(i+1));
            int slv=sc.nextInt();
            sh[i]=new Shirt(size,slv);
        }   
        for(int i=0;i<n;i++){
            sh[i].display(i);
        }
        sc.close();
    } 
    
}
