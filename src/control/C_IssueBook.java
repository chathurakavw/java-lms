
package control;

import model.M_IssueBook;


public class C_IssueBook
{
    public void insertAdminControl(String book_id,String student_id,String issue_date,String due_date,String return_book)
    {
        M_IssueBook issue_book = new M_IssueBook();
        issue_book.insertIssueDataModel(book_id, student_id, issue_date, due_date, return_book);
    }
    
}
