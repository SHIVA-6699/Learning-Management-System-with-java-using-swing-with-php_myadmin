import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Teacher_home extends JFrame implements ActionListener
{

    JLabel label1,label2,label3;
    JButton btn1,btn2,btn3,btn4,btn5;

    Teacher_home()
    {
        JLabel label1=new JLabel();
        label1.setText("TEACHER HOMEPAGE");
        label1.setBounds(400,30,400,100);
        label1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,35));
        label1.setForeground(Color.white);
        this.add(label1);
//        img
        label2=new JLabel();
        label2.setIcon(new ImageIcon("Teacher_home.png"));
        label2.setBounds(300,200,800,420);
        this.add(label2);
//        btn1
        btn1=new JButton();
        btn1.setText("Online Meeting");
        btn1.addActionListener(this);
        this.add(btn1);
        btn1.setBounds(60,400,200,50);
        btn1.setBackground(Color.black);
        btn1.addActionListener(this);
        btn1.setForeground(Color.green);

//btn2
        btn2=new JButton();
        btn2.setText("Mak Sheet");
        btn2.addActionListener(this);
        this.add(btn2);
        btn2.setBounds(490,650,200,50);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.green);
//btn3
        btn3=new JButton();
        btn3.setText("Attendance");
        btn3.addActionListener(this);
        this.add(btn3);
        btn3.setBounds(950,400,200,50);
        btn3.setBackground(Color.black);
        btn3.setForeground(Color.green);

//        btn4
        btn4=new JButton();
        btn4.setText("Pin Change");
        btn4.addActionListener(this);
        this.add(btn4);
        btn4.setBounds(490,140,200,50);
        btn4.setBackground(Color.black);
        btn4.setForeground(Color.green);
//        btn5
        btn5=new JButton();
        btn5.setText("<=Back");
        btn5.setBounds(30,650,100,50);
        btn5.addActionListener(this);
        btn5.setBackground(Color.BLUE);
        btn5.setForeground(Color.white);
        this.add(btn5);

        JFrame frame=new JFrame();
        this.setTitle("*                                                                                                                                    TEACHER_HOME_PAGE                                                     ");
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        this.setBounds(0,0,1209,799);
        this.setVisible(true);
    }
    public  void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==btn4)
        {
            this.dispose();
            pinchange demo=new pinchange();
            demo.setVisible(true);
            demo.toFront();
        }
            if(e.getSource()==btn1)
            {
                this.dispose();
                 Teacher_cam demo=new Teacher_cam();
                demo.setVisible(true);
                demo.toFront();
            }
            if(e.getSource()==btn5)
            {
                this.dispose();
                this.toBack();
                setVisible(false);
                new Mainpage().toFront();
            }
            if(e.getSource()==btn3)
            {
                this.dispose();
                Teacher_attendance_report demo=new Teacher_attendance_report();

                demo.setVisible(true);
                demo.toFront();
            }
    }
    public static void main(String[] args) {
        Teacher_home demo=new Teacher_home();
    }
}