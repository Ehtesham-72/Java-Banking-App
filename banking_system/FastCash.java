package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends  JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1500, 650);
        add(image);

        JLabel label = new JLabel("SELECT AMOUNT YOU WANT TO WITHDRAW");
        label.setFont(new Font("System",Font.BOLD,18));
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        label.setBounds(410,140,500,30);
        image.add(label);

        b1 = new JButton("Rs. 100");
        b1.setFont(new Font("System",Font.BOLD,14));
        b1.setBackground(Color.CYAN);
        b1.setBounds(400,215,100,25);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs. 1000");
        b2.setFont(new Font("System",Font.BOLD,14));
        b2.setBackground(Color.CYAN);
        b2.setBounds(400,250,100,25);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs. 5000");
        b3.setFont(new Font("System",Font.BOLD,14));
        b3.setBackground(Color.CYAN);
        b3.setBounds(400,290,100,25);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs. 500");
        b4.setFont(new Font("System",Font.BOLD,14));
        b4.setBackground(Color.CYAN);
        b4.setBounds(720,215,100,25);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs. 2000");
        b5.setFont(new Font("System",Font.BOLD,14));
        b5.setBackground(Color.CYAN);
        b5.setBounds(720,250,100,25);
        b5.addActionListener(this);
        image.add(b5);


        b6 = new JButton("Rs. 10000");
        b6.setFont(new Font("System",Font.BOLD,14));
        b6.setBackground(Color.CYAN);
        b6.setBounds(720,285,100,25);
        b6.addActionListener(this);
        image.add(b6);


        b7 = new JButton("Back");
        b7.setFont(new Font("System",Font.BOLD,14));
        b7.setBackground(Color.CYAN);
        b7.setBounds(720,320,100,25);
        b7.addActionListener(this);
        image.add(b7);

        setLayout(null);
        setSize(1500, 700);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b7){
            new Main(pin);
            setVisible(false);

        }else{
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Date date = new Date();
           try{
               Con1 c= new Con1();
               ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin =  '"+ pin + "'");
               int balance = 0;

               while(resultSet.next()) {
                   if (resultSet.getString("type").equals("Deposit")) {
                       balance += Integer.parseInt(resultSet.getString("amt"));
                   } else {
                       balance -= Integer.parseInt(resultSet.getString("amt"));
                   }

                   if (e.getSource() != b7 && balance > Integer.parseInt(amount)) {
                       JOptionPane.showMessageDialog(null, "Insufficient Balance");
                       return;
                   }
               }
               // After withdraw Update the Table
               c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
               JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdraw Successfully");
           }catch (Exception er){
               er.printStackTrace();
           }
           setVisible(false);
           new Main(pin);
        }
    }
    public static void main(String[] args) {
        new FastCash(" ");
    }
}
