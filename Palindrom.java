import java.util.*;
import java.io.*;
public class Palindrom {
    public static void main(String args[]){
        try{
            File f=new File("hijava.txt");
            f.createNewFile();
            FileWriter fw=new FileWriter(f);
            Scanner sc=new Scanner(System.in);
            String l=sc.nextLine();
            StringTokenizer str=new StringTokenizer(l,",");
            while(str.hasMoreTokens()){
                String one=str.nextToken();
                System.out.println(one);
                int left=0;
                int right=one.length()-1;
                System.out.println(left);
                System.out.println(right);
                int k=1;
                while(left<right){
                    if(one.charAt(left)!=one.charAt(right)){
                        k=0;
                        break;
                    }
                    left++;
                    right--;
                }
                if (k==1){
                    fw.write(one+"\n");
                }
            }
            fw.close();
        }
        catch(IOException e){
            System.out.println("error");
        }
    }
    
}
