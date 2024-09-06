package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Statement1 extends JFrame implements ActionListener {
    String pin;
    JButton button;
    Statement1(String pin){
        this.pin = pin;
        setLayout(null);
        getContentPane().setBackground(new Color(205, 227, 223));
        setSize(400,600);
        setLocation(400,20);
        setVisible(true);

        JLabel label1 = new JLabel();
        label1.setBounds(20,20,400,300);
        add(label1);

        JLabel label2 = new JLabel("");
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(200,20,200,30);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,30,300,200);
        label3.setFont(new Font("System",Font.BOLD,15));
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,450,200,30);
        add(label4);

        button = new JButton("Exit");
        button.setBounds(20,500,80,25);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.addActionListener(this);
        add(button);

        try{
            Con1 c = new Con1();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_no").substring(0,4)+ "xxxxxxxx"+ resultSet.getString("card_no").substring(12));
            }

            try{
                int balance = 0;
                Con1 c1 = new Con1();
                ResultSet res = c1.statement.executeQuery("Select * from bank where pin =  '"+ pin + "'");
                while(res.next()){
                    label1.setText(label1.getText()+ "<html>" + res.getString("date")+"&nbsp &nbsp &nbsp &nbsp &nbsp;"+res.getString("type")+"&nbsp &nbsp &nbsp &nbsp &nbsp;  "+res.getString("amt")+ "<br><br></html>");
                    if (res.getString("type").equals("deposit")) {
                        balance += Integer.parseInt(res.getString("amt"));
                    } else {
                        balance -= Integer.parseInt(res.getString("amt"));
                    }
                    label4.setText("Your Total Balance is RS : " + balance);
                  }
                }catch (Exception ee){
                ee.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main(pin);
    }

    public static void main(String[] args) {
        new Statement1("");
    }
}
