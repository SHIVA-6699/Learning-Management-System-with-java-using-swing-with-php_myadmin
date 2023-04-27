import jnr.ffi.annotations.In;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class student_attendance_check  extends JFrame implements ActionListener
{
    JLabel label1,label2,label3;
    JTextField text;
    JButton btn1,btn2;
    student_attendance_check()
    {
//        label1
        label1=new JLabel();
        label1.setText("ATTENDANCE");
        label1.setBounds(209,50,300,40);
        label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.add(label1);
//        label2
        label2=new JLabel();
        label2.setText("Enter Your ID");
        label2.setBounds(230,150,400,49);
        label2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label2);

//        textfied
        text=new JTextField();
        text.setBounds(170,250,250,40);
        text.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        text.setHorizontalAlignment(JTextField.CENTER);
        this.add(text);
//        back
        btn1=new JButton();
        btn1.setText("Submit");
        btn1.setBounds(250,350,100,40);
        this.add(btn1);
        btn1.setBackground(Color.BLUE);
        btn1.addActionListener(this);
        btn1.setForeground(Color.white);
//        btn2
        btn2=new JButton();
        btn2.setText("<= Back");
        btn2.setBounds(250,450,100,40);
        this.add(btn2);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);

        this.setBounds(0,0,600,700);
        this.setLayout(null);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            System.out.println("....");
            int a= Integer.parseInt(text.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/lmsjava", "root", ""
                );
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select days from teacher_attendance_report where id="+a+";");
                if(resultSet.next())
                {
                    label3=new JLabel();
                    label1.setText("The no of days present "+ Integer.toString(resultSet.getInt(1)));
                    label1.setBounds(140,50,400,40);

                    label3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,23));
                    this.add(label3);
                }
            }
            catch (Exception es)
            {
                System.out.println(es);
            }
        }
        if(e.getSource()==btn2)
        {
            this.dispose();
            this.toBack();
            setVisible(false);
            new student_home().toFront();
        }
    }
    public static void main(String[] args) {
        student_attendance_check demo=new student_attendance_check();
    }
}
