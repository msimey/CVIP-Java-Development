import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Fee extends JFrame{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    // JTextField t1,t2;
    JButton b1;

    public Fee(){}
    public Fee(String s){
        super(s);
    }
    public void setComponents(){
        
        l1 = new JLabel("FEE MANAGEMENT SYSTEM");
        l2 = new JLabel("Name : Harsh Srivastava");
        l3 = new JLabel("Enrollment Number: 12345");
        l4 = new JLabel("Course : BCA");
        l5 = new JLabel("Father : Akash Srivastava");
        l6 = new JLabel("Contact Number: 1234567890");
        l7 = new JLabel("Gender : Male");

        l8 = new JLabel("FEE STRUCTURE");
        l9 = new JLabel("Tuition Fee : 1,52,000");
        l10 = new JLabel("Examination Fee : 8,000");
        l11 = new JLabel("Library Fee : 4,000");
        l12 = new JLabel("Sport Fee : 1,000");
        l13 = new JLabel("Scholarship : 40,000");
        l14 = new JLabel("Total : 1,25,000");
        // t1 = new JTextField();
        // t2 = new JTextField();

        // b1 = new JButton("FEE DETAILS ");
        // b1.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e){
        //         Fee jfee = new Fee("FEE DETAILS");
        //         jfee.setSize(300,300);
        //         jfee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //         jfee.setVisible(true);
        //     }
        // });

        setLayout(null);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma",Font.BOLD,14));
        l8.setForeground(Color.BLACK);
        l14.setFont(new Font("Tahoma",Font.BOLD,14));
        l14.setForeground(Color.BLACK);

        l1.setBounds(50,50,200,20);
        l2.setBounds(50,70,200,20);
        l3.setBounds(50,90,200,20);
        l4.setBounds(50,110,200,20);
        l5.setBounds(50,130,200,20);
        l6.setBounds(50,150,200,20);
        l7.setBounds(50,170,200,20);

        l8.setBounds(350,50,200,20);
        l9.setBounds(350,70,200,20);
        l10.setBounds(350,90,200,20);
        l11.setBounds(350,110,200,20);
        l12.setBounds(350,130,200,20);
        l13.setBounds(350,150,200,20);
        l14.setBounds(350,170,200,20);

        // t1.setBounds(210,80,100,20);
        // t2.setBounds(210,130,100,20);
        // b1.setBounds(50,180,100,20);
        // b1.addActionListener(new Handler()); 
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        // add(t1);
        // add(l3);
        // add(t2);
        // add(b1);
        // add(l4);
    }

    public void setDetails(){

    }

    public static void main(String args[]){
        Fee jf = new Fee("FEE MANAGEMENT SYSTEM.");
        Fee jfee = new Fee("FEE DETAILS");
        jf.setComponents();
        jf.getContentPane().setBackground(Color.LIGHT_GRAY);
        jf.setSize(700,700);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // jfee.setDetails();
    }
}