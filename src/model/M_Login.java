package model;


import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.*;
import javax.swing.*;
import view.V_DashBoard;
import view.V_Login;


public class M_Login 
{
    public void insertLoginDataModel(String user_name,String password)
    {
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from admin where userName='"+user_name+"' and adminPassowrd='"+password+"'");
            if(rs.next())
            {
                
                V_DashBoard dashboard = new V_DashBoard();
                dashboard.setVisible(true);               
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Incorrect username or password");
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
