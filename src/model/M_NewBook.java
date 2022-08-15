
package model;

import com.sun.glass.ui.Cursor;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class M_NewBook 
{
    public void insertNewBookDataModel(String book_id,String book_name,String publisher,String price,String publish_year,String categories)
    {
        try
        {   
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            int count = st.executeUpdate("insert into newBook values ('"+book_id+"','"+book_name+"','"+publisher+"','"+price+"','"+publish_year+"','"+categories+"')");
              
                if(count>0)
                {
                    JOptionPane.showMessageDialog(null,"recod_submitted","submit",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Empty data.","submit",JOptionPane.INFORMATION_MESSAGE);
                }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
                
    }
    
    public void insertBookDeleteModel(String bid)
    {
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("Select * from newbook where bookId = '"+bid+"'");
              if(rs.next()==true)
              {
                int value = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete","Delete",JOptionPane.YES_NO_OPTION);
                if(value == JOptionPane.YES_NO_OPTION)
                {           
                    int count = st.executeUpdate("Delete from student where studentId = '"+bid+"'");
                    if(count>0)
                    { 
                        JOptionPane.showMessageDialog(null,"Sucessfully Deleted");
                    }
                }
              }
              else
              {
                  JOptionPane.showMessageDialog(null,"No records");
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
    
    public void insertBookSearchModel(String bid)
    {
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from newbook where bookId='"+bid+"'");
            if(rs.next())  
            {
               JOptionPane.showMessageDialog(null,"This book is in system"); 
               Cursor.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"This book is not in system");              
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
    
    public void insertBookUpdateModel(String bookid,String bookName,String publisher,String price,String publishYear,String categories)
    {
        try
        {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            int row_count = st.executeUpdate("update newbook  set bookId='"+bookid+"', bookName='"+bookName+"', publisher='"+publisher+"', price='"+price+"', publishYear='"+publishYear+"', categories='"+categories+"' where bookId='"+bookid+"'");

            if(row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Successfuly updated");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Record not updated");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
