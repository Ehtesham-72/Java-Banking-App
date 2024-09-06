package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton j1,j2;
    JLabel textPin1,textPin2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1500, 650);
        add(image);

        JLabel  j =  new JLabel("CHANGE YOUR PIN");
        j.setFont(new Font("System",Font.BOLD,20));
        j.setBackground(Color.black);
        j.setForeground(Color.white);
        j.setBounds(400,150,400,30);
        image.add(j);

        textPin1 = new JLabel("New PIN:");
        textPin1.setFont(new Font("Relaway",Font.BOLD,15));
        textPin1.setBackground(Color.black);
        textPin1.setForeground(Color.white);
        textPin1.setBounds(400,210,200,30);
        image.add(textPin1);

        p1 = new JPasswordField();
        p1.setFont(new Font("Arial",Font.BOLD,15));
        p1.setBackground(Color.CYAN);
        p1.setBounds(530,210,100,20);
        image.add(p1);

        textPin2 = new JLabel("Re-Enter PIN:");
        textPin2.setFont(new Font("Relaway",Font.BOLD,15));
        textPin2.setBackground(Color.black);
        textPin2.setForeground(Color.white);
        textPin2.setBounds(400,245,200,30);
        image.add(textPin2);

        p2 = new JPasswordField();
        p2.setFont(new Font("Arial",Font.BOLD,15));
        p2.setBounds(530,250,100,20);
        p2.setBackground(Color.CYAN);
        image.add(p2);


        j1 = new JButton("CHANGE");
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
        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered Pin does not Match");
                return;
            }
            if(e.getSource() == j1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                } else if (p2.getText().equals(" ")) {
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }
                Con1 c = new Con1();
                String q1 = "update bank    set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login   set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update Signup3  set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"Pin Change Successfully");
                setVisible(false);
                new Main(pin);

            } else if (e.getSource() == j2) {
                new Main(pin);
                setVisible(false);
            }
        }catch (Exception er){
            er.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Pin("");
    }
}
