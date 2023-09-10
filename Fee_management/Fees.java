import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

public class Fees extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t2,t3,t4,t5,t6,t7;
    JButton b1;

    public Fees(){}
    public Fees(String s){
        super(s);
    }
    public void setComponents(){
        l1 = new JLabel("Fill in the students' details");
        l2 = new JLabel("Name : ");
        l3 = new JLabel("Enrollment No. : ");
        l4 = new JLabel("Email ID : ");
        l5 = new JLabel("Course : ");
        l6 = new JLabel("Total Fee : ");
        l7 = new JLabel("Paid : ");
        l8 = new JLabel("Balance : ");
        l9 = new JLabel();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        b1 = new JButton("Update Details");

        setLayout(null);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setForeground(Color.BLACK);
        
        l1.setBounds(50,50,200,20);
        l2.setBounds(80,80,150,20);
        t2.setBounds(240,80,150,20);
        l3.setBounds(80,110,150,20);
        t3.setBounds(240,110,150,20);
        l4.setBounds(80,140,150,20);
        t4.setBounds(240,140,150,20);
        l5.setBounds(80,170,150,20);
        t5.setBounds(240,170,150,20);
        l6.setBounds(80,200,150,20);
        t6.setBounds(240,200,150,20);
        l7.setBounds(80,230,150,20);
        t7.setBounds(240,230,150,20);
        l8.setBounds(80,270,150,20);
        l9.setBounds(200,270,250,20);
        b1.setBounds(80,300,150,20);
        
        b1.addActionListener(new Handler()); 
        add(l1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(b1);
        add(l9);
    }

    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            float a = Float.parseFloat(t6.getText());
            float b = Float.parseFloat(t7.getText());
            float bal = a-b;
            String s;
            s = "(Transaction successful for " + b + ")";
            l9.setText(bal + s);
        }
    }

    public static void main(String args[]){
        Fees jf = new Fees("FEE MANAGEMENT");
        jf.setComponents();
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}