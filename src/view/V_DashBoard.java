
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.LibraryDatabaseConnection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class V_DashBoard extends javax.swing.JFrame {


    public V_DashBoard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_newAdmin = new javax.swing.JButton();
        btn_newStudent = new javax.swing.JButton();
        btn_newBook = new javax.swing.JButton();
        btn_issueBook = new javax.swing.JButton();
        btn_returnBook = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        btn_logOut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Dashboard");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1050, 750));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/the-librarypng.png"))); // NOI18N
        jLabel1.setText("Dashboard");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btn_newAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btn_newAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_newAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btn_newAdmin.setText("New admin");
        btn_newAdmin.setMaximumSize(new java.awt.Dimension(65, 25));
        btn_newAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newAdminActionPerformed(evt);
            }
        });

        btn_newStudent.setBackground(new java.awt.Color(0, 0, 0));
        btn_newStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_newStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_newStudent.setText("New student");
        btn_newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newStudentActionPerformed(evt);
            }
        });

        btn_newBook.setBackground(new java.awt.Color(0, 0, 0));
        btn_newBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_newBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_newBook.setText("New book");
        btn_newBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newBookActionPerformed(evt);
            }
        });

        btn_issueBook.setBackground(new java.awt.Color(0, 0, 0));
        btn_issueBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_issueBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_issueBook.setText("Issue book");
        btn_issueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issueBookActionPerformed(evt);
            }
        });

        btn_returnBook.setBackground(new java.awt.Color(0, 0, 0));
        btn_returnBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_returnBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_returnBook.setText("Return book");
        btn_returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnBookActionPerformed(evt);
            }
        });

        btn_report.setBackground(new java.awt.Color(0, 0, 0));
        btn_report.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_report.setForeground(new java.awt.Color(255, 255, 255));
        btn_report.setText("Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        btn_logOut.setBackground(new java.awt.Color(0, 0, 0));
        btn_logOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_logOut.setForeground(new java.awt.Color(255, 255, 255));
        btn_logOut.setText("Log out");
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("Dashboard");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("2022 @ Good_Received");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_issueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_newBook, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_newStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_newAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel5)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_newAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_newStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_newBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_issueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        setVisible(false);
        new V_Login().show();
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void btn_returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnBookActionPerformed
        setVisible(false);
        new V_ReturnBook().show();
    }//GEN-LAST:event_btn_returnBookActionPerformed

    private void btn_issueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issueBookActionPerformed
        setVisible(false);
        new V_IssueBook().show();
    }//GEN-LAST:event_btn_issueBookActionPerformed

    private void btn_newBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newBookActionPerformed
        setVisible(false);
        new V_NewBook().show();
    }//GEN-LAST:event_btn_newBookActionPerformed

    private void btn_newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newStudentActionPerformed
        setVisible(false);
        new V_StudentRegistration().show();
    }//GEN-LAST:event_btn_newStudentActionPerformed

    private void btn_newAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newAdminActionPerformed
        setVisible(false);
        new V_AddimRegistration().show();
    }//GEN-LAST:event_btn_newAdminActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        
        try
        {aAa
            String path = "jdbc:mysql://localhost/new";
            Connection con = DriverManager.getConnection(path,"root","");
            //Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            JasperDesign jdesing = JRXmlLoader.load("F:\\MVC_Lbrary\\src\\view\\issueBook.jrxml");
            String selectquery = "select * from issuebook";
            JRDesignQuery query1 = new JRDesignQuery();
            query1.setText(selectquery);
            jdesing.setQuery(query1);
            JasperReport jrpt = JasperCompileManager.compileReport(jdesing);
            JasperPrint jprint = JasperFillManager.fillReport(jrpt, null,con);
            JasperViewer.viewReport(jprint);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_btn_reportActionPerformed

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
            java.util.logging.Logger.getLogger(V_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_issueBook;
    private javax.swing.JButton btn_logOut;
    private javax.swing.JButton btn_newAdmin;
    private javax.swing.JButton btn_newBook;
    private javax.swing.JButton btn_newStudent;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_returnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


   
}
