/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.C_IssueBook;
import java.sql.*;
import java.text.*;
import java.util.Date;
import javax.swing.JOptionPane;
import model.LibraryDatabaseConnection;

/**
 *
 * @author Chathuraka
 */
public class V_IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form V_IssueBook
     */
    public V_IssueBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pkr_issue_dueDate = new org.jdesktop.swingx.JXDatePicker();
        btn_issue = new javax.swing.JButton();
        btn_issue_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_issue_bookid = new javax.swing.JTextField();
        txt_issue_studentid = new javax.swing.JTextField();
        pkr_issue_date = new org.jdesktop.swingx.JXDatePicker();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_bookid = new javax.swing.JLabel();
        lbl_studentid = new javax.swing.JLabel();
        lbl_issue_date = new javax.swing.JLabel();
        lbl_due_date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Book");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/the-librarypng.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 541, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pkr_issue_dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 375, 300, -1));

        btn_issue.setBackground(new java.awt.Color(0, 0, 0));
        btn_issue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_issue.setForeground(new java.awt.Color(255, 255, 255));
        btn_issue.setText("Issue");
        btn_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issueActionPerformed(evt);
            }
        });
        jPanel1.add(btn_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 100, 40));

        btn_issue_close.setBackground(new java.awt.Color(0, 0, 0));
        btn_issue_close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_issue_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_issue_close.setText("Back");
        btn_issue_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issue_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_issue_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 100, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Book id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Student id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Issue date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Due date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 370, 70, -1));

        txt_issue_bookid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_issue_bookidKeyReleased(evt);
            }
        });
        jPanel1.add(txt_issue_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 164, 300, -1));

        txt_issue_studentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_issue_studentidKeyReleased(evt);
            }
        });
        jPanel1.add(txt_issue_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 233, 300, -1));
        jPanel1.add(pkr_issue_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 306, 300, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setText("Issue Book");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("2022 @ Good_Received");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, -1, -1));

        lbl_bookid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_bookid.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 193, 300, 16));

        lbl_studentid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_studentid.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 262, 300, 16));

        lbl_issue_date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_issue_date.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_issue_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 337, 300, 16));

        lbl_due_date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_due_date.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_due_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 403, 300, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 0, 650, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issueActionPerformed

        String book_id, student_id, issue_date, due_date, return_book;

        try {
            int errorCount = 0;
            book_id = txt_issue_bookid.getText();
            student_id = txt_issue_studentid.getText();

            return_book = "NO";

            if (pkr_issue_date.getDate() == null) {
                errorCount++;
                lbl_issue_date.setText("Issue date cannot be empty");
            } else {
                lbl_issue_date.setText("");
            }

            if (pkr_issue_dueDate.getDate() == null) {
                errorCount++;
                lbl_due_date.setText("Due date cannot be empty");
            } else {
                lbl_due_date.setText("");
            }

            if (book_id.equals("")) {
                errorCount++;
                lbl_bookid.setText("Book Id cannot be empty");
            } else {
                lbl_bookid.setText("");
            }

            if (student_id.equals("")) {
                errorCount++;
                lbl_studentid.setText("Student Id cannot be empty");
            } else {
                lbl_studentid.setText("");
            }

            if (errorCount == 0) {

                Date date_of_issue = pkr_issue_date.getDate();
                DateFormat date_format_issue = new SimpleDateFormat("yyyy-MM-dd");
                issue_date = date_format_issue.format(date_of_issue);

                Date date_of_due = pkr_issue_dueDate.getDate();
                DateFormat date_format_due = new SimpleDateFormat("yyyy-MM-dd");
                due_date = date_format_due.format(date_of_due);

                C_IssueBook issue_book = new C_IssueBook();
                issue_book.insertAdminControl(book_id, student_id, issue_date, due_date, return_book);
                setVisible(false);
                new V_DashBoard().setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_issueActionPerformed

    private void btn_issue_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issue_closeActionPerformed

        setVisible(false);
        new V_DashBoard().setVisible(true);
    }//GEN-LAST:event_btn_issue_closeActionPerformed

    private void txt_issue_bookidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_issue_bookidKeyReleased
        if (txt_issue_bookid.equals("")) {
            lbl_bookid.setText("Book Id cannot be empty");
        } else {
            lbl_bookid.setText("");
        }
    }//GEN-LAST:event_txt_issue_bookidKeyReleased

    private void txt_issue_studentidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_issue_studentidKeyReleased
        if (txt_issue_studentid.equals("")) {
            lbl_studentid.setText("Student Id cannot be empty");
        } else {
            lbl_studentid.setText("");
        }
    }//GEN-LAST:event_txt_issue_studentidKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_issue;
    private javax.swing.JButton btn_issue_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bookid;
    private javax.swing.JLabel lbl_due_date;
    private javax.swing.JLabel lbl_issue_date;
    private javax.swing.JLabel lbl_studentid;
    private org.jdesktop.swingx.JXDatePicker pkr_issue_date;
    private org.jdesktop.swingx.JXDatePicker pkr_issue_dueDate;
    private javax.swing.JTextField txt_issue_bookid;
    private javax.swing.JTextField txt_issue_studentid;
    // End of variables declaration//GEN-END:variables
}
