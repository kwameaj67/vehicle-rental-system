
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K . AGYENIM-BOATENG
 */
public class CarMethod {
    private String result;
    public static HashMap<String, Integer> carMap = new HashMap();
    public String Selectcars()
    {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
            String sql;
            sql = "select * from cars";
// we need a connection to connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull", "root", null);
       // we create an object PreparedStatement to get and talk to  the database
       PreparedStatement ps = con.prepareStatement(sql);
       // result set sets data into the database
       ResultSet rs=ps.executeQuery();
         while (rs.next())
       {
           carMap.put(rs.getString(2), rs.getInt(1));
       }
        }
        
        catch(Exception ex)
        {
        result = ex.getMessage();
        }
            return result;
    }
}
