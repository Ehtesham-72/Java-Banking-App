package banking_system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    // globally declared
    JRadioButton r1, r2, r3, r4, r5;
    JTextField textName, textFname, textEmail, textAddress, textCity, textState, textpin;
   JDateChooser date;


    // generate random Form no.
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);


    Signup() {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel jLabel = new JLabel("APPLICATION FORM    Form no: " + first4);
        jLabel.setBounds(160, 20, 600, 40);
        jLabel.setFont(new Font("Raleway", Font.BOLD, 30));
        add(jLabel);

        JLabel jLabel2 = new JLabel("page 1");
        jLabel2.setFont(new Font("Raleway", Font.BOLD, 22));
        jLabel2.setBounds(330, 70, 600, 30);
        add(jLabel2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 95, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 14));
        labelName.setBounds(100, 190, 200, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);


        JLabel labelFname = new JLabel("Father's Name : ");
        labelFname.setFont(new Font("Raleway", Font.BOLD, 14));
        labelFname.setBounds(100, 240, 200, 50);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);


        JLabel labelGen = new JLabel("Gender :");
        labelGen.setFont(new Font("Raleway", Font.BOLD, 14));
        labelGen.setBounds(100, 290, 200, 30);
        add(labelGen);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("raleway", Font.ITALIC, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);


        r2 = new JRadioButton("Female");
        r2.setFont(new Font("raleway", Font.ITALIC, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(400, 290, 80, 30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("raleway", Font.ITALIC, 14));
        r3.setBackground(new Color(222, 255, 228));
        r3.setBounds(500, 290, 80, 30);
        add(r3);

        // tick once at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);


        JLabel DOB = new JLabel("Date Of Birth : ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 14));
        DOB.setBounds(100, 330, 200, 30);
        add(DOB);

        date = new JDateChooser();
        date.setBackground(new Color(241, 225, 225));
        date.setBounds(300, 330, 400, 30);
        add(date);



        JLabel email = new JLabel("Email address :");
        email.setFont(new Font("Raleway", Font.BOLD, 14));
        email.setBounds(100, 370, 200, 30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 370, 400, 30);
        add(textEmail);


        JLabel Mstatus = new JLabel("Marital Status");
        Mstatus.setFont(new Font("Ralweway", Font.BOLD, 14));
        Mstatus.setBounds(100, 410, 200, 30);
        add(Mstatus);


        r4 = new JRadioButton("Married");
        r4.setFont(new Font("raleway", Font.ITALIC, 14));
        r4.setBackground(new Color(222, 255, 228));
        r4.setBounds(300, 410, 80, 30);
        //r4.addActionListener(this);
        add(r4);

        r5 = new JRadioButton("Unmarried");
        r5.setFont(new Font("raleway", Font.ITALIC, 14));
        r5.setBackground(new Color(222, 255, 228));
        r5.setBounds(400, 410, 100, 30);
        add(r5);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r4);
        bg1.add(r5);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        labelAdd.setBounds(100, 450, 200, 30);
        add(labelAdd);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setBounds(300, 450, 400, 30);
        add(textAddress);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 14));
        labelCity.setBounds(100, 490, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 490, 400, 30);
        add(textCity);


        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 14));
        labelstate.setBounds(100, 540, 200, 30);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 540, 400, 30);
        add(textState);


        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 14));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway", Font.BOLD, 14));
        textpin.setBounds(300, 590, 400, 30);
        add(textpin);

        JButton j = new JButton("Next");
        j.setFont(new Font("Raleway", Font.BOLD, 14));
        j.setBounds(600, 640, 100, 30);
        j.setForeground(Color.white);
        j.setBackground(Color.black);
        j.addActionListener(this);
        add(j);

        // for background color on page
        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String gender = "";

        // bcz of  radio button
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "other";
        }

        Date date_dob = null;
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        try {
            date_dob = inputFormat.parse(dob);
        } catch (ParseException ex) {
           ex.printStackTrace();
        }

        String formattedDate = outputFormat.format(date_dob);

        String email = textEmail.getText();
        String marital = "";

        // bcz of  radio button
        if (r4.isSelected() ) {
            marital = "Married";
        } else if (r5.isSelected()) {
            marital = "unmarried";
        }

        String address = textAddress.getText();
        String city = textCity.getText();
        String state = textState.getText();
        String pin = textpin.getText();


        // print msg if any field is empty

     try {
        if (textName.getText().equals("") || textFname.getText().equals("") || textEmail.getText().equals("")||textAddress.getText().equals("")||textCity.getText().equals("") || textState.getText().equals("")||textpin.getText().equals("")||gender.equals("")||marital.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill all the Field");
        } else if(formattedDate.equals("")){
            JOptionPane.showMessageDialog(null,"Please Select dob");

        } else if (!email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            // show error if the email is not their correct format
            JOptionPane.showMessageDialog(null,"Invalid email address format");
        }
        else if (!textpin.getText().matches("\\d{6}")) {
            JOptionPane.showMessageDialog(null,"Pin must be Exactly 6 digits");
        }
        else {
            Con1 con = new Con1();
            // query to store data on database
            String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + gender + "','" + formattedDate + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + state + "','" + pin + "')";

           con.statement.executeUpdate(q);
            new Signup2(first);
            // close signup page
            setVisible(false);
        }
     }catch(Exception err) {
         err.printStackTrace();
     }
}
    public static void main(String[] args) {
        new Signup();
    }
}
