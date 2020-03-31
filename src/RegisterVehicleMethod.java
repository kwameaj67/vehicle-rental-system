
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K . AGYENIM-BOATENG
 */
public class RegisterVehicleMethod {
    public String Selectregistervehicle(String fullname,String address,String postcode,String phonenumber,String email,int car,int mileage)
    {
        String result="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String sql;
            sql = "insert into registervehicle (fullname,address,postcode,phonenumber,email,car,mileage) values (?,?,?,?,?,?,?)";
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull", "root", null);
             PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, fullname);
                 ps.setString(2, address);
                  ps.setString(3, postcode);
                   ps.setString(4, phonenumber);
                    ps.setString(5, email);
                     ps.setInt(6, car);
                      ps.setInt(7, mileage );
          if (ps.executeUpdate()==1);
        {
            result = "Data Saved Successfully";
        }
                     
        }
        
        catch(Exception ex)
        {}
        return result;
 }
    
}
