import javax.swing.*;
import java.awt.event.*;

public class BMI extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;

    public BMI(){}
    public BMI(String s){
        super(s);
    }
    public void setComponents(){
        l1 = new JLabel("BMI CALCULATOR");
        l2 = new JLabel("Enter your height in cms ");
        l3 = new JLabel("Enter your weight in kgs ");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Calculate");
        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,80,150,20);
        t1.setBounds(210,80,100,20);
        l3.setBounds(50,130,150,20);
        t2.setBounds(210,130,100,20);
        b1.setBounds(50,180,100,20);
        l4.setBounds(50,240,200,20);
        b1.addActionListener(new Handler()); 
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
    }

    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            float a = Float.parseFloat(t1.getText());
            float b = Float.parseFloat(t2.getText());
            float bmi = b/(a*a/10000);
            String s;
            if(bmi <= 18.4) s="(Underweight)";
            else if(bmi>=18.5 && bmi<=24.9) s="(Normal)";
            else if(bmi>=25.0 && bmi<=39.9) s="(Overweight)";
            else s="(Obese)";
            l4.setText("BMI is : "+bmi+" "+s);
        }
    }

    public static void main(String args[]){
        BMI jf = new BMI("BMI CALCULATOR");
        jf.setComponents();
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}