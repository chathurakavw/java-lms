
package control;

import javax.swing.JOptionPane;
import model.M_StudentRegistration;


public class C_StudentRegistration 
{
    
    public void insertStudentControl(String studentid,String fname,String lname,String email,String tp,String course,String branch)
    {
        try
        {
            M_StudentRegistration student_registration = new M_StudentRegistration();
            student_registration.insertStudentDataModel(studentid, fname, lname, email, tp, course, branch);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void insetStudentSearchControl(String ssid)
    {
        try
        {
            M_StudentRegistration search = new M_StudentRegistration();
            search.insertStudentSerachModel(ssid);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void insertStudentDeleteControl(String dsid)
    {
        try
        {
            M_StudentRegistration delete = new M_StudentRegistration();
            delete.insertStudentDeleteModel(dsid);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }              
    }
    
    public void insertStudentUpdateControl(String studentid,String fname,String lname,String email,String tp,String course,String branch)
    {   
        try
        {
            M_StudentRegistration update = new M_StudentRegistration();
            update.insertStudentUpdateModel(studentid, fname, lname, email, tp, course, branch);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
