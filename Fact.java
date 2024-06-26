import java.io.*;
import java.util.*;
public class Fact {
    public static void main(String args[]){
        int n;
        try{
            File f=new File("exp.txt");
            f.createNewFile();
            Scanner sc=new Scanner(System.in);
            String s="12 23 3 5 6";
            FileWriter fw=new FileWriter(f);
            FileReader fr=new FileReader(f);
            fw.write(s);
            StringTokenizer str=new StringTokenizer(s," ");
            while(str.hasMoreTokens()){
                String temp=str.nextToken();
                n=Integer.parseInt(temp);
                int fact=1;
                for(int i=2;i<=n;i++){
                    fact*=i;
                }
                fw.write("\t"+fact+"\t");

            }
            fw.close();
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();

        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
