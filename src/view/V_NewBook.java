/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.C_NewBook;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.LibraryDatabaseConnection;

/**
 *
 * @author Chathuraka
 */
public class V_NewBook extends javax.swing.JFrame {

    /**
     * Creates new form V_NewBook
     */
    public V_NewBook() {
        initComponents();
        autoId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pkr_publishYear = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        cmb_bookCategories = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btn_book_save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_book_clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_book_back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_bookId = new javax.swing.JTextField();
        txt_bookName = new javax.swing.JTextField();
        txt_publisher = new javax.swing.JTextField();
        txt_bookPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_bname = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        lbl_publisher = new javax.swing.JLabel();
        lbl_publish_year = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Bokk");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/the-librarypng.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pkr_publishYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 280, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Book id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        cmb_bookCategories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Business", "IT", "Engineering", "Art" }));
        jPanel1.add(cmb_bookCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 280, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Book name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        btn_book_save.setBackground(new java.awt.Color(0, 0, 0));
        btn_book_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_book_save.setText("Save");
        btn_book_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_book_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 100, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Publisher");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        btn_book_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_book_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_book_clear.setText("Clear");
        btn_book_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_book_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 100, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        btn_book_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_book_back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_book_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_book_back.setText("Back");
        btn_book_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_book_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Publish year");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Categories");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        txt_bookId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bookIdKeyReleased(evt);
            }
        });
        jPanel1.add(txt_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 280, -1));

        txt_bookName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bookNameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 280, -1));

        txt_publisher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_publisherKeyReleased(evt);
            }
        });
        jPanel1.add(txt_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 280, -1));

        txt_bookPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bookPriceKeyReleased(evt);
            }
        });
        jPanel1.add(txt_bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 280, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setText("Add New Book");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("2022 @ Good_Received");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, -1));

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete Book");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 130, 41));

        btn_update.setBackground(new java.awt.Color(0, 0, 0));
        btn_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update Book");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 120, 41));

        lbl_bname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_bname.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 224, 280, 16));

        lbl_price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_price.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 345, 280, 16));

        lbl_publisher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_publisher.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 285, 280, 16));

        lbl_publish_year.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_publish_year.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_publish_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 407, 280, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 660, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void autoId() {
        try {
            Statement st = LibraryDatabaseConnection.createConnection().createStatement();
            ResultSet rs = st.executeQuery("select Max(bookId) from newBook");
            rs.next();
            rs.getString("Max(bookId)");

            if (rs.getString("Max(bookId)") == null) {
                txt_bookId.setText("B0001");
            } else {
                Long id = Long.parseLong(rs.getString("Max(bookId)").substring(2, rs.getString("Max(bookId)").length()));
                id++;
                txt_bookId.setText("B0" + String.format("%03d", id));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void btn_book_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book_saveActionPerformed

        String book_id, book_name, publisher, price, publish_year, categories;

        try {
            int errorCount = 0;

            book_id = txt_bookId.getText();
            book_name = txt_bookName.getText();
            publisher = txt_publisher.getText();
            price = txt_bookPrice.getText();

            categories = cmb_bookCategories.getSelectedItem().toString();
            
            if (pkr_publishYear.getDate() == null) {
                errorCount++;
                lbl_publish_year.setText("Publisher year cannot be empty");
            } else {
                lbl_publish_year.setText("");
            }

            Matcher bookNameRegx = Pattern.compile("^[a-zA-Z]{0,30}$").matcher(book_name);

            if (book_name.equals("")) {
                errorCount++;
                lbl_bname.setText("Book name cannot be empty");
            } else if (!bookNameRegx.matches()) {
                errorCount++;
                lbl_bname.setText("Book name is incorrect");
            } else {
                lbl_bname.setText("");
            }

            Matcher publisherRegx = Pattern.compile("^[a-zA-Z]{0,30}$").matcher(publisher);
            if (publisher.equals("")) {
                errorCount++;
                lbl_publisher.setText("Publisher name cannot be empty");
            } else if (!publisherRegx.matches()) {
                errorCount++;
                lbl_publisher.setText("Publisher name is incorrect");
            } else {
                lbl_publisher.setText("");
            }

            Matcher bookPriceRegx = Pattern.compile("^[0-9]{0,30}$").matcher(price);
            if (price.equals("")) {
                errorCount++;
                lbl_price.setText("Price cannot be empty");
            } else if (!bookPriceRegx.matches()) {
                errorCount++;
                lbl_price.setText("Price is incorrect");
            } else {
                lbl_price.setText("");
            }

            if (errorCount == 0) {

                Date date_of_publish = pkr_publishYear.getDate();
                DateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                publish_year = date_format.format(date_of_publish);
                JOptionPane.showMessageDialog(null, publish_year);

                C_NewBook new_book = new C_NewBook();
                new_book.insertNewBookControl(book_id, book_name, publisher, price, publish_year, categories);
                setVisible(false);
                new V_DashBoard().setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_book_saveActionPerformed

    private void btn_book_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book_clearActionPerformed

        txt_bookName.setText(null);
        txt_publisher.setText(null);
        txt_bookPrice.setText(null);
        cmb_bookCategories.setModel(null);
    }//GEN-LAST:event_btn_book_clearActionPerformed

    private void btn_book_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book_backActionPerformed

        setVisible(false);
        new V_DashBoard().setVisible(true);
    }//GEN-LAST:event_btn_book_backActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        String bid;
        try {
            bid = txt_bookId.getText();

            C_NewBook delete = new C_NewBook();
            delete.insertBookDeleteControl(bid);
            setVisible(false);
            new V_DashBoard().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        String book_id, book_name, publisher, price, publish_year, categories;

        try {
            int errorCount = 0;

            book_id = txt_bookId.getText();
            book_name = txt_bookName.getText();
            publisher = txt_publisher.getText();
            price = txt_bookPrice.getText();

            if (pkr_publishYear.getDate() == null) {
                errorCount++;
                lbl_publish_year.setText("Publisher year cannot be empty");
            } else {
                lbl_publish_year.setText("");
            }
            
            Matcher bookNameRegx = Pattern.compile("^[a-zA-Z]{0,30}$").matcher(book_name);

            if (book_name.equals("")) {
                errorCount++;
                lbl_bname.setText("Book name cannot be empty");
            } else if (!bookNameRegx.matches()) {
                errorCount++;
                lbl_bname.setText("Book name is incorrect");
            } else {
                lbl_bname.setText("");
            }

            Matcher publisherRegx = Pattern.compile("^[a-zA-Z]{0,30}$").matcher(publisher);
            if (publisher.equals("")) {
                errorCount++;
                lbl_publisher.setText("Publisher name cannot be empty");
            } else if (!publisherRegx.matches()) {
                errorCount++;
                lbl_publisher.setText("Publisher name is incorrect");
            } else {
                lbl_publisher.setText("");
            }

            Matcher bookPriceRegx = Pattern.compile("^[0-9]{0,30}$").matcher(price);
            if (price.equals("")) {
                errorCount++;
                lbl_price.setText("Price cannot be empty");
            } else if (!bookPriceRegx.matches()) {
                errorCount++;
                lbl_price.setText("Price is incorrect");
            } else {
                lbl_price.setText("");
            }

            if (errorCount == 0) {

                Date date_of_publish = pkr_publishYear.getDate();
                DateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                publish_year = date_format.format(date_of_publish);
                categories = cmb_bookCategories.getSelectedItem().toString();

                C_NewBook update = new C_NewBook();
                update.insertBookUpdateControl(book_id, book_name, publisher, price, publish_year, categories);
                setVisible(false);
                new V_DashBoard().setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_bookIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bookIdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookIdKeyReleased

    private void txt_bookNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bookNameKeyReleased

        Matcher bookNameRegx = Pattern.compile("^[a-zA-Z0-9]{0,30}$").matcher(txt_bookName.getText());

        if (!bookNameRegx.matches()) {
            lbl_bname.setText("Book name is incorrect");
        } else {
            lbl_bname.setText("");
        }
    }//GEN-LAST:event_txt_bookNameKeyReleased

    private void txt_publisherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_publisherKeyReleased

        Matcher publisherRegx = Pattern.compile("^[a-zA-Z]{0,30}$").matcher(txt_publisher.getText());

        if (!publisherRegx.matches()) {
            lbl_publisher.setText("Publisher name is incorrect");
        } else {
            lbl_publisher.setText("");
        }
    }//GEN-LAST:event_txt_publisherKeyReleased

    private void txt_bookPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bookPriceKeyReleased
        Matcher bookPriceRegx = Pattern.compile("^[0-9]{0,30}$").matcher(txt_bookPrice.getText());

        if (!bookPriceRegx.matches()) {
            lbl_price.setText("Price is incorrect");
        } else {
            lbl_price.setText("");
        }
    }//GEN-LAST:event_txt_bookPriceKeyReleased

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
            java.util.logging.Logger.getLogger(V_NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_book_back;
    private javax.swing.JButton btn_book_clear;
    private javax.swing.JButton btn_book_save;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox cmb_bookCategories;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bname;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_publish_year;
    private javax.swing.JLabel lbl_publisher;
    private org.jdesktop.swingx.JXDatePicker pkr_publishYear;
    private javax.swing.JTextField txt_bookId;
    private javax.swing.JTextField txt_bookName;
    private javax.swing.JTextField txt_bookPrice;
    private javax.swing.JTextField txt_publisher;
    // End of variables declaration//GEN-END:variables
}
