import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class student_home extends JFrame implements ActionListener
{
    JFrame frame3=new JFrame();
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    JLabel label1,label2,label3;
    student_home()
    {

        label1=new JLabel();
        label1.setForeground(Color.WHITE);
        label1.setText("STUDENT HOME PAGE");
        label1.setBounds(369,19,399,100);
        label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,35));
        this.add(label1);
//        image
        label2=new JLabel();
        Container p=this.getContentPane();
        label2.setIcon(new ImageIcon("student_home.png"));
        p.add(label2);
        label2.setBounds(390,300,390,180);
//        button1
        btn1=new JButton();
        btn1.setText("Domain Courses");
        btn1.setBounds(70,200,200,50);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.green);
        btn1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        btn1.addActionListener(this);
        this.add(btn1);
//        button2
        btn2=new JButton();
        btn2.setText("Attendance");
        btn2.setBounds(70,370,200,50);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.green);
        btn2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        btn2.addActionListener(this);
        this.add(btn2);
//        button3
        btn3=new JButton();
        btn3.setText("Videos");
        btn3.setBounds(70,540,200,50);
        btn3.setBackground(Color.black);
        btn3.setForeground(Color.green);
        btn3.addActionListener(this);
        btn3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        this.add(btn3);
//        buuton4
        btn4=new JButton();
        btn4.setText("Skill Course");
        btn4.setBounds(480,540,200,50);
        btn4.setBackground(Color.black);
        btn4.setForeground(Color.green);
        btn4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        btn4.addActionListener(this);
        this.add(btn4);
//        buuton5

        btn5=new JButton();
        btn5.setText("Assignments");
        btn5.setBounds(880,540,200,50);
        btn5.setBackground(Color.black);
        btn5.setForeground(Color.green);
        btn5.addActionListener(this);
        btn5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        this.add(btn5);
// button6
        btn6=new JButton();
        btn6.setText("Certificate Courses");
        btn6.setBounds(880,370,200,50);
        btn6.setBackground(Color.black);
        btn6.setForeground(Color.green);
        btn6.addActionListener(this);
        btn6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        this.add(btn6);
//        button7
        btn7=new JButton();
        btn7.setText("Online meetings");
        btn7.setBounds(880,200,200,50);
        btn7.setBackground(Color.black);
        btn7.setForeground(Color.green);
        btn7.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        btn7.addActionListener(this);
        this.add(btn7);

//        button8
        btn8=new JButton();
        btn8.setText("Academic Calendar");
        btn8.setBounds(480,200,200,50);
        btn8.setBackground(Color.black);
        btn8.setForeground(Color.green);
        btn8.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        btn8.addActionListener(this);
        this.add(btn8);
//        back button
        btn9=new JButton();
        btn9.setText("< = Back");
        btn9.setBounds(520,640,120,50);
        btn9.setBackground(Color.decode("#aee9fc"));
        btn9.setForeground(Color.decode("#000000"));
        btn9.addActionListener(this);

        this.add(btn9);





        this.setTitle("*                                                                                                                              STUDENT_HOME_PAGE                                                     ");
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        this.setBounds(0,0,1209,799);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn2)
        {
            this.dispose();
            student_attendance_check demo=new student_attendance_check();
            demo.setVisible(true);
            demo.toFront();
        }
        if(e.getSource()==btn3)
        {
         this.dispose();
          videos demo=new videos();
            demo.setVisible(true);
            demo.toFront();
        }
        if(e.getSource()==btn1)
        {
            this.dispose();
            domain demo=new domain();
            demo.setVisible(true);
            demo.toFront();
        }
        if(e.getSource()==btn5)
        {
            this.dispose();
            assignments demo=new assignments();
            demo.setVisible(true);
            demo.toFront();
        }
        if(e.getSource()==btn4)
        {
            this.dispose();
            skill demo=new skill();
            demo.setVisible(true);
            demo.toFront();
        }
        if(e.getSource()==btn6)
        {
           this.dispose();
           certificate demo=new certificate();
           demo.setVisible(true);
           demo.toFront();
        }
        if(e.getSource()==btn7)
        {
            this.dispose();
            camera demo=new camera();
            demo.setVisible(true);
            demo.toFront();
        }
        if(e.getSource()==btn8)
        {
            this.dispose();
            Academic demo=new Academic();
            demo.setVisible(true);
            demo.toFront();
        }
        if(e.getSource()==btn9)
        {
            this.dispose();
            this.toBack();
            setVisible(false);
            new Mainpage().toFront();
        }
    }
    public static void main(String[] args)
    {
        student_home demo=new student_home();
    }
}