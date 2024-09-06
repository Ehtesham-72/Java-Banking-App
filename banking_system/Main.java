package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Main(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1500, 650);
        add(image);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setFont(new Font("System",Font.BOLD,25));
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        label.setBounds(450,130,500,30);
        image.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System",Font.BOLD,14));
        b1.setBackground(Color.CYAN);
        b1.setBounds(400,215,120,25);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("FAST CASH");
        b2.setFont(new Font("System",Font.BOLD,14));
        b2.setBackground(Color.CYAN);
        b2.setBounds(400,250,120,25);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("PIN CHANGE");
        b3.setFont(new Font("System",Font.BOLD,14));
        b3.setBackground(Color.CYAN);
        b3.setBounds(400,290,120,25);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("CASH WITHDRAWL");
        b4.setFont(new Font("System",Font.BOLD,14));
        b4.setBackground(Color.CYAN);
        b4.setBounds(650,215,170,25);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("MINI STATEMENT");
        b5.setFont(new Font("System",Font.BOLD,14));
        b5.setBackground(Color.CYAN);
        b5.setBounds(650,250,170,25);
        b5.addActionListener(this);
        image.add(b5);


        b6 = new JButton("BALANCE ENQUIRY");
        b6.setFont(new Font("System",Font.BOLD,14));
        b6.setBackground(Color.CYAN);
        b6.setBounds(650,285,170,25);
        b6.addActionListener(this);
        image.add(b6);


        b7 = new JButton("EXIT");
        b7.setFont(new Font("System",Font.BOLD,14));
        b7.setBackground(Color.CYAN);
        b7.setBounds(650,320,170,25);
        b7.addActionListener(this);
        image.add(b7);


        setLayout(null);
        setSize(1500, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                new Deposit(pin);
                setVisible(false);
            } else if (e.getSource() == b7) {
              System.exit(0);
            } else if (e.getSource() == b4) {
                new Withdrawl(pin);
                setVisible(false);
            } else if (e.getSource() == b6) {
                new BalanceEnquiry(pin);
                setVisible(false);
            }else if(e.getSource() == b2){
                new FastCash(pin);
                setVisible(false);
            } else if (e.getSource()==b3) {
                new Pin(pin);
                setVisible(false);
            } else if (e.getSource()==b5) {
                new Statement1(pin);
                setVisible(false);
            }
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
         new Main("");
    }
}
