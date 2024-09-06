package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField Tamount;
    JButton j1;
    JButton j2;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1500, 650);
        add(image);

        JLabel  j =  new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        j.setFont(new Font("System",Font.BOLD,15));
        j.setBackground(Color.black);
        j.setForeground(Color.white);
        j.setBounds(450,130,400,30);
        image.add(j);



        Tamount  = new JTextField();
        Tamount.setFont(new Font("Relaway",Font.BOLD,20));
        Tamount.setBackground(Color.CYAN);
        Tamount.setBounds(450,170,300,20);
        image.add(Tamount);

        j1 = new JButton("DEPOSIT");
        j1.setFont(new Font("System",Font.BOLD,14));
        j1.setBackground(Color.CYAN);
        j1.setBounds(720,285,100,25);
        j1.addActionListener(this);
        image.add(j1);

        j2 = new JButton("BACK");
        j2.setFont(new Font("System",Font.BOLD,14));
        j2.setBackground(Color.CYAN);
        j2.setBounds(720,321,100,25);
        j2.addActionListener(this);
        image.add(j2);


        setLayout(null);
        setSize(1500, 700);
        setLocation(0, 0);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String amnt = Tamount.getText();
        Date date = new Date();

        try {
            if(e.getSource() == j1) {
                if(Tamount.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter the amount you want to deposit");
                } else {
                    Con1 con = new Con1();
                    con.statement.executeUpdate("INSERT INTO bank VALUES ('" + pin + "','" + date + "','deposit','" + amnt + "')");
                    JOptionPane.showMessageDialog(null, "Rs " + amnt + " deposited successfully");
                    new Main(pin);
                    setVisible(false);

                }
            } else if (e.getSource() == j2) {
                new Main(pin);
                setVisible(false);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
         new Deposit("");
    }


}
