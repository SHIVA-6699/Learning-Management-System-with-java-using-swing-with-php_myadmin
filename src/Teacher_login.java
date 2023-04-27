import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Teacher_login extends JFrame implements ActionListener
{
    JFrame frame2=new JFrame();
    JLabel label1,label2,label3,label4,label5,label6,label7;
    JTextField text1,text2,text3,text4;
    JButton sinup,signin,back;
    Teacher_login()
    {
        label2= new JLabel();
        Container c=this.getContentPane();
        label2.setIcon(new ImageIcon("login.png"));
        label2.setBounds(230,30,230,200);
        c.add(label2);
//label 2
        label2=new JLabel();
        label2.setText("LOGIN");
        label2.setBounds(240,240,350,90);
        label2.setFont(new Font(Font.MONOSPACED,Font.BOLD,25));
        this.add(label2);

//        label3
        label3=new JLabel();
        label3.setText("EMAIL      :");
        label3.setBounds(100,299,159,80);
        this.add(label3);
//text1
        text1=new JTextField();
        text1.setBounds(180,325,240,30);
        text1.setFont(new Font(Font.MONOSPACED,Font.PLAIN,16));

        this.add(text1);
        // label4
        label4=new JLabel();
        label4.setText("PASSWORD    :");
        label4.setBounds(70,349,159,80);
        this.add(label4);

// text2
        text2=new JTextField();
        text2.setBounds(180,370,240,30);
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setFont(new Font(Font.MONOSPACED,Font.PLAIN,16));
        this.add(text2);

// signup button
        sinup=new JButton();
        sinup.setText("Sign Up");
        sinup.setBounds(220,420,120,45);
        sinup.setBackground(Color.decode("#1e3050"));
        sinup.setForeground(Color.white);
        sinup.addActionListener(this);
        this.add(sinup);

        back=new JButton();
        back.setText("< = BACK");
        back.setBounds(220,710,120,50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        this.add(back);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("*                                                                         TEACHER PAGE");
        this.setLayout(null);
        this.setBounds(0,0,600,850);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==back)
      {
          this.dispose();
          this.toBack();
          setVisible(false);
          new Mainpage().toFront();
      }
      if(e.getSource()==sinup)
      {
          String str3=text1.getText();
          String str4=text2.getText();

          try {
              Class.forName("com.mysql.cj.jdbc.Driver");

              Connection connection = DriverManager.getConnection(
                      "jdbc:mysql://localhost:3306/lmsjava", "root", ""
              );
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery("select * from teacher_login where username='"+str3+"' AND passwords='"+str4+"'");
              if(resultSet.next()==true)
              {
                  JOptionPane.showMessageDialog(frame2,"Successfully Login","Notice",JOptionPane.INFORMATION_MESSAGE);
                  this.dispose();
                  Teacher_home demo=new Teacher_home();
                  demo.setVisible(true);
                  demo.toFront();
              }
              else
              {
                  JOptionPane.showMessageDialog(frame2,"Please Enter Valid Username and Password","Notice",JOptionPane.INFORMATION_MESSAGE);
              }

              connection.close();
          } catch (Exception es) {
              java.lang.System.out.println(es);
          }
      }
    }
    public static void main(String[] args)
    {
        Teacher_login demo=new Teacher_login();
    }
}
