package model;

import com.sun.glass.ui.Cursor;
import java.sql.*;
import javax.swing.JOptionPane;

public class M_StudentRegistration {

    public void insertStudentDataModel(String studentid, String fname, String lname, String email, String tp, String course, String branch) {
        try {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            int count = st.executeUpdate("insert into student values ('" + studentid + "','" + fname + "','" + lname + "','" + email + "','" + tp + "','" + course + "','" + branch + "')");

            if (count > 0) {
                JOptionPane.showMessageDialog(null, "recod_submitted", "submit", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void insertStudentDeleteModel(String dsid) {
        try {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("Select * from student where studentId = '" + dsid + "'");
            if (rs.next() == true) {
                int value = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);
                if (value == JOptionPane.YES_NO_OPTION) {
                    int count = st.executeUpdate("Delete from student where studentId = '" + dsid + "'");
                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "Sucessfully Deleted");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No records");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void insertStudentSerachModel(String ssid) {
        try {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from student where studentId='" + ssid + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "This student is in system");
                Cursor.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "This student is not in system");
            }
        } catch (IllegalStateException e) {
            System.out.println(" ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insertStudentUpdateModel(String studentid, String fname, String lname, String email, String tp, String course, String branch) {
        try {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            int row_count = st.executeUpdate("update student  set studentid='" + studentid + "', studentFname='" + fname + "', studentLname='" + lname + "', studentEmail='" + email + "', studentTp='" + tp + "', studentCouurse='" + course + "', studentBranch='" + branch + "' where studentId='" + studentid + "'");

            if (row_count > 0) {
                JOptionPane.showMessageDialog(null, "Successfuly updated");
            } else {
                JOptionPane.showMessageDialog(null, "Record not updated");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
