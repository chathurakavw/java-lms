package view;

import control.C_StudentRegistration;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.LibraryDatabaseConnection;

public class V_StudentRegistration extends javax.swing.JFrame {

    public V_StudentRegistration() {
        initComponents();
        autoId();
    }

    public void autoId() {
        try {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select Max(studentId) from student");
            rs.next();
            rs.getString("Max(studentId)");

            if (rs.getString("Max(studentId)") == null) {
                txt_sid.setText("S0001");
            } else {
                Long id = Long.parseLong(rs.getString("Max(studentId)").substring(2, rs.getString("Max(studentId)").length()));
                id++;
                txt_sid.setText("S0" + String.format("%03d", id));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_student_back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_sid = new javax.swing.JTextField();
        txt_student_fname = new javax.swing.JTextField();
        txt_student_lname = new javax.swing.JTextField();
        txt_student_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_student_mobile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmb_courseName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmb_branchName = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btn_student_save = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_student_clear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_fname = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        lbl_mobile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/the-librarypng.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Course name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 425, -1, -1));

        btn_student_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_student_back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_student_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_student_back.setText("Back");
        btn_student_back.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_student_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_student_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_student_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 100, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Branch name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 492, -1, -1));
        jPanel1.add(txt_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 111, 310, -1));

        txt_student_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_student_fnameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_student_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 169, 310, -1));

        txt_student_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_student_lnameActionPerformed(evt);
            }
        });
        txt_student_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_student_lnameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_student_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 230, 310, -1));

        txt_student_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_student_emailKeyReleased(evt);
            }
        });
        jPanel1.add(txt_student_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 294, 310, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Student id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 109, -1, -1));

        txt_student_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_student_mobileActionPerformed(evt);
            }
        });
        txt_student_mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_student_mobileKeyReleased(evt);
            }
        });
        jPanel1.add(txt_student_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 363, 310, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("First name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 167, -1, -1));

        cmb_courseName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Software Engineering", "Business Managment" }));
        jPanel1.add(cmb_courseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 427, 310, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Last name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 228, -1, -1));

        cmb_branchName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT", "Business" }));
        jPanel1.add(cmb_branchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 494, 310, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 292, -1, -1));

        btn_student_save.setBackground(new java.awt.Color(0, 0, 0));
        btn_student_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_student_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_student_save.setText("Save");
        btn_student_save.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_student_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_student_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_student_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Mobile");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 361, -1, -1));

        btn_student_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_student_clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_student_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_student_clear.setText("Clear");
        btn_student_clear.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_student_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_student_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_student_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 100, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 51, 0));
        jLabel9.setText("Student Registration");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("2022 @ Good_Received");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, -1, -1));

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete Student");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 130, 41));

        btn_update.setBackground(new java.awt.Color(0, 0, 0));
        btn_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update Student");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 130, 41));

        lbl_fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_fname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 194, 310, 16));

        lbl_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 320, 310, 16));

        lbl_lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_lname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 256, 310, 16));

        lbl_mobile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_mobile.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 391, 310, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 690, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_student_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_student_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_student_lnameActionPerformed

    private void txt_student_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_student_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_student_mobileActionPerformed

    private void btn_student_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_student_saveActionPerformed

        String studentid, fname, lname, email, tp, course, branch;
        int i = 0;

        try {
            int errorCount = 0;

            studentid = txt_sid.getText();

            fname = txt_student_fname.getText();
            String PATTERNF = "^[a-zA-Z]{0,30}$";
            Pattern pattF = Pattern.compile(PATTERNF);
            Matcher matchF = pattF.matcher(fname);

            if (fname.equals("")) {
                errorCount++;
                lbl_fname.setText("First name cannot be empty");
            } else if (!matchF.matches()) {
                errorCount++;
                lbl_fname.setText("First name is incorrect");
            } else {
                lbl_fname.setText("");
            }

            lname = txt_student_lname.getText();
            String PATTERNL = "^[a-zA-Z]{0,30}$";
            Pattern pattL = Pattern.compile(PATTERNL);
            Matcher matchL = pattL.matcher(lname);
            if (lname.equals("")) {
                errorCount++;
                lbl_lname.setText("First name cannot be empty");
            } else if (!matchL.matches()) {
                errorCount++;
                lbl_lname.setText("Last name is incorrect");
            } else {
                lbl_lname.setText("");
            }

            email = txt_student_email.getText();
            String PATTERNE = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
            boolean emailBool = Pattern.compile(PATTERNE).matcher(email).matches();
            if (lname.equals("")) {
                errorCount++;
                lbl_email.setText("Email cannot be empty");
            } else if (!emailBool) {
                errorCount++;
                lbl_email.setText("Invalid email address");
            } else {
                lbl_email.setText("");
            }

            tp = txt_student_mobile.getText();
            String PATTERNTP = "^[0-9]{10}$";
            Pattern patttp = Pattern.compile(PATTERNTP);
            Matcher matcthp = patttp.matcher(tp);

            boolean telephoneBool = Pattern.compile("^[0-9]{10}$").matcher(tp).matches();
            if (tp.equals("")) {
                errorCount++;
                lbl_mobile.setText("Mobile cannot be empty");
            } else if (!telephoneBool) {
                errorCount++;
                lbl_mobile.setText("Mobile is incorrect");
            } else {
                lbl_mobile.setText("");
            }

            course = cmb_courseName.getSelectedItem().toString();
            branch = cmb_branchName.getSelectedItem().toString();

            if (errorCount == 0) {
                C_StudentRegistration student_registration = new C_StudentRegistration();
                student_registration.insertStudentControl(studentid, fname, lname, email, tp, course, branch);
                setVisible(false);
                new V_DashBoard().setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_student_saveActionPerformed

    private void btn_student_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_student_backActionPerformed

        setVisible(false);
        new V_DashBoard().setVisible(true);
    }//GEN-LAST:event_btn_student_backActionPerformed

    private void btn_student_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_student_clearActionPerformed

        txt_student_fname.setText(null);
        txt_student_lname.setText(null);
        txt_student_email.setText(null);
        txt_student_mobile.setText(null);
    }//GEN-LAST:event_btn_student_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        String dsid;
        try {
            dsid = txt_sid.getText();

            C_StudentRegistration delete = new C_StudentRegistration();
            delete.insertStudentDeleteControl(dsid);
            setVisible(false);
                new V_DashBoard().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
//        setVisible(false);
//        new V_StudentUpdateDelete().setVisible(true);

        String studentid, fname, lname, email, tp, course, branch;
        int i = 0;

        try {
            int errorCount = 0;

            studentid = txt_sid.getText();

            fname = txt_student_fname.getText();
            String PATTERNF = "^[a-zA-Z]{0,30}$";
            Pattern pattF = Pattern.compile(PATTERNF);
            Matcher matchF = pattF.matcher(fname);

            if (fname.equals("")) {
                errorCount++;
                lbl_fname.setText("First name cannot be empty");
            } else if (!matchF.matches()) {
                errorCount++;
                lbl_fname.setText("First name is incorrect");
            } else {
                lbl_fname.setText("");
            }

            lname = txt_student_lname.getText();
            String PATTERNL = "^[a-zA-Z]{0,30}$";
            Pattern pattL = Pattern.compile(PATTERNL);
            Matcher matchL = pattL.matcher(lname);
            if (lname.equals("")) {
                errorCount++;
                lbl_lname.setText("First name cannot be empty");
            } else if (!matchL.matches()) {
                errorCount++;
                lbl_lname.setText("Last name is incorrect");
            } else {
                lbl_lname.setText("");
            }

            email = txt_student_email.getText();
            String PATTERNE = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
            boolean emailBool = Pattern.compile(PATTERNE).matcher(email).matches();
            if (lname.equals("")) {
                errorCount++;
                lbl_email.setText("Email cannot be empty");
            } else if (!emailBool) {
                errorCount++;
                lbl_email.setText("Invalid email address");
            } else {
                lbl_email.setText("");
            }

            tp = txt_student_mobile.getText();
            String PATTERNTP = "^[0-9]{10}$";
            Pattern patttp = Pattern.compile(PATTERNTP);
            Matcher matcthp = patttp.matcher(tp);

            boolean telephoneBool = Pattern.compile("^[0-9]{10}$").matcher(tp).matches();
            if (tp.equals("")) {
                errorCount++;
                lbl_mobile.setText("Mobile cannot be empty");
            } else if (!telephoneBool) {
                errorCount++;
                lbl_mobile.setText("Mobile is incorrect");
            } else {
                lbl_mobile.setText("");
            }

            course = cmb_courseName.getSelectedItem().toString();
            branch = cmb_branchName.getSelectedItem().toString();

            if (errorCount == 0) {
                C_StudentRegistration update = new C_StudentRegistration();
                update.insertStudentUpdateControl(studentid, fname, lname, email, tp, course, branch);

//                C_StudentRegistration student_registration = new C_StudentRegistration();
//                student_registration.insertStudentControl(studentid, fname, lname, email, tp, course, branch);
                setVisible(false);
                new V_DashBoard().setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_student_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_student_fnameKeyReleased
        String fname = txt_student_fname.getText();
        String PATTERNF = "^[a-zA-Z]{0,30}$";
        Pattern pattF = Pattern.compile(PATTERNF);
        Matcher matchF = pattF.matcher(fname);

        if (!matchF.matches()) {
            lbl_fname.setText("First name is incorrect");
        } else {
            lbl_fname.setText("");
        }
    }//GEN-LAST:event_txt_student_fnameKeyReleased

    private void txt_student_lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_student_lnameKeyReleased
        String lname = txt_student_lname.getText();
        String PATTERNL = "^[a-zA-Z]{0,30}$";
        Pattern pattL = Pattern.compile(PATTERNL);
        Matcher matchL = pattL.matcher(lname);

        if (!matchL.matches()) {
            lbl_lname.setText("Last name is incorrect");
        } else {
            lbl_lname.setText("");
        }
    }//GEN-LAST:event_txt_student_lnameKeyReleased

    private void txt_student_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_student_emailKeyReleased
        String PATTERNE = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
        boolean emailBool = Pattern.compile(PATTERNE).matcher(txt_student_email.getText()).matches();
        if (!emailBool) {
            lbl_email.setText("Invalid email address");
        } else {
            lbl_email.setText("");
        }
    }//GEN-LAST:event_txt_student_emailKeyReleased

    private void txt_student_mobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_student_mobileKeyReleased
        String tp = txt_student_mobile.getText();
        String PATTERNTP = "^[0-9]{10}$";
        Pattern patttp = Pattern.compile(PATTERNTP);
        Matcher matcthp = patttp.matcher(tp);

        boolean telephoneBool = Pattern.compile("^[0-9]{10}$").matcher(tp).matches();
        if (!telephoneBool) {
            lbl_mobile.setText("Mobile is incorrect");
        } else {
            lbl_mobile.setText("");
        }
    }//GEN-LAST:event_txt_student_mobileKeyReleased

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
            java.util.logging.Logger.getLogger(V_StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_student_back;
    private javax.swing.JButton btn_student_clear;
    private javax.swing.JButton btn_student_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox cmb_branchName;
    private javax.swing.JComboBox cmb_courseName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_mobile;
    private javax.swing.JTextField txt_sid;
    private javax.swing.JTextField txt_student_email;
    private javax.swing.JTextField txt_student_fname;
    private javax.swing.JTextField txt_student_lname;
    private javax.swing.JTextField txt_student_mobile;
    // End of variables declaration//GEN-END:variables
}
