
package model;


import java.sql.*;
import javax.swing.JOptionPane;
import view.V_Login;


public class M_Forgot 
{
    public static String security;
    
    public void insertSearchModel(String forget)
    {
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from admin where userName='"+forget+"'");
            if(rs.next())  
            {
               security=rs.getString(8);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please write correct user name");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void insertSaveModel(String user_name,String security,String answer,String new_password)
    {
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from admin where userName='"+user_name+"' and answer='"+answer+"'");
            if(rs.next())  
            {
               st.executeUpdate("update admin set adminPassowrd='"+new_password+"' where userName='"+user_name+"' and answer='"+answer+"'");
               JOptionPane.showMessageDialog(null,"Your password is successfully updated");
               
               new V_Login().show();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please write correct User name and Answer");
            }
        }
        catch(IllegalStateException e)
        {
            System.out.println(" ");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
