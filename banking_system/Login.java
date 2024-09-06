package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JLabel jlabel,jLabel2,jLabel3;

    JTextField jTextField2;
    JPasswordField jPasswordField3;
    JButton jButton1 , jButton2,jButton3;

    Login(){
        super("Bank Management System");
        setLayout(null);
        setSize(850,480);
        setLocation(300,200);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(360,10,100,100);
        add(image);

        ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/card.png"));
        Image bg = background.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon backgraoundbg = new ImageIcon(bg);
        JLabel imagebg = new JLabel(backgraoundbg);
        imagebg.setBounds(630,350,100,100);
        add(imagebg);

        jlabel = new JLabel("WELCOME TO ATM");
        jlabel.setForeground(Color.white);
        jlabel.setFont(new Font("AvantGarde" ,Font.BOLD,30));
        jlabel.setBounds(280,80,450,120);
        add(jlabel);

        jLabel2 = new JLabel("CARD NO.");
        jLabel2.setForeground(Color.white);
        jLabel2.setFont(new Font("Ralway",Font.BOLD,28));
        jLabel2.setBounds(150,190,375,30);
        add(jLabel2);

        jTextField2 = new JTextField(15);
        jTextField2.setBounds(325,190,230,30);
        add(jTextField2);

        jLabel3 = new JLabel("PIN");
        jLabel3.setForeground(Color.white);
        jLabel3.setFont(new Font("Ralway",Font.BOLD,28));
        jLabel3.setBounds(150,250,375,30);
        add(jLabel3);

        jPasswordField3 = new JPasswordField(15);
        jPasswordField3.setBounds(325,250,230,30);
        jPasswordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(jPasswordField3);


        jButton1 = new JButton("SIGN UP");
        jButton1.setBounds(325,300,100,30);
        jButton1.setForeground(Color.white);
        jButton1.setFont(new Font("Arial",Font.BOLD,14));
        jButton1.setBackground(Color.black);
        jButton1.addActionListener(this);
        add(jButton1);

        jButton2 = new JButton("SIGN IN");
        jButton2.setBounds(460,300,100,30);
        jButton2.setForeground(Color.white);
        jButton2.setFont(new Font("Arial",Font.BOLD,14));
        jButton2.setBackground(Color.black);
        jButton2.addActionListener(this);
        add(jButton2);

        jButton3= new JButton("CLEAR");
        jButton3.setFont(new Font("Arial",Font.BOLD,14));
        jButton3.setBounds(325,350,230,26);
        jButton3.setForeground(Color.white);
        jButton3.setBackground(Color.black);
        jButton3.addActionListener(this);
        add(jButton3);

        ImageIcon background2 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/backbg.png"));
        Image bg2 = background2.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon backgraoundbg2 = new ImageIcon(bg2);
        JLabel imagebg2 = new JLabel(backgraoundbg2);
        imagebg2.setBounds(0,0,850,480);
        add(imagebg2);
        setVisible(true);

        //Exit  execution-------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==jButton1){
                new Signup();
                setVisible(false);
            } else if (e.getSource() == jButton2){
                Con1 c = new Con1();
                String cardno = jTextField2.getText();
                String pin = jPasswordField3.getText();
                String q = "SELECT * FROM login WHERE card_no = '" +cardno+ "' AND pin = '"+ pin +"'";

                ResultSet resultSet = c.statement.executeQuery(q);
                    if(resultSet.next()){
                       new Main(pin);
                        setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect Card no. / Pin ");
                    }
            } else if (e.getSource()==jButton3){
                jTextField2.setText("");
                jPasswordField3.setText("");
            }
        }catch (Exception er){
            System.out.println(er.getMessage());
            er.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}