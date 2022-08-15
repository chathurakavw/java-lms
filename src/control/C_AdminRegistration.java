
package control;

import model.M_AdminRegistration;


public class C_AdminRegistration 
{
    public void insertAdminControl(String user_name,String fname,String lname,String email,String gender,String tp,String pwd,String security,String answer)
    {
        M_AdminRegistration admin_registration =  new M_AdminRegistration();
        admin_registration.insertAdminDataModel(user_name, fname, lname, email, gender, tp, pwd,security,answer);
    }
}
