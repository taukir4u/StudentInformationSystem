
import java.sql.*;
import javax.swing.*;
public class DBConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Student", "root", "");
           // JOptionPane.showMessageDialog(null, "ok");
            return conn;
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
            return null;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }    
    }
}
