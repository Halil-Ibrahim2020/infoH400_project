
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author halil
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String Driver = "com.mysql.cj.jdbc.Driver";
        String UserName = "student";
        String PassWord = "1234";
        String url= "jdbc:mysql://localhost/projeth400?serverTimezone=Europe/Brussels";
        
       
        
        Connection conn = DriverManager.getConnection(url,UserName,PassWord);
        System.out.println("connected to the database");
        
        PreparedStatement s = conn.prepareStatement("SELECT Name, registration_time,level FROM learner;");
        
        ResultSet rs= s.executeQuery();
        while (rs.next()){
            String Name = rs.getString("Name");
            System.out.println(Name);
            
        }
        rs.close();
        s.close();
        
        
        
    }
    
}
