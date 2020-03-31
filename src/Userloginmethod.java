


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K . AGYENIM-BOATENG
 */
public class Userloginmethod {
  // public static ArrayList<userlogin> userlog=new ArrayList();
    public String InsertUserlogin(String username,String userpassword) 
    {
     String result="";   
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
            
            String sql;
            sql = " insert into userlogintb (username,userpassword) values (?,?)";
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull", "root", null);
       // we create an object PreparedStatement to get and talk to  the database
      PreparedStatement ps = con.prepareStatement(sql);
        // we set  a parameter and indicate the positioning
       ps.setString(1, username);
       ps.setString(2, userpassword);
       //   ps.executeUpdate(); //helps to save the data in the datatbase.
        if (ps.executeUpdate()==1);
        {
            result = "Data Saved Successfully";
        }
        
     }
     catch(Exception ex)
     {
         result=ex.getMessage();
     }
                return result;
        }

    
    
}
