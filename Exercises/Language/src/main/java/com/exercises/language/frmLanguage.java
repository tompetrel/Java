package com.exercises.language;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TAI
 */
public final class frmLanguage extends javax.swing.JFrame {

    /**
     * Creates new form frmLanguage
     */
    void initGUI() {
        setLocationRelativeTo(null);
        setVisible(false);
        cmbLanguage.removeAllItems();
        cmbLanguage.addItem("English");
        cmbLanguage.addItem("Vietnamese");
        cmbNational.removeAllItems();
        cmbNational.addItem("United State");
        cmbNational.addItem("Viet Nam");
    }

    void changeLanguage(String language, String country) {
        try {
            Locale locale;
            ResourceBundle bundle;
            String baseName = "com.exercises.language.Language_" + language + "_" + country;
            locale = new Locale(language, country);
            bundle = ResourceBundle.getBundle(baseName, locale);
            setTitle(bundle.getString("title"));
            lblLanguage.setText(bundle.getString("lblLanguage"));
            cmbLanguage.removeAllItems();
            cmbLanguage.addItem(bundle.getString("cmbLanguageItem1"));
            cmbLanguage.addItem(bundle.getString("cmbLanguageItem2"));
            lblFirstname.setText(bundle.getString("lblFirstname"));
            lblLastname.setText(bundle.getString("lblLastname"));
            lblGender.setText(bundle.getString("lblGender"));
            radioMale.setText(bundle.getString("radioMale"));
            radioFemale.setText(bundle.getString("radioFemale"));
            lblNational.setText(bundle.getString("lblNational"));
            cmbNational.removeAllItems();
            cmbNational.addItem(bundle.getString("cmbNationalItem1"));
            cmbNational.addItem(bundle.getString("cmbNationalItem2"));
            btnRegistry.setText(bundle.getString("btnRegistry"));
            btnExit.setText(bundle.getString("btnExit"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public frmLanguage() {
        initComponents();
        initGUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        lblLanguage = new javax.swing.JLabel();
        cmbLanguage = new javax.swing.JComboBox<>();
        lblFirstname = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        lblLastname = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        lblNational = new javax.swing.JLabel();
        cmbNational = new javax.swing.JComboBox<>();
        btnRegistry = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Language");

        lblLanguage.setText("Lang:");

        cmbLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLanguageActionPerformed(evt);
            }
        });

        lblFirstname.setText("First name:");

        lblLastname.setText("Last name:");

        lblGender.setText("Gender:");

        groupGender.add(radioMale);
        radioMale.setText("Male");

        groupGender.add(radioFemale);
        radioFemale.setText("Female");

        lblNational.setText("National:");

        cmbNational.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistry.setText("Registry");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLanguage)
                            .addComponent(lblFirstname)
                            .addComponent(lblLastname)
                            .addComponent(lblNational))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnRegistry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(btnExit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addGap(18, 18, 18)
                                .addComponent(radioFemale))
                            .addComponent(cmbLanguage, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbNational, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanguage)
                    .addComponent(cmbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstname)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastname)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNational)
                    .addComponent(cmbNational, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistry)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void cmbLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLanguageActionPerformed
        if (cmbLanguage.getSelectedItem() != null) {
            switch (cmbLanguage.getSelectedItem().toString()) {
                case "English":
                    changeLanguage("en", "US");
                    break;
                case "Tiếng Anh":
                    changeLanguage("en", "US");
                    break;
                case "Vietnamese":
                    changeLanguage("vi", "VN");
                    break;
                case "Tiếng Việt":
                    changeLanguage("vi", "VN");
                    break;
            }
        }
    }//GEN-LAST:event_cmbLanguageActionPerformed

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
            java.util.logging.Logger.getLogger(frmLanguage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLanguage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLanguage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLanguage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLanguage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegistry;
    private javax.swing.JComboBox<String> cmbLanguage;
    private javax.swing.JComboBox<String> cmbNational;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblNational;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    // End of variables declaration//GEN-END:variables
}
