import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
 Connection conn;
 public static Connection ConnecrDb(){
     try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\4th semester\\project\\Hospital_Management_System\\hms.sqlite");
        return conn;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
 }
}