import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Academic extends  JFrame implements ActionListener
{
    JLabel label1,label2;
    JButton btn1;
    JFrame frame=new JFrame();
    Academic()

    {
//        label1
        label1=new JLabel();
        label1.setText("Academic Calendar");
        label1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
        label1.setBounds(350,10,399,100);
        label1.setForeground(Color.white);
//        img
        label2=new JLabel();
        label2.setIcon(new ImageIcon("academic.jpg"));
        label2.setBounds(259,90,900,600);
        this.add(label2);
//        back
        btn1=new JButton();
        btn1.setText("<= Back");
        btn1.setBounds(800,680,130,50);
        btn1.setBackground(Color.gray);
        btn1.addActionListener(this);
        this.add(btn1);
        this.getContentPane().setBackground(Color.black);
        this.add(label1);
        this.setLayout(null);
        this.setSize(1000,800);
      this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            this.dispose();
            this.toBack();
            setVisible(false);
            new student_home().toFront();
        }
    }

    public static void main(String[] args)
    {
        Academic demo=new Academic();
    }
}