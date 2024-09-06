package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    JTextField T_amount;
    JButton b1,b2;
    String pin;
    Withdrawl(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1500, 650);
        add(image);

        JLabel text = new JLabel("MAXIMUM WITHDRAW IS RS. 10,000");
        text.setFont(new Font("System", Font.BOLD, 15));
        text.setBackground(Color.black);
        text.setForeground(Color.white);
        text.setBounds(470, 110, 400, 30);
        image.add(text);

        JLabel j = new JLabel();
        j.setFont(new Font("System", Font.BOLD, 15));
        j.setBackground(Color.black);
        j.setForeground(Color.white);
        j.setBounds(450, 160, 400, 30);
        image.add(j);


        T_amount = new JTextField();
        T_amount.setFont(new Font("Relaway", Font.BOLD, 20));
        T_amount.setBackground(Color.CYAN);
        T_amount.setBounds(450, 190, 300, 20);
        image.add(T_amount);

        b1 = new JButton("WITHDRAW");
        b1.setFont(new Font("System", Font.BOLD, 14));
        b1.setBackground(Color.CYAN);
        b1.setBounds(700, 285, 125, 25);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 14));
        b2.setBackground(Color.CYAN);
        b2.setBounds(700, 321, 125, 25);
        b2.addActionListener(this);
        image.add(b2);


        setLayout(null);
        setSize(1500, 700);
        setLocation(0, 0);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String amount = T_amount.getText();
                Date date = new Date();

                if (T_amount.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to Withdraw ");
                    } else {
                      Con1 c = new Con1();
                      ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "' AND amt = '"+amount+"'");
                      int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amt"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amt"));
                        }
                    }

                    // if user inter max value then show error msg
                    if (balance > Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount +" Withdraw Successfully");
                    setVisible(false);
                    new Main(pin);

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource()==b2){
            setVisible(false);
            new Main(pin);
        }
    }
    public static void main(String[] args) {
        new Withdrawl("");
    }


}
