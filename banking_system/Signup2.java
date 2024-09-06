package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox dropdown,dropdown1, dropdown2,dropdown3,dropdown4;
    JTextField Pantext,Adhartext;
    JRadioButton j,j1,j2,j3;
    JButton jb;

    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");
        //take form_no.  from 1st Signup page
        this.formno =formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("banking_system/icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 10, 100, 100);
        add(image);





        JLabel form = new JLabel("Form No :-");
        form.setFont(new Font("Raleway",Font.BOLD,18));
        form.setBounds(600,10,100,30);
        add(form);

        JLabel form1 = new JLabel(formno);
        form1.setFont(new Font("Raleway",Font.BOLD,18));
        form1.setBounds(700,10,100,30);
        add(form1);


        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(250,30,100,60);
        add(l1);

        JLabel l2 = new JLabel("Additional Details :");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(250,60,200,60);
        add(l2);

        JLabel labelReligion = new JLabel("Religion: ");
        labelReligion.setBounds(100,150,100,30);
        labelReligion.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelReligion);

        String[] religion = {"","Hinduism", "Muslim", "Sikhism","Christian","Other"};
        dropdown = new JComboBox (religion);
        dropdown.setBackground(new Color(222, 255, 228));
        dropdown.setFont(new Font("Raleway",Font.BOLD,14));
        dropdown.setBounds(350,150,400,30);
        add(dropdown);


        JLabel labelincome = new JLabel("Income: ");
        labelincome.setBounds(100,200,100,30);
        labelincome.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelincome);

        String[] income = {"","Not Specified","50,000","1,00,000","Less than 1,000,000","More than 1,000,000", "Other"};
        dropdown2 = new JComboBox(income);
        dropdown2.setBackground(new Color(222, 255, 228));
        dropdown2.setFont(new Font("Raleway",Font.BOLD,14));
        dropdown2.setBounds(350,200,400,30);
        add(dropdown2);


        JLabel labeleducation = new JLabel("Educational : ");
        labeleducation.setBounds(100,250,150,30);
        labeleducation.setFont(new Font("Raleway",Font.BOLD,18));
        add(labeleducation);

        String[] Educational = {"","Non-Graduate","Graduate","Post-Graduate","Doctorate", "Other"};
        dropdown3 = new JComboBox (Educational);
        dropdown3.setBackground(new Color(222, 255, 228));
        dropdown3.setFont(new Font("Raleway",Font.BOLD,14));
        dropdown3.setBounds(350,250,400,30);
        add(dropdown3);


        JLabel labelOccupation = new JLabel("Occupation : ");
        labelOccupation.setBounds(100,300,150,30);
        labelOccupation.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelOccupation);

        String[] Occupation = {"","Salaried","Self Employed","Business", "Other"};
        dropdown4 = new JComboBox (Occupation);
        dropdown4.setBackground(new Color(222, 255, 228));
        dropdown4.setFont(new Font("Raleway",Font.BOLD,14));
        dropdown4.setBounds(350,300,400,30);
        add(dropdown4);

        JLabel labelPan = new JLabel("PAN Number : ");
        labelPan.setBounds(100,350,150,30);
        labelPan.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelPan);

        Pantext = new JTextField();
        Pantext.setFont(new Font("Realway",Font.BOLD,18));
        Pantext.setBackground(Color.white);
        Pantext.setBounds(350,350,400,30);
        add(Pantext);


        JLabel labelAdhar = new JLabel("Adhar Number : ");
        labelAdhar.setBounds(100,400,150,30);
        labelAdhar.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelAdhar);

        Adhartext = new JTextField();
        Adhartext.setFont(new Font("Realway",Font.BOLD,18));
        Adhartext.setBackground(Color.white);
        Adhartext.setBounds(350,400,400,30);
        add(Adhartext);

        JLabel labelCitizen = new JLabel("Senior Citizen : ");
        labelCitizen.setBounds(100,450,150,30);
        labelCitizen.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelCitizen);
//

         j = new JRadioButton("Yes");
         j.setFont(new Font("Raleway",Font.BOLD,14));
         j.setBackground(new Color(222, 255, 228));
         j.setBounds(350,450,100,30);
         add(j);

        j1 = new JRadioButton("No");
        j1.setFont(new Font("Raleway",Font.BOLD,14));
        j1.setBackground(new Color(222, 255, 228));
        j1.setBounds(500,450,100,30);
        add(j1);

        ButtonGroup bg = new ButtonGroup();
        bg.add(j);
        bg.add(j1);

        JLabel labelExist = new JLabel("Existing Account : ");
        labelExist.setBounds(100,500,200,30);
        labelExist.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelExist);

        j2 = new JRadioButton("Yes");
        j2.setFont(new Font("Raleway",Font.BOLD,14));
        j2.setBackground(new Color(222, 255, 228));
        j2.setBounds(350,500,100,30);
        add(j2);

        j3 = new JRadioButton("No");
        j3.setFont(new Font("Raleway",Font.BOLD,14));
        j3.setBackground(new Color(222, 255, 228));
        j3.setBounds(500,500,100,30);
        j3.addActionListener(this);
        add(j3);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(j2);
        bg1.add(j3);


         jb = new JButton("Next");
        jb.setFont(new Font("Raleway", Font.BOLD, 14));
        jb.setBounds(600, 600, 100, 30);
        jb.setForeground(Color.white);
        jb.setBackground(Color.black);
        jb.addActionListener(this);
        add(jb);



        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formNO = formno;
        String rel = (String) dropdown.getSelectedItem();
        String inc = (String) dropdown2.getSelectedItem();
        String edu = (String) dropdown3.getSelectedItem();
        String occup = (String) dropdown4.getSelectedItem();
        String pan = Pantext.getText();
        String adhar = Adhartext.getText();

        String scitizen = "";
        if(j.isSelected()){
            scitizen = "yes";
        }else if(j1.isSelected()){
            scitizen = "no";
        }

        String existingAc = "";

        if(j2.isSelected()){
            existingAc = "yes";
        }else if(j3.isSelected()){
            existingAc = "no";
        }


        try{
            if(Pantext.getText().equals("") || Adhartext.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the field");

            } else if(dropdown.getSelectedIndex() == 0 ||  dropdown2.getSelectedIndex()==0|| dropdown3.getSelectedIndex()==0|| dropdown4.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,"Please Select all the field");
            } else if (scitizen.equals("")) {
                JOptionPane.showMessageDialog(null,"Please select all the field");
            } else if (existingAc.equals("")) {
                JOptionPane.showMessageDialog(null,"Please select all the field ");

            } else if (!Adhartext.getText().matches("\\d{12}")) {
                // Show error if the Aadhaar number is not exactly 12 digits
                JOptionPane.showMessageDialog(null,"Aadhaar number must be exactly 12 digits.");
            }

            else if (e.getSource() == jb) {
                new Signup3(formno);
                setVisible(false);

            } else {
                Con1 c = new Con1();
                // query to store data on database
                String q1 = "insert into signup2 values('"+formNO+"','"+rel+"','"+inc+"','"+edu+"','"+occup+"','"+pan+"','"+adhar+"','"+scitizen+"','"+existingAc+"')";
                c.statement.executeUpdate(q1);
            }
        }catch (Exception er){
            System.out.println("Error: " + er.getMessage());
            er.printStackTrace();
        }
    }


    public static void main(String[] args) {
         new Signup2(" ");
    }



}
