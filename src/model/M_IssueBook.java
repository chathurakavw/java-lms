
package model;

import java.sql.*;
import java.text.*;
import java.util.Date;
import javax.swing.JOptionPane;
import view.V_IssueBook;


public class M_IssueBook 
{
    public void insertIssueDataModel(String book_id,String student_id,String issue_date,String due_date,String return_book)
    {               
        try
        {                                  
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from newbook where bookId='"+book_id+"'");
            if(rs.next())  
            {
                ResultSet rsl = st.executeQuery("select * from student where studentId='"+student_id+"'");
                if(rsl.next())
                {
                    st.executeUpdate("insert into issuebook values('"+book_id+"','"+student_id+"','"+issue_date+"','"+due_date+"','"+return_book+"')");
                    JOptionPane.showMessageDialog(null,"Book successfully issued");
                    
                    new V_IssueBook().show();
                }
                else
                {
                    JOptionPane.showConfirmDialog(null,"incorrected student id"); // "incorrected student id"
                }
            }
            else
            {
                JOptionPane.showConfirmDialog(null,"incorrected book id");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }                                         
}
