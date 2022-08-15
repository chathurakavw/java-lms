
package control;

import javax.swing.JOptionPane;
import model.M_Forgot;


public class C_Forgot 
{
    public void insertSearchControl(String forget)
    {
        try
        {
            M_Forgot search = new M_Forgot();
            search.insertSearchModel(forget);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void insertSaveControl(String user_name,String security,String answer,String new_password)
    {
        try
        {
            M_Forgot save = new M_Forgot();
            save.insertSaveModel(user_name, security, answer, new_password);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e); 
        }
    }
}
