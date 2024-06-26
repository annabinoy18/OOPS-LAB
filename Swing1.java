import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing1 implements ActionListener{
    JFrame f;
    JButton j1,j2;
    JLabel l1;
    Swing1(){
        f=new JFrame("question");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        j1=new JButton("yes");
        j1.addActionListener(this);
        j2=new JButton("no");
        j2.addActionListener(this);
        l1=new JLabel();
        f.add(j1);
        f.add(j2);
        f.add(l1);
    }

    public void actionPerformed(ActionEvent e){
        if(j1==e.getSource()){
            l1.setText("yes is clicked");
        }
        else{
            l1.setText("NO");
        }
    
        
    }
    public static void main(String args[]){
        new Swing1();
    }

}
