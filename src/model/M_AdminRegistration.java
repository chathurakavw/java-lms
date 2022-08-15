
package model;

import java.sql.Statement;
import javax.swing.JOptionPane;
import view.V_AddimRegistration;

public class M_AdminRegistration 
{
    public void insertAdminDataModel(String user_name,String fname,String lname,String email,String gender,String tp,String pwd,String security,String answer)
    {
        try
        {       
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            
            
                int count = st.executeUpdate("insert into admin values ('"+user_name+"','"+fname+"','"+lname+"','"+email+"','"+gender+"','"+tp+"','"+pwd+"','"+security+"','"+answer+"')");
              
                if(count>0)
                {
                    JOptionPane.showMessageDialog(null,"recod_submitted","submit",JOptionPane.INFORMATION_MESSAGE);
//                    dispose(new V_AddimRegistration());
                    new V_AddimRegistration().show();
                }
                else
                {
                    
                }
            
        }        // if(pwd.equals(cpwd))
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    private void dispose(V_AddimRegistration v_AddimRegistration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
