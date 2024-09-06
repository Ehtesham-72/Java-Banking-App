package banking_system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Con1 {
    Connection connection;
   Statement statement;
    public Con1() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","P@ssw0rd#");
         statement = connection.createStatement();

     }

}

