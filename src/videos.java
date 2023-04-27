
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

class  videos extends JFrame implements ActionListener
{
    JLabel label1,label2,label3,label4;
    JButton btn1,btn2,btn3,btn4;
    JFrame frame=new JFrame();
    videos()
    {
        label1=new JLabel();
        label1.setText("VIDEO LECTURES");
        label1.setBounds(480,60,650,40);
        label1.setFont(new Font(Font.SERIF,Font.BOLD,35));
//        video label

        btn1=new JButton();

        btn1.setBounds(70,200,300,160);
        btn1.setIcon(new ImageIcon("31.png"));
        btn1.addActionListener(this);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn1);
//        label1
        label2=new JLabel();
        label2.setText("PHYSICS");
        label2.setBounds(170,320,300,160);
        label2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label2);
//img2
        btn2=new JButton();
        btn2.setBounds(460,200,300,160);
        btn2.setIcon(new ImageIcon("32.png"));
        btn2.addActionListener(this);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn2);
// label2
        label3=new JLabel();
        label3.setText("CHEMISTRY");
        label3.setBounds(550,320,300,160);
        label3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label3);
//img3
        btn3=new JButton();

        btn3.setBounds(860,200,300,160);
        btn3.setIcon(new ImageIcon("33.png"));
        btn3.addActionListener(this);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn3);
//        label3
        label4=new JLabel();
        label4.setText("MATH");
        label4.setBounds(970,320,300,160);
        label4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label4);
// btn4
        btn4=new JButton();
        btn4.setText("<= BACK");
        btn4.setBounds(550,500,130,60);
        btn4.addActionListener(this);
        btn4.setBackground(Color.gray);

        this.add(btn4);

        this.add(label1);
        this.setLayout(null);
        this.setSize(1250,800);

        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==btn1)
     {
         String url="https://www.youtube.com/watch?v=nb4ovfwqup8";
         try
         {
             Desktop.getDesktop().browse(URI.create(url));
         }
         catch (IOException ex)
         {
             throw new RuntimeException(ex);
         }
     }
     if(e.getSource()==btn2)
     {
         String url="https://www.youtube.com/watch?v=4PedE2KTCww&list=PLVLoWQFkZbhV5bQRjcJc9XDh_ekff6Xb3";
         try
         {
             Desktop.getDesktop().browse(URI.create(url));
         }
         catch (IOException ex)
         {
             throw new RuntimeException(ex);
         }
     }
     if(e.getSource()==btn3)
     {
         String url="https://www.youtube.com/watch?v=HfACrKJ_Y2w";
         try
         {
             Desktop.getDesktop().browse(URI.create(url));
         }
         catch (IOException ex)
         {
             throw new RuntimeException(ex);
         }
     }
     if(e.getSource()==btn4)
     {
      this.dispose();
      this.toBack();
setVisible(false);
      new student_home().toFront();

     }

    }
    public static void main(String[] args)
    {
        videos demo=new videos();
    }
}