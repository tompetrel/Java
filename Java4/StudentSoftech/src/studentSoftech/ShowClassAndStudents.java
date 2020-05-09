/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentSoftech;

import com.sun.rowset.CachedRowSetImpl;
import com.sun.rowset.JoinRowSetImpl;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TAI
 */
public final class ShowClassAndStudents extends javax.swing.JFrame {

    /**
     * Creates new form ShowClassAndStudents
     */
    Vector vData;
    Vector vColumn;
    static CachedRowSet cachedRowSetClass, cachedRowSetStudent;
    static JoinRowSet joinRowSetClassAndstudent;

    void initClassTable() throws ClassNotFoundException, SQLException {
        vData = new Vector();
        vColumn = new Vector();

        vColumn.add("Class ID");
        vColumn.add("Class Name");

        Class.forName(connectionSQL_RowSet.JDBC_DRIVER);
        cachedRowSetClass = new CachedRowSetImpl();
        cachedRowSetClass.setUrl(connectionSQL_RowSet.DB_URL + connectionSQL_RowSet.DATABASENAME);
        cachedRowSetClass.setUsername(connectionSQL_RowSet.USER);
        cachedRowSetClass.setPassword(connectionSQL_RowSet.PASS);
        String sql = "select classid, classname from class order by classID";
        cachedRowSetClass.setCommand(sql);
        cachedRowSetClass.execute();
        while (cachedRowSetClass.next()) {
            Vector vTemp = new Vector();
            vTemp.add(cachedRowSetClass.getString("classid"));
            vTemp.add(cachedRowSetClass.getString("classname"));
            vData.add(vTemp);
        }
        DefaultTableModel model = new DefaultTableModel(vData, vColumn);
        tblClass.setModel(model);

    }

    void initStudentTable() throws ClassNotFoundException, SQLException {
        vData = new Vector();
        vColumn = new Vector();

        vColumn.add("Student ID");
        vColumn.add("Student Name");
        vColumn.add("Sex");
        vColumn.add("Class ID");

        Class.forName(connectionSQL_RowSet.JDBC_DRIVER);
        cachedRowSetStudent = new CachedRowSetImpl();
        cachedRowSetStudent.setUrl(connectionSQL_RowSet.DB_URL + connectionSQL_RowSet.DATABASENAME);
        cachedRowSetStudent.setUsername(connectionSQL_RowSet.USER);
        cachedRowSetStudent.setPassword(connectionSQL_RowSet.PASS);
        String sql = "select studentID, studentname,sex,classID from student order by studentID";
        cachedRowSetStudent.setCommand(sql);
        cachedRowSetStudent.execute();
        while (cachedRowSetStudent.next()) {
            Vector vTemp = new Vector();
            vTemp.add(cachedRowSetStudent.getString("studentID"));
            vTemp.add(cachedRowSetStudent.getString("studentname"));
            if (cachedRowSetStudent.getBoolean("sex")) {
                vTemp.add("Male");
            } else {
                vTemp.add("Female");
            }
            vTemp.add(cachedRowSetStudent.getString("classID"));
            vData.add(vTemp);

        }
        DefaultTableModel model = new DefaultTableModel(vData, vColumn);
        tblStudent.setModel(model);

    }

    void initClassAndStudentTable() throws SQLException {
        vData = new Vector();
        vColumn = new Vector();

        vColumn.add("Student ID");
        vColumn.add("Student Name");
        vColumn.add("Sex");
        vColumn.add("Class Name");

        joinRowSetClassAndstudent = new JoinRowSetImpl();
        joinRowSetClassAndstudent.addRowSet(cachedRowSetStudent, "classID");
        joinRowSetClassAndstudent.addRowSet(cachedRowSetClass, "classID");

        while (joinRowSetClassAndstudent.next()) {
            Vector vTemp = new Vector();
            vTemp.add(joinRowSetClassAndstudent.getString("studentID"));
            vTemp.add(joinRowSetClassAndstudent.getString("studentname"));
            if (joinRowSetClassAndstudent.getBoolean("sex")) {
                vTemp.add("Male");
            } else {
                vTemp.add("Female");
            }
            vTemp.add(joinRowSetClassAndstudent.getString("classname"));
            vData.add(vTemp);

        }
        Collections.reverse(vData);
        DefaultTableModel model = new DefaultTableModel(vData, vColumn);
        tblClassAndStudent.setModel(model);

    }

    void initListClassID() throws SQLException {
        Vector listClass = new Vector();
        cachedRowSetClass.beforeFirst();
        while (cachedRowSetClass.next()) {
            listClass.add(cachedRowSetClass.getString("classID"));
        }
        listClassID.setListData(listClass);;
    }

    public ShowClassAndStudents() throws ClassNotFoundException, SQLException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        initClassTable();
        initStudentTable();
        initClassAndStudentTable();
        initListClassID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listClassID = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClassAndStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Class and Student Information");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Class Information"));

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblClass);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Information"));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblStudent);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Display a list of students by class"));

        listClassID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listClassID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listClassIDMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(listClassID);

        tblClassAndStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblClassAndStudent);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listClassIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClassIDMouseReleased
        tblClassAndStudent.setModel(new DefaultTableModel());
        try {
            // TODO add your handling code here:
            vData = new Vector();
            vColumn = new Vector();

            vColumn.add("Student ID");
            vColumn.add("Student Name");
            vColumn.add("Sex");
            vColumn.add("Class Name");

            joinRowSetClassAndstudent.beforeFirst();
            while (joinRowSetClassAndstudent.next()) {
                Vector vTemp = new Vector();
                if (joinRowSetClassAndstudent.getString("classID").equalsIgnoreCase(listClassID.getSelectedValue())) {
                    vTemp.add(joinRowSetClassAndstudent.getString("studentID"));
                    vTemp.add(joinRowSetClassAndstudent.getString("studentname"));
                    if (joinRowSetClassAndstudent.getBoolean("sex")) {
                        vTemp.add("Male");
                    } else {
                        vTemp.add("Female");
                    }
                    vTemp.add(joinRowSetClassAndstudent.getString("classname"));

                    vData.add(vTemp);
                }
                Collections.reverse(vData);
                DefaultTableModel model = new DefaultTableModel(vData, vColumn);
                tblClassAndStudent.setModel(model);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowClassAndStudents.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_listClassIDMouseReleased

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
            java.util.logging.Logger.getLogger(ShowClassAndStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowClassAndStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowClassAndStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowClassAndStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShowClassAndStudents().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ShowClassAndStudents.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ShowClassAndStudents.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listClassID;
    private javax.swing.JTable tblClass;
    private javax.swing.JTable tblClassAndStudent;
    private javax.swing.JTable tblStudent;
    // End of variables declaration//GEN-END:variables
}
