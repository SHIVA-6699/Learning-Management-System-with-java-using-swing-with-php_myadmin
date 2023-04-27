import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
class skill extends JFrame implements ActionListener {
    JFrame frame4=new JFrame();
    JTextArea text;
    JLabel label1,label2,label3,label4,label5,label6,label7;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,back;
    skill()
    {

//      this.setLocationRelativeTo(null);
        label1=new JLabel();
        label1.setText("SKILL  COURSES");
        label1.setBounds(500,19,600,100);
        label1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,35));
        this.add(label1);
// img1

        btn1=new JButton();

        btn1.setBounds(100,160,300,160);
        btn1.setIcon(new ImageIcon("21.jpg"));
        btn1.addActionListener(this);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn1);
//        label1
        label2=new JLabel();
        label2.setText("Adobe");
        label2.setBounds(200,280,300,160);
        label2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label2);
//img2
        btn2=new JButton();
        btn2.setBounds(500,160,300,160);
        btn2.setIcon(new ImageIcon("22.jpg"));
        btn2.addActionListener(this);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn2);
// label2
        label3=new JLabel();
        label3.setText("Introduction to NLP");
        label3.setBounds(550,280,300,160);
        label3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label3);
//img3
        btn3=new JButton();

        btn3.setBounds(900,160,300,160);
        btn3.setIcon(new ImageIcon("23.jpg"));
        btn3.addActionListener(this);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn3);
//        label3
        label4=new JLabel();
        label4.setText("Hydroponics Technician");
        label4.setBounds(970,280,300,160);
        label4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label4);
//img4
        btn4=new JButton();

        btn4.setBounds(100,400,300,160);
        btn4.setIcon(new ImageIcon("24.jpg"));
        btn4.addActionListener(this);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn4);
//        label4
        label5=new JLabel();
        label5.setText("Drone Piloting");
        label5.setBounds(170,530,300,160);
        label5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));

        this.add(label5);
//        img5
        btn5=new JButton();

        btn5.setBounds(510,400,280,160);
        btn5.setIcon(new ImageIcon("25.jpg"));
        btn5.addActionListener(this);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn5);
// label5
        label6=new JLabel();
        label6.setText("Basket Ball");
        label6.setBounds(590,530,280,160);
        label6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label6);
//   img6
        btn6=new JButton();

        btn6.setBounds(900,400,300,160);
        btn6.setIcon(new ImageIcon("26.jpg"));
        btn6.addActionListener(this);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(btn6);
//label 6
        label7=new JLabel();
        label7.setText("Fabrication");
        label7.setBounds(1000,530,280,160);
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
            String url_open = "https://courseware.cutm.ac.in/courses/adobe-tools-and-illustrations-2/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn2)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/30377/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn3)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/hydroponics-technician/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn4)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/dronepiloting/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn5)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/skill-basket-ball/";
            try {
                Desktop.getDesktop().browse(URI.create(url_open));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource()==btn6)
        {
            String url_open = "https://courseware.cutm.ac.in/courses/skill-fabrication/";
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
        skill demo=new skill();
    }
}