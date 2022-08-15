package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class LibraryDatabaseConnection 
{
    private static Connection con;
    
    public static Connection createConnection()
    {
        try
        {
        String path = "jdbc:mysql://localhost:3306/new"; // jdbc:mysql://localhost:3306/dse211p
        con = DriverManager.getConnection(path,"root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return con;
    }
}
