/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author vyank
 */
public class ConnectionP {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/resultmanagementdb","root","1234");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    public static void main (String args[]){
        ConnectionP con = new ConnectionP();
        Connection c = con.getcon();
    }
}  
  