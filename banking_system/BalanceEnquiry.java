package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label;
    JButton b1;

    BalanceEnquiry(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1500, 650);
        add(image);

        JLabel text = new JLabel("YOUR CURRENT BALANCE IS Rs: ");
        text.setFont(new Font("System", Font.BOLD, 20));
        text.setBackground(Color.black);
        text.setForeground(Color.white);
        text.setBounds(470, 130, 400, 30);
        image.add(text);

        label = new JLabel();
        label.setFont(new Font("System", Font.BOLD, 15));
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        label.setBounds(550, 170, 400, 30);
        image.add(label);

        b1 = new JButton("Back");
        b1.setFont(new Font("System", Font.BOLD, 14));
        b1.setBackground(Color.CYAN);
        b1.setBounds(700, 321, 125, 25);
        b1.addActionListener(this);
        image.add(b1);

        int balance = 0;

        try {
            Con1 c = new Con1();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "' ");

            while (resultSet.next()) {
                if (resultSet.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amt"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amt"));
                }
            }
        } catch (Exception er) {
            System.out.println("error :"+ er.getMessage());
            er.printStackTrace();
        }

        label.setText("" + balance);

        setLayout(null);
        setSize(1500, 700);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Main(pin);
    }
    public static void main (String[]args){
            new BalanceEnquiry("");
        }
    }
