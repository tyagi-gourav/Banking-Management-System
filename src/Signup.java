// package bank.management.system;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{

    JRadioButton r1,r2,m1,m2,m3;

    JTextField textName,textFName,textEName,textADName,textCName,textPName,textSName;

    JButton next;

    JDateChooser dateChooser;

    Random ran = new Random();

    long f4=(ran.nextLong() % 9000L)+1000L;

    String frst = " " + Math.abs(f4);



    Signup() {

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1= new JLabel("APPLICATIO FORM NO. "+ frst);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2= new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3= new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

        JLabel labelName= new JLabel("Name :");
        labelName.setBounds(100,190,100,30);
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName= new JLabel("Father's Name :");
        labelFName.setBounds(100,240,200,30);
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB= new JLabel("Date of Birth");
        DOB.setBounds(100,340,200,30);
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setBounds(100,290,200,30);
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelE = new JLabel("Email Address :");
        labelE.setBounds(100,390,200,30);
        labelE.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelE);

        textEName = new JTextField();
        textEName.setFont(new Font("Raleway",Font.BOLD,14));
        textEName.setBounds(300,390,400,30);
        add(textEName);

        JLabel labelMS = new JLabel("Martial Status :");
        labelMS.setBounds(100,440,200,30);
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelMS);

        m1=new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

        m3=new JRadioButton("Others");
        m3.setBounds(635,440,100,30);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        

        JLabel labelAD = new JLabel("Address :");
        labelAD.setBounds(100,490,200,30);
        labelAD.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelAD);

        textADName = new JTextField();
        textADName.setFont(new Font("Raleway",Font.BOLD,14));
        textADName.setBounds(300,490,400,30);
        add(textADName);

        JLabel labelC = new JLabel("City Name :");
        labelC.setBounds(100,540,200,30);
        labelC.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelC);

        textCName = new JTextField();
        textCName.setFont(new Font("Raleway",Font.BOLD,14));
        textCName.setBounds(300,540,400,30);
        add(textCName);

        JLabel labelP = new JLabel("Pin Code :");
        labelP.setBounds(100,590,200,30);
        labelP.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelP);

        textPName = new JTextField();
        textPName.setFont(new Font("Raleway",Font.BOLD,14));
        textPName.setBounds(300,590,400,30);
        add(textPName);

        JLabel labelS = new JLabel("State :");
        labelS.setBounds(100,640,200,30);
        labelS.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelS);

        textSName = new JTextField();
        textSName.setFont(new Font("Raleway",Font.BOLD,14));
        textSName.setBounds(300,640,400,30);
        add(textSName);
        

        next= new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));buttonGroup1.add(m1);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,675,80,30);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 950);
        setLocation(30, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = frst;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }
        String email = textEName.getText();
        String marital = null;
        if(m1.isSelected()){
            marital ="Married";
        }else if(m2.isSelected()){
            marital="Unmarried";
        }else if(m3.isSelected()){
            marital = "Other";
        }
        String address = textADName.getText();
        String city =  textCName.getText();
        String pincode = textPName.getText();
        String state = textSName.getText();
        
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn con1 = new Conn();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
        }
//textADName,,textPName,textSName
    public static void main(String[] args) {
        new Signup();
    }
}