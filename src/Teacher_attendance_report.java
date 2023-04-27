import javax.swing.*;
import javax.swing.plaf.metal.MetalCheckBoxIcon;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Teacher_attendance_report extends JFrame implements ActionListener {
    JTextField text;
    JButton btn1,btn2;
    static  int hari=0,shiva=0,sanju=0;

    JLabel label1,label2,label3,label4,label5,label6,label7,label8;
    JCheckBox check1,check2,check3;
    int count=0;
    Teacher_attendance_report()
    {

//        label1
        label1=new JLabel();
        label1.setText("ATTENDANCE PAGE");
        label1.setBounds(250,40,400,40);
        label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        this.add(label1);
//        label2
        label2=new JLabel();
        label2.setText("Student Name");
        label2.setBounds(150,140,400,40);
        label2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label2);
//        label3
        label3=new JLabel();
        label3.setText("Status");
        label3.setBounds(550,140,400,40);
        label3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label3);

//        name1
        label4=new JLabel();
        label4.setText("Hari");
        label4.setBounds(220,240,400,40);
        label4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        this.add(label4);
//        check
            check1=new JCheckBox();
            check1.setBounds(550,240,400,40);
            check1.setIcon (new MetalCheckBoxIcon() {
                protected int getControlSize() { return 20; }
            });

            this.add(check1);
        check1.addItemListener(new ItemListener() {
                                   @Override
                                   public void itemStateChanged(ItemEvent e) {
                                       if(e.getStateChange()==1)
                                       {
                                       hari++;
                                       count++;
                                       }
                               }});


//        database
        check1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1)
                {
                    hari++;
                    count++;
                    int day1 =0,day2=hari;
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/lmsjava", "root", ""
                        );
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery("select days from teacher_attendance_report where student_name='hari';");
                        while(resultSet.next())
                        {
                            day1=(resultSet.getInt(1));
                        }
                        day2+=day1;
                        System.out.println(day2);
                        statement.execute("update teacher_attendance_report set days="+day2+" where student_name='hari';");
                        connection.close();
                    } catch (Exception es) {
                        java.lang.System.out.println(es);
                    }
                }
//                else
//                {
//
//                    try {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
//
//                        Connection connection = DriverManager.getConnection(
//                                "jdbc:mysql://localhost:3306/lmsjava", "root", ""
//                        );
//                        Statement statement = connection.createStatement();
//                        statement.executeUpdate("update teacher_attendance_report set days ="+sanju+" where student_name='sanju';");
//                        connection.close();
//                    } catch (Exception es) {
//                        java.lang.System.out.println(es);
//                    }
//                }
            }});


//name 2

        label5=new JLabel();
        label5.setText("Shiva");
        label5.setBounds(220,340,400,40);
        label5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        this.add(label5);
//        check
        check2=new JCheckBox();
        check2.setBounds(550,340,400,40);
        check2.setIcon (new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        this.add(check2);
//        add listner
        check2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1)
                {
                    shiva++;
                    count++;
                }
            }});
//        database2
        check2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1)
                {
                    shiva++;
                    count++;
                    int day1 =0,day2=shiva;
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/lmsjava", "root", ""
                        );
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery("select days from teacher_attendance_report where student_name='shiva';");
                        while(resultSet.next())
                        {
                            day1=(resultSet.getInt(1));
                        }
                        day2+=day1;
                        System.out.println(day2);
                        statement.execute("update teacher_attendance_report set days="+day2+" where student_name='shiva';");
                        connection.close();
                    } catch (Exception es) {
                        java.lang.System.out.println(es);
                    }
                }
//                else
//                {
//
//                    try {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
//
//                        Connection connection = DriverManager.getConnection(
//                                "jdbc:mysql://localhost:3306/lmsjava", "root", ""
//                        );
//                        Statement statement = connection.createStatement();
//                        statement.executeUpdate("update teacher_attendance_report set days ="+sanju+" where student_name='sanju';");
//                        connection.close();
//                    } catch (Exception es) {
//                        java.lang.System.out.println(es);
//                    }
//                }
            }});

//name 3

        label6=new JLabel();
        label6.setText("Sanju");
        label6.setBounds(220,440,400,40);
        label6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        this.add(label6);
//        check
        check3=new JCheckBox();
        check3.setBounds(550,440,400,40);
        check3.setIcon (new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        this.add(check3);
//        add itemlistner
        check3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1)
                {
                    sanju++;
                    count++;
                    int day1 =0,day2=sanju;
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/lmsjava", "root", ""
                        );
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery("select days from teacher_attendance_report where student_name='sanju';");
                        while(resultSet.next())
                        {
                            day1=(resultSet.getInt(1));
                        }
                        day2+=day1;
                        System.out.println(day2);
                        statement.execute("update teacher_attendance_report set days="+day2+" where student_name='sanju';");
                        connection.close();
                    } catch (Exception es) {
                        java.lang.System.out.println(es);
                    }
                }
//                else
//                {
//
//                    try {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
//
//                        Connection connection = DriverManager.getConnection(
//                                "jdbc:mysql://localhost:3306/lmsjava", "root", ""
//                        );
//                        Statement statement = connection.createStatement();
//                        statement.executeUpdate("update teacher_attendance_report set days ="+sanju+" where student_name='sanju';");
//                        connection.close();
//                    } catch (Exception es) {
//                        java.lang.System.out.println(es);
//                    }
//                }
            }});


//submit
        btn2=new JButton();
        btn2.setText("Submit");
        btn2.addActionListener(this);
        btn2.setBounds(350,600,100,40);
        btn2.setForeground(Color.white);
        btn2.setBackground(Color.BLUE);
        this.add(btn2);
//back
        btn1=new JButton();
        btn1.setText("<=Back");
        btn1.setBounds(50,700,100,40);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);



        this.add(btn1);

        this.setLayout(null);

        this.setSize(800,800);
     this.setVisible(true);
    }
  public void actionPerformed(ActionEvent e)
  {
      if(e.getSource()==btn1)
      {
          this.dispose();
          this.toBack();
          setVisible(false);
          new Teacher_home().toFront();
      }
      if(e.getSource()==btn2)
      {
           JOptionPane.showMessageDialog(this,"The of students present "+count+"","Notic",JOptionPane.INFORMATION_MESSAGE);
      }

  }
    public static void main(String[] args)
    {
        Teacher_attendance_report demo=new Teacher_attendance_report();
    }
}


