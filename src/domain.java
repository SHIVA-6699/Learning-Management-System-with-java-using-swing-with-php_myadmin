import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
class domain extends JFrame implements ActionListener {
    JFrame frame4=new JFrame();
    JTextArea text;
    JLabel label1,label2,label3,label4,label5,label6,label7;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,back;
    domain()
    {

//      this.setLocationRelativeTo(null);
        label1=new JLabel();
        label1.setText("DOMAIN  COURSES");
        label1.setBounds(470,19,600,100);
        label1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,35));
        this.add(label1);
// img1

        btn1=new JButton();

        btn1.setBounds(100,160,300,160);
        btn1.setIcon(new ImageIcon("11.png"));
        btn1.addActionListener(this);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn1);
//        label1
        label2=new JLabel();
        label2.setText("Agri Business");
        label2.setBounds(150,280,300,160);
        label2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label2);
//img2
        btn2=new JButton();
        btn2.setBounds(500,160,300,160);
        btn2.setIcon(new ImageIcon("12.png"));
        btn2.addActionListener(this);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn2);
// label2
        label3=new JLabel();
        label3.setText("Auto Mobile Engineering");
        label3.setBounds(530,280,300,160);
        label3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label3);
//img3
        btn3=new JButton();

        btn3.setBounds(900,160,300,160);
        btn3.setIcon(new ImageIcon("13.png"));
        btn3.addActionListener(this);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn3);
//        label3
        label4=new JLabel();
        label4.setText("CNC");
        label4.setBounds(1010,280,300,160);
        label4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label4);
//img4
        btn4=new JButton();

        btn4.setBounds(100,400,300,160);
        btn4.setIcon(new ImageIcon("14.png"));
        btn4.addActionListener(this);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn4);
//        label4
        label5=new JLabel();
        label5.setText("Cyber Security");
        label5.setBounds(170,530,300,160);
        label5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label5);
//        img5
        btn5=new JButton();

        btn5.setBounds(510,400,280,160);
        btn5.setIcon(new ImageIcon("15.png"));
        btn5.addActionListener(this);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn5);
// label5
        label6=new JLabel();
        label6.setText("Food Processing");
        label6.setBounds(560,530,280,160);
        label6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label6);
//   img6
        btn6=new JButton();

        btn6.setBounds(900,400,300,160);
        btn6.setIcon(new ImageIcon("16.png"));
        btn6.addActionListener(this);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn6);
//label 6
        label7=new JLabel();
        label7.setText("Internet Web");
        label7.setBounds(970,530,280,160);
        label7.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label7);
//back button
        back=new JButton();
        back.setText("<= Back");
        back.setBounds(30,680,130,50);
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.black);
        back.addActionListener(this);
        this.add(back);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(0,0,1300,840);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btn1)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/agri-business-management/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn2)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/domain-automobile-engineering/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn3)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/job-role-cnc-operator-programmer/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn4)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/domain-track-cyber-security/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn5)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/food-processing/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn6)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/internet-and-web-technology/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==back)
        {
            this.dispose();
            this.toBack();
            setVisible(false);
            new student_home().toFront();
        }
    }

    public static void main(String[] args) {
        domain demo=new domain();
    }
}