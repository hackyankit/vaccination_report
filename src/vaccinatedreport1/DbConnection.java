
package vaccinatedreport1;
import java.sql.*;
import javax.swing.*;

public class DbConnection
{
    Connection conn=null;
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite//Vaccination_Report.db");
            System.out.println("connected");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}