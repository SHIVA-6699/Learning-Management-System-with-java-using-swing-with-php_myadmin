import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class student_login extends JFrame implements ActionListener
{
    JFrame frame2=new JFrame();
    JLabel label1,label2,label3,label4,label5,label6,label7;
    JTextField text1,text2,text3,text4;
    JButton sinup,signin,back;
    student_login()
    {
        label2= new JLabel();
        Container c=this.getContentPane();
        label2.setIcon(new ImageIcon("login.png"));
        label2.setBounds(230,30,230,200);
        c.add(label2);
//label 2
        label2=new JLabel();
        label2.setText("******  SIGN UP ******");
        label2.setBounds(100,240,350,90);
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


//  signin sectionn


//label 2
        label5=new JLabel();
        label5.setText("******  SIGN IN ******");
        label5.setBounds(100,450,350,90);
        label5.setFont(new Font(Font.MONOSPACED,Font.BOLD,25));
        this.add(label5);

//        label3
        label6=new JLabel();
        label6.setText("EMAIL      :");
        label6.setBounds(100,500,159,80);
        this.add(label6);
//text1
        text3=new JTextField();
        text3.setBounds(180,530,240,30);
        text3.setFont(new Font(Font.MONOSPACED,Font.PLAIN,16));
        this.add(text3);
        // label4
        label7=new JLabel();
        label7.setText("PASSWORD    :");
        label7.setBounds(70,560,159,80);

        this.add(label7);

// text2
        text4=new JTextField();
        text4.setBounds(180,575,240,30);
        text4.setHorizontalAlignment(JTextField.CENTER);
        text4.setFont(new Font(Font.MONOSPACED,Font.PLAIN,16));
        this.add(text4);
// signin
        signin=new JButton();
        signin.setText("Sign In");
        signin.setBackground(Color.decode("#1e3050"));
        signin.setForeground(Color.white);
        signin.addActionListener(this);
        signin.setBounds(220,635,120,45);
        this.add(signin);


// back button

        back=new JButton();
        back.setText("< = BACK");
        back.setBounds(220,710,120,50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        this.add(back);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("*                                                                         STUDENT PAGE");
        this.setLayout(null);
        this.setBounds(0,0,600,850);
        this.setVisible(true);
    }
    public  void actionPerformed(ActionEvent e)
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
         String str1=text1.getText();
         String str2=text2.getText();

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");

             Connection connection = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/lmsjava", "root", ""
             );
             Statement statement = connection.createStatement();
              statement.execute("insert into student_login(username,passwords) values ('"+str1+"','"+str2+"');");
             JOptionPane.showMessageDialog(frame2,"Successfully Registered","Notice",JOptionPane.INFORMATION_MESSAGE);
             connection.close();
         } catch (Exception es) {
             java.lang.System.out.println(es);
         }
     }
     if(e.getSource()==signin)
     {
         String str3=text3.getText();
         String str4=text4.getText();

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");

             Connection connection = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/lmsjava", "root", ""
             );
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from student_login where username='"+str3+"' AND passwords='"+str4+"'");
             if(resultSet.next()==true)
             {
                 JOptionPane.showMessageDialog(frame2,"Successfully Login","Notice",JOptionPane.INFORMATION_MESSAGE);
                 this.dispose();
                 student_home demo=new student_home();
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

    public static void main(String[] args) {
        student_login demo=new student_login();
    }
}