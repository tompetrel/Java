/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentSoftech;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.JdbcRowSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TAI
 */
public final class ManagerClass extends javax.swing.JFrame {

    Vector vCol;
    Vector vData;

    void initTableClass() throws ClassNotFoundException, SQLException {
        vCol = new Vector();
        vData = new Vector();
        Connection conn;
        Statement stmt;
        ResultSet rs;

        vCol.add("No.");
        vCol.add("Class ID");
        vCol.add("Class name");

        String sql = "select classID, classname from class order by classID";
        conn = studentSoftech.connectionSQL.connectSQLSever();
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        try (JdbcRowSet jdbcRs = new JdbcRowSetImpl(rs)) {
            int countRow = 0;
            while (jdbcRs.next()) {
                Vector vRow = new Vector();
                Vector vtemp = new Vector();
                for (int j = 1; j <= rsmd.getColumnCount(); j++) {
                    vtemp.add(rs.getString(j));
                }
                countRow++;
                vRow.add(countRow);
                for (int i = 0; i < vtemp.size(); i++) {
                    vRow.add(vtemp.get(i));
                }
                vData.add(vRow);
            }
            DefaultTableModel model = new DefaultTableModel(vData, vCol);
            tblClass.setModel(model);
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    int getNumberOfStudents(String ClassID) throws ClassNotFoundException, SQLException {
        int count = 0;
        Connection conn = studentSoftech.connectionSQL.connectSQLSever();
        String sql = "SELECT * from student where classID like ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, ClassID);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            count++;
        }
        rs.close();
        pstmt.close();
        conn.close();
        return count;
    }

    void deleteTableRow(String classID) throws SQLException, ClassNotFoundException {
        Connection conn;
        Statement stmt;
        String sql = "delete from class where classID = '" + classID + "'";
        conn = studentSoftech.connectionSQL.connectSQLSever();
        stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
        JOptionPane.showMessageDialog(null, "Delete classID success", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    void insertTableRow(String classID, String className) throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement stmt;
        boolean checkClassID = false;
        boolean checkClassName = false;
        conn = studentSoftech.connectionSQL.connectSQLSever();
        int countRow = 0;
        String sql = "SELECT * from class where classID like ? ";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, classID);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    countRow++;
                }
            }
        }
        conn.close();
        if (countRow > 0) {
            JOptionPane.showMessageDialog(null, "Class ID " + classID + " already exists. Can not insert!", "Error", JOptionPane.INFORMATION_MESSAGE);
            checkClassID = false;
        } else {
            checkClassID = true;
        }
        countRow = 0;
        conn = studentSoftech.connectionSQL.connectSQLSever();
        sql = "SELECT * from class where classname like ? ";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, className);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    countRow++;
                }
            }
        }
        conn.close();
        if (countRow > 0) {
            JOptionPane.showMessageDialog(null, "Class name " + className + " already exists. Can not insert!", "Error", JOptionPane.INFORMATION_MESSAGE);
            checkClassName = false;
        } else {
            checkClassName = true;
        }
        if (checkClassID && checkClassName) {
            conn = studentSoftech.connectionSQL.connectSQLSever();
            stmt = conn.createStatement();
            sql = "insert into class values "
                    + "('" + classID + "','" + className + "')";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Insert new class ID successful!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void updateTabelRow(String classID, String className) throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement stmt;
        boolean check = false;
        conn = studentSoftech.connectionSQL.connectSQLSever();
        int countRow = 0;
        String sql = "SELECT * from class where classname like ? ";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, className);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    countRow++;
                }
            }
        }
        conn.close();
        if (countRow > 0) {
            JOptionPane.showMessageDialog(null, "Class name " + className + " exists. Can't update.", "Infomation", JOptionPane.INFORMATION_MESSAGE);
            check = false;
        } else {
            check = true;
        }
        if (check) {
            conn = studentSoftech.connectionSQL.connectSQLSever();
            stmt = conn.createStatement();
            sql = "update class set classname = '" + className + "' where classID = '" + classID + "'";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update new class name successful!", "Information", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    /**
     * Creates new form ManagerClass
     */
    public ManagerClass() throws ClassNotFoundException, SQLException {
        initComponents();
        initTableClass();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFilter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClassNameFilter = new javax.swing.JTextField();
        btnInsertFilter = new javax.swing.JButton();
        btnDeleteFilter = new javax.swing.JButton();
        btnDisplayFilter = new javax.swing.JButton();
        pannelTableInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();
        txtNumberOfStudents = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pannelModify = new javax.swing.JPanel();
        btnUpdateModify = new javax.swing.JButton();
        txtClassNameModify = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Class");
        setResizable(false);

        panelFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));

        jLabel1.setText("Class Name:");

        txtClassNameFilter.setText(" ");

        btnInsertFilter.setText("Insert");
        btnInsertFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertFilterActionPerformed(evt);
            }
        });

        btnDeleteFilter.setText("Delete");
        btnDeleteFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFilterActionPerformed(evt);
            }
        });

        btnDisplayFilter.setText("Display");
        btnDisplayFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtClassNameFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDisplayFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertFilter)
                .addContainerGap())
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(txtClassNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplayFilter)
                    .addComponent(btnDeleteFilter)
                    .addComponent(btnInsertFilter))
                .addContainerGap())
        );

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Class ID", "Class Name"
            }
        ));
        tblClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblClassMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblClass);

        txtNumberOfStudents.setEditable(false);

        jLabel2.setText("Number of students");

        javax.swing.GroupLayout pannelTableInfoLayout = new javax.swing.GroupLayout(pannelTableInfo);
        pannelTableInfo.setLayout(pannelTableInfoLayout);
        pannelTableInfoLayout.setHorizontalGroup(
            pannelTableInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelTableInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelTableInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pannelTableInfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumberOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannelTableInfoLayout.setVerticalGroup(
            pannelTableInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelTableInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannelTableInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pannelModify.setBorder(javax.swing.BorderFactory.createTitledBorder("Modify"));

        btnUpdateModify.setText("Update");
        btnUpdateModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateModifyActionPerformed(evt);
            }
        });

        jLabel3.setText("Class Name:");

        javax.swing.GroupLayout pannelModifyLayout = new javax.swing.GroupLayout(pannelModify);
        pannelModify.setLayout(pannelModifyLayout);
        pannelModifyLayout.setHorizontalGroup(
            pannelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelModifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClassNameModify, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateModify)
                .addContainerGap())
        );
        pannelModifyLayout.setVerticalGroup(
            pannelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelModifyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pannelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateModify)
                    .addComponent(txtClassNameModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannelTableInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pannelModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pannelTableInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pannelModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblClassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClassMouseReleased
        try {
            // TODO add your handling code here:
            txtNumberOfStudents.setText(Integer.toString(getNumberOfStudents(tblClass.getValueAt(tblClass.getSelectedRow(), 1).toString())));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtClassNameModify.setText(tblClass.getValueAt(tblClass.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tblClassMouseReleased

    private void btnDisplayFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayFilterActionPerformed
        // TODO add your handling code here:
        Vector vTemp = new Vector();
        vTemp.addAll(vData);

        int i = 0;
        do {
            if (!vTemp.get(i).toString().toLowerCase().contains(txtClassNameFilter.getText())) {
                vTemp.remove(i);
            } else {
                i++;
            }
        } while (i < vTemp.size());
        DefaultTableModel model = new DefaultTableModel(vTemp, vCol);
        tblClass.setModel(model);
    }//GEN-LAST:event_btnDisplayFilterActionPerformed

    private void btnDeleteFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFilterActionPerformed
        // TODO add your handling code here:
        int index = tblClass.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please choose row you want to delete", "Infomation", JOptionPane.INFORMATION_MESSAGE);
        }
        int i = JOptionPane.showConfirmDialog(null, "Do you want to delete classID " + tblClass.getValueAt(index, 1) + " ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (i == 0) {
            try {
                if (getNumberOfStudents(tblClass.getValueAt(index, 1).toString()) != 0) {
                    JOptionPane.showMessageDialog(null, "This has student. You can't delete", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    deleteTableRow(tblClass.getValueAt(index, 1).toString());
                    initTableClass();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteFilterActionPerformed

    private void btnInsertFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertFilterActionPerformed
        // TODO add your handling code here:
        String strClassID = "";
        String strClassName = "";
        do {
            strClassID = JOptionPane.showInputDialog(null, "Please input class ID:", "Input class ID", JOptionPane.INFORMATION_MESSAGE);
            if (strClassID != null) {
                if (strClassID.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Class ID can't empty. Please reinput!", "Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (strClassID.length() > 10) {
                        JOptionPane.showMessageDialog(null, "Class name is only 10 characters. Please reinput!", "Error", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }

        } while (true);
        while ((true) && (strClassID != null)) {
            strClassName = JOptionPane.showInputDialog(null, "Please input class name:", "Input class name", JOptionPane.INFORMATION_MESSAGE);
            if (strClassName != null) {
                if (strClassName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Class ID can't empty. Please reinput!", "Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (strClassName.length() > 10) {
                        JOptionPane.showMessageDialog(null, "Class name is only 10 characters. Please reinput!", "Error", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        };
        if (strClassID != null && strClassName != null) {
            try {
                insertTableRow(strClassID, strClassName);
                initTableClass();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnInsertFilterActionPerformed

    private void btnUpdateModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateModifyActionPerformed
        // TODO add your handling code here:
        int index = tblClass.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please choose an row you want to update!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (txtClassNameModify.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input new class ID you want to update!", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (txtClassNameModify.getText().length() > 10) {
                    JOptionPane.showMessageDialog(null, "Class name is only 10 characters!", "Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        updateTabelRow(tblClass.getValueAt(index, 1).toString(), txtClassNameModify.getText());
                        initTableClass();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }//GEN-LAST:event_btnUpdateModifyActionPerformed
    }

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
            java.util.logging.Logger.getLogger(ManagerClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManagerClass().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ManagerClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteFilter;
    private javax.swing.JButton btnDisplayFilter;
    private javax.swing.JButton btnInsertFilter;
    private javax.swing.JButton btnUpdateModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFilter;
    private javax.swing.JPanel pannelModify;
    private javax.swing.JPanel pannelTableInfo;
    private javax.swing.JTable tblClass;
    private javax.swing.JTextField txtClassNameFilter;
    private javax.swing.JTextField txtClassNameModify;
    private javax.swing.JTextField txtNumberOfStudents;
    // End of variables declaration//GEN-END:variables

}
