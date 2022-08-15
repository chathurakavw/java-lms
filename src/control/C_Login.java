package control;

import model.M_Login;

public class C_Login 
{
    public void insertLoginControl(String user_name,String password)
    {
        M_Login library_login = new M_Login();
        library_login.insertLoginDataModel(user_name, password);
    }
}
