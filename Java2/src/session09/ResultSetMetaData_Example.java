/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAI
 */
public class ResultSetMetaData_Example {

    // Buoc 1: Ten cua driver va dia chi URL cua co so du lieu
    static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String DB_URL = "jdbc:sqlserver://localhost;";
    
    //Ten database,user name, passwork  
    static final String DATABASENAME = "databaseName=softech;";
    static final String USER = "user=sa;";
    static final String PASS = "password=123456;";

    public static void main(String[] args) throws SQLException {
        Connection conn;
        Statement stmt;
        try {
            //Buoc 2: Dang ki drive
            Class.forName(JDBC_DRIVER);
            // Buoc 3: Mo mot ket noi
            System.out.println("Dang ket noi toi co so du lieu ...");
            conn = DriverManager.getConnection(DB_URL + DATABASENAME + USER + PASS);
            // Buoc 4: Thuc thi truy van
            System.out.println("Tao cac lenh truy van SQL ...");
            stmt = conn.createStatement();
            String sql;
            sql = "select studentid, batch, name from student";
            // Buoc 5: Lay du lieu tu Result Set
            try (ResultSet rs = stmt.executeQuery(sql)) {
                ResultSetMetaData rsmd = rs.getMetaData();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.println("Colum " + i + ": ");
                    System.out.println("\tColum name: " + rsmd.getColumnName(i));
                    System.out.println("\tColum type: " + rsmd.getColumnTypeName(i));
                    System.out.println("\tColum size: " + rsmd.getColumnDisplaySize(i));
                }
            }
            // Buoc 6: Don sach moi truong va giai phong resource
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultSetMetaData_Example.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
