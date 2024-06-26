import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ExpMuth implements ActionListener {
    JFrame f1;
    JTextField t1;
    JButton b1;
    File f;

    ExpMuth(){
        try{
        f=new File("inputdata.txt");
        f.createNewFile();
        }
        catch(Exception e){
            System.out.println("error");
        }
        f1=new JFrame("hi");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(300,600);
        f1.setLayout(new FlowLayout());
        f1.getContentPane().setBackground(Color.BLUE);
        f1.setVisible(true);

        t1=new JTextField(60);
        b1=new JButton("save");
        b1.addActionListener(this);
        f1.add(t1);
        f1.add(b1);
    }
    public void actionPerformed(ActionEvent a){
        if(b1==a.getSource()){
            try{
            String s=t1.getText();
            FileWriter fw=new FileWriter(f);
            fw.write(s);
            fw.close();
            }
            catch(Exception e){
                System.out.println("error");
            }
        }
        displayfielddetails();
    }
    
    public void displayfielddetails(){
        try{
        FileReader fr=new FileReader(f);
        int s;
        int nowords=0;
        
        String x="";
        while((s=fr.read())!=-1){
            x+=(char)s;
        }
      
        StringTokenizer str=new StringTokenizer(x);
        while(str.hasMoreTokens()){
            nowords++;
            System.out.println(str.nextToken());
        }
        System.out.println("no of words="+nowords);
        fr.close();
    }
    catch(Exception e){
        System.out.print("error");
    }
    }

    public static void main(String args[]){
        ExpMuth obj=new ExpMuth();
        /* obj.displayfielddetails(); */
    }
}
