
//import java.awt.HeadlessException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.*;



public class Withdrawl extends JFrame implements ActionListener{

    String pin;
    TextField textfield;
    JButton b1,b2;

    public Withdrawl(String pin) {
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-80, -80, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWL IS 10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        l3.add(label2);

        textfield = new TextField();
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        textfield.setBounds(460,260,300,25);
        textfield.setFont(new Font("Raleway",Font.BOLD,20));
        l3.add(textfield);


        b1= new JButton("WITHDRAW");
        b1.setBounds(700,365,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2= new JButton("BACK");
        b2.setBounds(700,412,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        //setLocationRelativeTo(null);
        setSize(1550,1080);
        setLocation(0,0);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        try {
            String amount = textfield.getText();
            Date date = new Date();
            if(textfield.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to widthdraw");
            }else{
                Conn c= new Conn();
                ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultset.next()){
                    if(resultset.getString("type").equals("Deposit")){
                        balance +=Integer.parseInt(resultset.getString("amount"));
                    }else{
                        balance -=Integer.parseInt(resultset.getString("amount"));
                    }
                }
                if(balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfullly");
                setVisible(false);
                new main_Class(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }else if(e.getSource()==b2){
        setVisible(false);
        new main_Class(pin);
    }
        
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
    
}
