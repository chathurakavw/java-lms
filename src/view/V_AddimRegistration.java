package view;

import control.C_AdminRegistration;
import java.awt.PageAttributes;
import java.sql.*;
import javax.swing.JOptionPane;
import model.LibraryDatabaseConnection;
import java.util.regex.*;
import javafx.scene.paint.Color;

public class V_AddimRegistration extends javax.swing.JFrame {

    public V_AddimRegistration() {
        initComponents();
        autoId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_admin_lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_adminEmail = new javax.swing.JTextField();
        txt_admin_com_pwd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        rbn_male = new javax.swing.JRadioButton();
        txt_admin_pwd = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        rbn_female = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txt_admin_tp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_admin_submit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_admin_clear = new javax.swing.JButton();
        txt_adminUserName = new javax.swing.JTextField();
        btn_admin_back = new javax.swing.JButton();
        txt_admin_fname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_answer = new javax.swing.JTextField();
        cmb_security = new javax.swing.JComboBox();
        lbl_emailError = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        lbl_tp = new javax.swing.JLabel();
        lbl_lname1 = new javax.swing.JLabel();
        lbl_answer = new javax.swing.JLabel();
        lbl_pwd = new javax.swing.JLabel();
        lbl_cpwd = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Registration");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/the-librarypng.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_admin_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_admin_lnameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_admin_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 350, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("User name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txt_adminEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adminEmailActionPerformed(evt);
            }
        });
        txt_adminEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_adminEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txt_adminEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 350, -1));
        jPanel1.add(txt_admin_com_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 350, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("First name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        buttonGroup2.add(rbn_male);
        rbn_male.setText("M");
        jPanel1.add(rbn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));
        jPanel1.add(txt_admin_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 350, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Last name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        buttonGroup2.add(rbn_female);
        rbn_female.setText("F");
        jPanel1.add(rbn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txt_admin_tp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_admin_tpKeyReleased(evt);
            }
        });
        jPanel1.add(txt_admin_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 350, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Telephone number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        btn_admin_submit.setBackground(new java.awt.Color(0, 0, 0));
        btn_admin_submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_admin_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_admin_submit.setText("Submit");
        btn_admin_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_admin_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 100, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Confirm password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        btn_admin_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_admin_clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_admin_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_admin_clear.setText("Clear");
        btn_admin_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_admin_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, 100, 40));
        jPanel1.add(txt_adminUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 350, -1));

        btn_admin_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_admin_back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_admin_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_admin_back.setText("Back");
        btn_admin_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_admin_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 40));

        txt_admin_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_admin_fnameActionPerformed(evt);
            }
        });
        txt_admin_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_admin_fnameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_admin_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 350, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setText("Admin Registration");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("2022 @ Good_Received");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Security Question");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 166, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText("Answer");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));
        jPanel1.add(txt_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 350, -1));

        cmb_security.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your nick name?", "What is your mother name?", " " }));
        jPanel1.add(cmb_security, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 238, -1));

        lbl_emailError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_emailError, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 293, -1, 15));

        lbl_fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_fname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 350, 16));

        lbl_tp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_tp.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 408, 350, 16));

        lbl_lname1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_lname1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 350, 16));

        lbl_answer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_answer.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 627, 350, 16));

        lbl_pwd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_pwd.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 457, 350, 16));

        lbl_cpwd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cpwd.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 517, 350, 16));

        lbl_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 350, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 0, 640, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void autoId() {
        try {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select Max(userName) from admin");
            rs.next();
            rs.getString("Max(userName)");

            if (rs.getString("Max(userName)") == null) {
                txt_adminUserName.setText("A0001");
            } else {
                Long id = Long.parseLong(rs.getString("Max(userName)").substring(2, rs.getString("Max(userName)").length()));
                id++;
                txt_adminUserName.setText("A0" + String.format("%03d", id));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void txt_adminEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adminEmailActionPerformed

    }//GEN-LAST:event_txt_adminEmailActionPerformed

    private void btn_admin_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_submitActionPerformed

        String user_name, fname, lname, email, tp, pwd, cpwd, gender, security, answer;

        try {
            int errorCount = 0;
            user_name = txt_adminUserName.getText();

            if (user_name.equals("")) {
                errorCount++;
            }

            fname = txt_admin_fname.getText();
            String PATTERNF = "^[a-zA-Z]{0,30}$";
            Pattern pattF = Pattern.compile(PATTERNF);
            Matcher matchF = pattF.matcher(fname);

            if (fname.equals("")) {
                errorCount++;
                lbl_fname.setText("First name cannot be empty");
            } else if (!matchF.matches()) {
                errorCount++;
                lbl_fname.setText("Name is incorrect");
            } else {
                lbl_fname.setText("");
            }

            lname = txt_admin_lname.getText();
            String PATTERNL = "^[a-zA-Z]{0,30}$";
            Pattern pattL = Pattern.compile(PATTERNL);
            Matcher matchL = pattL.matcher(lname);

            if (lname.equals("")) {
                errorCount++;
                lbl_lname1.setText("Last name cannot be empty");
            } else if (!matchL.matches()) {
                errorCount++;
                lbl_lname1.setText("Last name is incorrect");
            } else {
                lbl_lname1.setText("");
            }

            // Email Validation
            email = txt_adminEmail.getText();
            String PATTERNE = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
            boolean emailBool = Pattern.compile(PATTERNE).matcher(txt_adminEmail.getText()).matches();

            if (email.equals("")) {
                errorCount++;
                lbl_email.setText("Email cannot be empty");
            } else if (!emailBool) {
                errorCount++;
                lbl_email.setText("Invalid email address");
            } else {
                lbl_email.setText("");
            }

            if (rbn_male.isSelected()) {
//                errorCount++;
                gender = "M";
            } else {
//                errorCount++;
                gender = "F";
            }

            tp = txt_admin_tp.getText();
            String PATTERNTP = "^[0-9]{10}$";
            Pattern patttp = Pattern.compile(PATTERNTP);
            Matcher matcthp = patttp.matcher(tp);

            boolean telephoneBool = Pattern.compile("^[0-9]{10}$").matcher(tp).matches();
            if (tp.equals("")) {
                errorCount++;
                lbl_tp.setText("Email cannot be empty");
            } else if (!telephoneBool) {
                errorCount++;
                lbl_tp.setText("Telephone number is incorrect");
            } else {
                lbl_tp.setText("");
            }

            pwd = txt_admin_pwd.getText();
//            if (pwd.equals("")) {
//                errorCount++;
//                lbl_pwd.setText("Password cannot be empty");
//            } else {
//                lbl_pwd.setText("");
//            }
//
//            cpwd = txt_admin_com_pwd.getText();
//            if (cpwd.equals("")) {
//                errorCount++;
//                lbl_cpwd.setText("Confirm password cannot be empty");
//            } else {
//                lbl_cpwd.setText("");
//            }
//
//            if (pwd != cpwd) {
//                errorCount++;
//                lbl_cpwd.setText("Not match");
//            } else {
//                lbl_cpwd.setText("");
//            }

            security = cmb_security.getSelectedItem().toString();

            answer = txt_answer.getText();
            if (answer.equals("")) {
                errorCount++;
                lbl_answer.setText("Answer cannot be empty");
            } else {
                lbl_answer.setText("");
            }

           
            if (errorCount == 0) {
                C_AdminRegistration admin_registration = new C_AdminRegistration();
                admin_registration.insertAdminControl(user_name, fname, lname, email, gender, tp, pwd, security, answer);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_admin_submitActionPerformed

    private void btn_admin_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_backActionPerformed

        setVisible(false);
        new V_DashBoard().show();
    }//GEN-LAST:event_btn_admin_backActionPerformed

    private void btn_admin_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_clearActionPerformed

        txt_admin_lname.setText(null);
        txt_admin_lname.setText(null);
        txt_adminEmail.setText(null);
        txt_admin_tp.setText(null);
        txt_admin_pwd.setText(null);
        txt_admin_com_pwd.setText(null);
    }//GEN-LAST:event_btn_admin_clearActionPerformed

    private void txt_admin_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_admin_fnameKeyReleased
        String fname = txt_admin_fname.getText();
        String PATTERNF = "^[a-zA-Z]{0,30}$";
        Pattern pattF = Pattern.compile(PATTERNF);
        Matcher matchF = pattF.matcher(fname);

        if (!matchF.matches()) {
            lbl_fname.setText("First name is incorrect");
        } else {
            lbl_fname.setText("");
        }
    }//GEN-LAST:event_txt_admin_fnameKeyReleased

    private void txt_admin_lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_admin_lnameKeyReleased
        String lname = txt_admin_lname.getText();
        String PATTERNL = "^[a-zA-Z]{0,30}$";
        Pattern pattL = Pattern.compile(PATTERNL);
        Matcher matchL = pattL.matcher(lname);

        if (!matchL.matches()) {
            lbl_lname1.setText("Last name is incorrect");
        } else {
            lbl_lname1.setText("");
        }
    }//GEN-LAST:event_txt_admin_lnameKeyReleased

    private void txt_admin_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_admin_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admin_fnameActionPerformed

    private void txt_adminEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_adminEmailKeyReleased

        String PATTERNE = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
        boolean emailBool = Pattern.compile(PATTERNE).matcher(txt_adminEmail.getText()).matches();
        if (!emailBool) {
            lbl_email.setText("Invalid email address");
        } else {
            lbl_email.setText("");
        }
    }//GEN-LAST:event_txt_adminEmailKeyReleased

    private void txt_admin_tpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_admin_tpKeyReleased

        String tp = txt_admin_tp.getText();
        String PATTERNTP = "^[0-9]{10}$";
        Pattern patttp = Pattern.compile(PATTERNTP);
        Matcher matcthp = patttp.matcher(tp);

        boolean telephoneBool = Pattern.compile("^[0-9]{10}$").matcher(txt_admin_tp.getText().toString()).matches();
        if (!telephoneBool) {
            lbl_tp.setText("Telephone number is incorrect");
        } else {
            lbl_tp.setText("");
        }
    }//GEN-LAST:event_txt_admin_tpKeyReleased

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
            java.util.logging.Logger.getLogger(V_AddimRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_AddimRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_AddimRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_AddimRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_AddimRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admin_back;
    private javax.swing.JButton btn_admin_clear;
    private javax.swing.JButton btn_admin_submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cmb_security;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_answer;
    private javax.swing.JLabel lbl_cpwd;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_emailError;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_lname1;
    private javax.swing.JLabel lbl_pwd;
    private javax.swing.JLabel lbl_tp;
    private javax.swing.JRadioButton rbn_female;
    private javax.swing.JRadioButton rbn_male;
    private javax.swing.JTextField txt_adminEmail;
    private javax.swing.JTextField txt_adminUserName;
    private javax.swing.JPasswordField txt_admin_com_pwd;
    private javax.swing.JTextField txt_admin_fname;
    private javax.swing.JTextField txt_admin_lname;
    private javax.swing.JPasswordField txt_admin_pwd;
    private javax.swing.JTextField txt_admin_tp;
    private javax.swing.JTextField txt_answer;
    // End of variables declaration//GEN-END:variables
}
