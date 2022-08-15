
package control;

import javax.swing.JOptionPane;
import model.M_ReturnBook;


public class C_RetunBook 
{
    public void insertSearchControl(String book_id,String student_id)
    {
        try
        {
            M_ReturnBook search = new M_ReturnBook();
            search.insertSearchModel(book_id, student_id);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void insertReturnControl(String book_id,String student_id)
    {
        try
        {
            M_ReturnBook return_book = new M_ReturnBook();
            return_book.insertReturnDataModel(book_id, student_id);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

}
