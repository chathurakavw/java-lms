
package control;

import javax.swing.JOptionPane;
import model.M_NewBook;


public class C_NewBook 
{
    public void insertNewBookControl(String book_id,String book_name,String publisher,String price,String publish_year,String categories)
    {
        try
        {
            M_NewBook new_book = new M_NewBook();
            new_book.insertNewBookDataModel(book_id, book_name, publisher, price, publish_year, categories);
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
    
    public void insertBookDeleteControl(String bid)
    {
        try
        {
            M_NewBook delete = new M_NewBook();
            delete.insertBookDeleteModel(bid);
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
    
    public void insertBookSearchControl(String bid)
    {
        try
        {
            M_NewBook search = new M_NewBook();
            search.insertBookSearchModel(bid);
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
    
    public void insertBookUpdateControl(String bookid,String bookName,String publisher,String price,String publishYear,String categories)
    {
        try
        {
        M_NewBook update = new M_NewBook();
        update.insertBookUpdateModel(bookid, bookName, publisher, price, publishYear, categories);
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
