import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

class assignments extends JFrame implements ActionListener
{

    JLabel label1,label2,label3,label4;
    JButton btn1,btn2,btn3,btn4,btn5;
    JTextField text1,text2;
    JFrame frame=new JFrame();
    assignments()
    {
        label1=new JLabel();
        label1.setText("ASSIGNMENTS");
        label1.setBounds(290,30,400,50);
        label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        this.add(label1);
//        label2
        label2=new JLabel();
        label2.setText("Enter Your Id");
        label2.setBounds(330,130,500,50);
        label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));
        this.add(label2);
//        text1
        text1=new JTextField();
        text1.setBounds(260,200,260,50);
        text1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        text1.setHorizontalAlignment(JTextField.CENTER);
        this.add(text1);
//btn1
        btn1=new JButton();
        btn1.setText("Take Your Assignments");
        btn1.setBounds(300,300,170,50);
        btn1.setBackground(Color.BLUE);
        btn1.setForeground(Color.white);

        btn1.addActionListener(this);
        this.add(btn1);
//back
        btn2=new JButton();
        btn2.setText("<=Back");
        btn2.addActionListener(this);
        btn2.setBounds(325,400,120,40);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        this.add(btn2);

        this.setLayout(null);
        this.setSize(800,600);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==btn2)
      {
          this.dispose();
          this.toBack();
          setVisible(false);
          new student_home().toFront();
      }
      if(e.getSource()==btn1)
      {

          String url_open = "https://courseware.cutm.ac.in/courses/skill-fabrication/";
          try {
              Desktop.getDesktop().browse(URI.create(url_open));
          } catch (IOException ex) {
              throw new RuntimeException(ex);
          }
      }
    }
    public static void main(String[] args) {
        assignments demo=new assignments();
    }
}
