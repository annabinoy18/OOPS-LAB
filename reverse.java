import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s1=sc.nextLine();
        StringBuilder reversed=new StringBuilder();
        for (int i=s1.length()-1;i>=0;i--){
            reversed.append(s1.charAt(i));
        }
        reversed.toString();
        System.out.println("the reversed string:"+reversed);

    }
}
