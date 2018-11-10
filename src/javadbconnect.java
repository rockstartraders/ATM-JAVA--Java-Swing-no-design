


import java.sql.*;
import javax.swing.JOptionPane;

public class javadbconnect {
  Connection conn=null;
    
    public static Connection ConnecrDB(){
    try{
      Class.forName("org.sqlite.JDBC");
      Connection conn=DriverManager.getConnection("jdbc:sqlite:C: Enter the Path of the ATM.sqlite \\ add this if bad character error occurs \\");
      return conn;
            
    }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
     }
     return null;
   }
    
}    