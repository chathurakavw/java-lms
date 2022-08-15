package view;

import control.C_RetunBook;
import javax.swing.JOptionPane;
import static model.M_ReturnBook.due_date;
import static model.M_ReturnBook.issue_date;

public class V_ReturnBook extends javax.swing.JFrame {

    public V_ReturnBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_return = new javax.swing.JButton();
        btn_return_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_retun_bookid = new javax.swing.JTextField();
        txt_return_studentid = new javax.swing.JTextField();
        txt_return_issueDate = new javax.swing.JTextField();
        txt_return_dueDate = new javax.swing.JTextField();
        btn_return_search = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_bookid = new javax.swing.JLabel();
        lbl_studentid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Return Book");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/the-librarypng.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_return.setBackground(new java.awt.Color(0, 0, 0));
        btn_return.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_return.setForeground(new java.awt.Color(255, 255, 255));
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        jPanel1.add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 100, 41));

        btn_return_close.setBackground(new java.awt.Color(0, 0, 0));
        btn_return_close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_return_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_return_close.setText("Back");
        btn_return_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_return_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_return_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 100, 41));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Book id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Student id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Issue date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Due date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        txt_retun_bookid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_retun_bookidKeyReleased(evt);
            }
        });
        jPanel1.add(txt_retun_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 320, -1));

        txt_return_studentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_return_studentidKeyReleased(evt);
            }
        });
        jPanel1.add(txt_return_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 320, -1));
        jPanel1.add(txt_return_issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 320, -1));
        jPanel1.add(txt_return_dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 320, -1));

        btn_return_search.setBackground(new java.awt.Color(0, 0, 0));
        btn_return_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_return_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_return_search.setText("Search");
        btn_return_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_return_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_return_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 100, 41));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setText("Return Book");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("2022 @ Good_Received");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, -1));

        lbl_bookid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_bookid.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 187, 320, 16));

        lbl_studentid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_studentid.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 247, 320, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 0, 660, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_return_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_return_searchActionPerformed

        String book_id, student_id;

        try {
            int errorCount = 0;

            book_id = txt_retun_bookid.getText();
            student_id = txt_return_studentid.getText();

            txt_return_issueDate.setText(issue_date);
            txt_return_dueDate.setText(due_date);

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
                C_RetunBook search = new C_RetunBook();
                search.insertSearchControl(book_id, student_id);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_return_searchActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed

        String book_id, student_id;

        try {
            book_id = txt_retun_bookid.getText();
            student_id = txt_return_studentid.getText();

            C_RetunBook rerun_book = new C_RetunBook();
            rerun_book.insertReturnControl(book_id, student_id);
            setVisible(false);
            new V_DashBoard().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_returnActionPerformed

    private void btn_return_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_return_closeActionPerformed
        setVisible(false);
        new V_DashBoard().show();
    }//GEN-LAST:event_btn_return_closeActionPerformed

    private void txt_retun_bookidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_retun_bookidKeyReleased
        if (txt_retun_bookid.equals("")) {
            lbl_bookid.setText("Book Id cannot be empty");
        } else {
            lbl_bookid.setText("");
        }
    }//GEN-LAST:event_txt_retun_bookidKeyReleased

    private void txt_return_studentidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_return_studentidKeyReleased
        if (txt_return_studentid.equals("")) {
            lbl_studentid.setText("Student Id cannot be empty");
        } else {
            lbl_studentid.setText("");
        }
    }//GEN-LAST:event_txt_return_studentidKeyReleased

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
            java.util.logging.Logger.getLogger(V_ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_return_close;
    private javax.swing.JButton btn_return_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bookid;
    private javax.swing.JLabel lbl_studentid;
    private javax.swing.JTextField txt_retun_bookid;
    private javax.swing.JTextField txt_return_dueDate;
    private javax.swing.JTextField txt_return_issueDate;
    private javax.swing.JTextField txt_return_studentid;
    // End of variables declaration//GEN-END:variables
}
