package oracle;
import java.util.logging.Logger;
import java.sql.*;
import java.util.logging.Level;
public class OracleConnection
{
    public Connection conn;
    public static Statement stmt=null;
    public static String url="jdbc:oracle:sys:@localhost:1521:qlcoffee";
    public static String username="sys";
    public static String password="Oracle123";
    public void setUrl(String url)
    {
        this.url = url;
    }
    public void setUserName(String username)
    {
        this.username=username;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public OracleConnection()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection(url, username, password);
            stmt=conn.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public OracleConnection(String url,String username,String password)
    {
        this.url = url;
        this.username=username;
        this.password=password;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection(url, username, password);
            stmt=conn.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public Connection openConnection()
    {
        try
        {
           if(conn!=null&conn.isClosed()==false)
              return conn;
            conn=DriverManager.getConnection(url, username, password);
            stmt=conn.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }
    public Connection closeConnection()
    {
        try
        {
            if(conn!=null&conn.isClosed()==false)
            {
                conn.close();
                stmt.close();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }
}