/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01_baitap;

/**
 *
 * @author TAI
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();
        lblStatusUserName = new javax.swing.JLabel();
        lblStatusPassWord = new javax.swing.JLabel();
        lblStatusLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("User name:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });

        jLabel2.setText("Password:");

        txtPassWord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassWordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassWordFocusLost(evt);
            }
        });

        lblStatusUserName.setText("Status textbox user name:");

        lblStatusPassWord.setText("Status textbox password:");

        lblStatusLogin.setText("Status login:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassWord)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusUserName)
                            .addComponent(lblStatusPassWord)
                            .addComponent(lblStatusLogin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExit, btnLogin});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogin)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(jLabel2)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStatusUserName)
                .addGap(18, 18, 18)
                .addComponent(lblStatusPassWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblStatusLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        lblStatusUserName.setText("Status textbox user name: got focus");
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        lblStatusUserName.setText("Status textbox user name: lost focus");
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtPassWordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassWordFocusGained
        // TODO add your handling code here:
        lblStatusPassWord.setText("Status textbox password: got focus");
    }//GEN-LAST:event_txtPassWordFocusGained

    private void txtPassWordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassWordFocusLost
        // TODO add your handling code here:
        lblStatusPassWord.setText("Status textbox password: lost focus");
    }//GEN-LAST:event_txtPassWordFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (txtUserName.getText().isEmpty()) {
            lblStatusLogin.setText("Status login: user name empty");
            txtUserName.requestFocus();
        }
        if (txtPassWord.getText().isEmpty()) {
            lblStatusLogin.setText("Status login: password empty");
            txtPassWord.requestFocus();
        }
        if (txtUserName.getText().isEmpty() && txtPassWord.getText().isEmpty()) {
            lblStatusLogin.setText("Status login: user name and password empty");
            txtUserName.requestFocus();
        }
        if (!txtUserName.getText().isEmpty() && !txtPassWord.getText().isEmpty()) {
            lblStatusLogin.setText("Status login: login successfull");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStatusLogin;
    private javax.swing.JLabel lblStatusPassWord;
    private javax.swing.JLabel lblStatusUserName;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}