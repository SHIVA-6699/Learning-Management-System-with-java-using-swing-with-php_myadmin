import org.python.util.PythonInterpreter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Teacher_cam extends JFrame implements ActionListener
{
    JButton btn1,btn2;
    JLabel label1,label2;
    JTextField text;
    JFrame fram=new JFrame();
    Teacher_cam()
    {
        label1=new JLabel();
        label1.setText("Create Online Meeting Id");
        label1.setBounds(200,170,500,34);
        label1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,24));


        this.add(label1);
//        lablel2
        label2=new JLabel();
        label2.setText("ONLINE CLASSES");
        label2.setBounds(180,40,400,30);
        label2.setFont(new Font(Font.MONOSPACED,Font.BOLD,35));
        this.add(label2);
        btn1=new JButton();
        btn1.setText("Join Online Meeting");
        btn1.setBounds(220,350,200,40);
        btn1.setBackground(Color.BLUE);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        this.add(btn1);
//        textfield
        text=new JTextField();
        text.setBounds(200,240,250,40);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
//        backbutton
        btn2=new JButton();
        btn2.setText("<= BACK");
        btn2.setBounds(280,450,100,50);
        btn2.setBackground(Color.lightGray);
        btn2.addActionListener(this);

        this.add(btn2);
        this.add(text);
        this.setLayout(null);
        this.setBounds(0,0,699,700);

        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            if(text==null)
            {

                JOptionPane.showMessageDialog(fram,"PLEASE ENTER YOUR ID","message",JOptionPane.INFORMATION_MESSAGE);
            }

            else
            {
                PythonInterpreter python=new PythonInterpreter();
                python.exec("import os;os.system('start microsoft.windows.camera:')");
            }


        }
        if(e.getSource()==btn2)
        {
            this.dispose();
            this.toBack();
            setVisible(false);
            new Teacher_home().toFront();
        }

    }
    public static void main(String[] args) {
        Teacher_cam demo =new Teacher_cam();
    }
}