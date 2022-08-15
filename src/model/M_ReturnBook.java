
package model;


import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.*;
import javax.swing.JOptionPane;
import view.V_ReturnBook;


public class M_ReturnBook 
{
    public static String issue_date,due_date;
    
    public void insertSearchModel(String book_id,String student_id)
    {          
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from issuebook where bookId='"+book_id+"' and studentId='"+student_id+"'");
            if(rs.next())  
            {   
                issue_date=(rs.getString(3));
                due_date=(rs.getString(4));
//                txt_retun_bookid.setEditable(false);
//                txt_return_studentid.setEditable(false);              
         
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book is not issued to this student");
                setVisible(false);
                new V_ReturnBook().show();
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
    public void insertReturnDataModel(String book_id,String student_id)
    {
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            int i = st.executeUpdate("update issuebook set returnBook='YES' where bookId='"+book_id+"' and studentId='"+student_id+"'");
            if(i>0)
            {
                JOptionPane.showMessageDialog(null,"Book successfully returned");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book id or Student id is wrong");
                setVisible(false);
                new V_ReturnBook().show();
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


