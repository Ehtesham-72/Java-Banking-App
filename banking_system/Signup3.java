package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton saving,Current,Fixed,Reccuring;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    JButton j , j1 ;


    Signup3(String formno){
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 10, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:-");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(250,30,100,60);
        add(l1);

        JLabel l2 = new JLabel("Account Details :");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(250,60,200,60);
        add(l2);

        JLabel labelAcType = new JLabel("Account Type: ");
        labelAcType.setBounds(100,150,150,30);
        labelAcType.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelAcType);


        JLabel form = new JLabel("Form No :-");
        form.setFont(new Font("Raleway",Font.BOLD,18));
        form.setBounds(600,10,100,30);
        add(form);

        JLabel form1 = new JLabel(formno);
        form1.setFont(new Font("Raleway",Font.BOLD,18));
        form1.setBounds(700,10,100,30);
        add(form1);

         saving = new JRadioButton("Saving Account");
         saving.setBackground(new Color(209, 230, 226));
         saving.setFont(new Font("Raleway",Font.BOLD,16));
         saving.setBounds(100,190,160,30);
         add(saving);

        Current = new JRadioButton("Current Account");
        Current.setBackground(new Color(209, 230, 226));
        Current.setFont(new Font("Raleway",Font.BOLD,16));
        Current.setBounds(100,230,160,30);
        add(Current);

        Fixed = new JRadioButton("Fixed Deposit Account");
        Fixed.setBackground(new Color(209, 230, 226));
        Fixed.setFont(new Font("Raleway",Font.BOLD,16));
        Fixed.setBounds(400,190,200,30);
        add(Fixed);

        Reccuring = new JRadioButton("Reccuring Deposit Account");
        Reccuring.setBackground(new Color(209, 230, 226));
        Reccuring.setFont(new Font("Raleway",Font.BOLD,16));
        Reccuring.setBounds(400,230,200,30);
        add(Reccuring);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(saving);
        bg1.add(Current);
        bg1.add(Fixed);
        bg1.add(Reccuring);


        JLabel cardNo = new JLabel("Card Number: ");
        cardNo.setBounds(100,300,150,30);
        cardNo.setFont(new Font("Raleway",Font.BOLD,18));
        add(cardNo);

        JLabel l = new JLabel("(Your 16-digits card number) ");
        l.setBounds(100,320,250,30);
        l.setFont(new Font("Raleway",Font.BOLD,12));
        add(l);

        JLabel Number = new JLabel("XXXX-XXXX-XXXX-4148 ");
        Number.setBounds(370,300,250,30);
        Number.setFont(new Font("Raleway",Font.BOLD,18));
        add(Number);


        JLabel text = new JLabel("it would be appear on ATM card/Cheque Book and Statement");
        text.setBounds(370,320,450,30);
        text.setFont(new Font("Raleway",Font.BOLD,12));
        add(text);


        JLabel pin = new JLabel("PIN :");
        pin.setBounds(100,370,50,30);
        pin.setFont(new Font("Raleway",Font.BOLD,18));
        add(pin);

        JLabel pinNo = new JLabel("XXXX");
        pinNo.setBounds(370,370,50,30);
        pinNo.setFont(new Font("Raleway",Font.BOLD,18));
        add(pinNo);

        JLabel text1 = new JLabel("(4-digit password)");
        text1.setBounds(100,385,150,30);
        text1.setFont(new Font("Raleway",Font.BOLD,12));
        add(text1);

        JLabel text2 = new JLabel("Service Required :");
        text2.setBounds(100,450,200,30);
        text2.setFont(new Font("Raleway",Font.BOLD,18));
        add(text2);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(209, 230, 226));
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBounds(100,480,200,30);
        add(c1);

        c2 = new JCheckBox("Mobile Banking");
        c2.setBackground(new Color(209, 230, 226));
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBounds(100,520,200,30);
        add(c2);

        c3 = new JCheckBox("Cheque Book");
        c3.setBackground(new Color(209, 230, 226));
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBounds(100,560,200,30);
        add(c3);

        c4 = new JCheckBox("Internet Banking");
        c4.setBackground(new Color(209, 230, 226));
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBounds(400,480,200,30);
        add(c4);

        c5 = new JCheckBox("Email Alerts");
        c5.setBackground(new Color(209, 230, 226));
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBounds(400,520,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(209, 230, 226));
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBounds(400,560,200,30);
        add(c6);

        c7 = new JCheckBox("I hereby declares that the above entered details correct the best of my Knowledge.");
        c7.setBackground(new Color(209, 230, 226));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,600,700,30);
        add(c7);


        j = new JButton("Submit");
        j.setBackground(Color.black);
        j.setForeground(Color.white);
        j.setFont(new Font("Raleway",Font.BOLD,15));
        j.setBounds(500,650,90,30);
        j.addActionListener(this);
        add(j);

         j1 = new JButton("Cancel");
        j1.setBackground(Color.black);
        j1.setForeground(Color.white);
        j1.setFont(new Font("Raleway",Font.BOLD,15));
        j1.setBounds(300,650,90,30);
        j1.addActionListener(this);
        add(j1);

        getContentPane().setBackground(new Color(209, 230, 226));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String Ac_type = "";
        if (saving.isSelected()) {
            Ac_type = "Saving Account";
        } else if (Current.isSelected()) {
            Ac_type = "Current Account";
        } else if (Fixed.isSelected()) {
            Ac_type = " Fixed Deposit Account";
        } else if (Reccuring.isSelected()) {
            Ac_type = "Reccuring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = ""+ Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = ""+ Math.abs(first3);

        String Service = "";
        if (c1.isSelected()) {
            Service = "ATM CARD";
        } else if (c2.isSelected()) {
            Service = "Mobile Banking";
        } else if (c3.isSelected()) {
            Service = "Cheque Book";
        } else if (c4.isSelected()) {
            Service = "Internet Banking";
        } else if (c5.isSelected()) {
            Service = "Email Alerts";
        } else if (c6.isSelected()) {
            Service = "E-Statement";
        } else if (c7.isSelected()) {
            Service = "I hereby declares that the above entered details correct the best of my Knowledge.";
        }

        try {
           if(e.getSource()==j){
               if(Ac_type.equals("")){
                   JOptionPane.showMessageDialog(null,"Tick all Field");
               }else {
                   Con1 c = new Con1();
                   String q = "insert into signup3 values('"+formno+"','"+Ac_type+"','"+cardno+"','"+pin+"','"+Service+"')";
                   String q1 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                   c.statement.executeUpdate(q);
                   c.statement.executeUpdate(q1);

//                   new Deposit(pin);
//                   setVisible(false);
                   new Login();
                   setVisible(false);
               }
           } else if (e.getSource()==j1) {
               System.exit(0);
           }

        } catch (Exception ex) {
            ex.getMessage();
           ex.printStackTrace();
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
       new Signup3("");
    }


}
