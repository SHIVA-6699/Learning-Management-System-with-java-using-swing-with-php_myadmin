import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Mainpage extends JFrame implements ActionListener
{
    JLabel label1,label2,label3;
    JButton btn1,btn2,btn3;

    Mainpage()
    {
        JFrame frame1 = new JFrame();
//        label1
        label1=new JLabel();
        label1.setText("LEARNING MANAGEMENT SYSTEM");
        label1.setBounds(230,10,540,150);
        label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        this.add(label1);
//        label2
        label2=new JLabel();
        Container c = this.getContentPane();
        label2.setIcon(new ImageIcon("lmsimg1.png"));
        label2.setBounds(50, 150,1399,350);
        c.add(label2);

//btn1

        btn1=new JButton();
        btn1.setText("STUDENT");
        btn1.setBounds(130,550,130,50);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.black);
        btn1.addActionListener(this);
        this.add(btn1);


//btn2
        btn2=new JButton();
        btn2.setText("TEACHER");
        btn2.setBounds(600,550,130,50);
        this.add(btn2);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.black);
        btn2.addActionListener(this);


















        this.setTitle("*                                                                                                                WELCOME PAGE");
        this.getContentPane().setBackground(Color.getColor("#59a9ee"));
        this.setLayout(null);
        this.setBounds(0, 0, 950, 750);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
    if(e.getSource()==btn1)
    {
        this.dispose();
        student_login next4=new student_login();
        next4.setVisible(true);
        next4.toFront();
    }
    if(e.getSource()==btn2)
    {
        this.dispose();
        Teacher_login next4=new Teacher_login();
        next4.setVisible(true);
        next4.toFront();
    }
    }
    public static void main(String[] args)
    {

        Mainpage demo=new Mainpage();
    }
}