//package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;
    Login(){
        super("Bank Managment System");
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100, 100);
        add(image);


        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image i21 = i11.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i31=new ImageIcon(i21);
        JLabel image1=new JLabel(i31);
        image1.setBounds(650,350,100, 100);
        add(image1);


        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);


        button1 =new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 =new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 =new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon i12=new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image i22 = i12.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i32=new ImageIcon(i22);
        JLabel image2=new JLabel(i32);
        image2.setBounds(0,0,850,480);
        add(image2);


        setSize(850,480);
        setLocation(300,150);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            if(e.getSource()==button1){
                Conn c= new Conn();
                String cardno =textField2.getText();
                String pin = passwordField3.getText();
                String q ="select * from login where cardnumber = '"+cardno+"' and pin ='"+pin+"'";
                ResultSet resultset = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }


            }else if(e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if(e.getSource()==button3){
                new Signup();
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Login();
    }
}