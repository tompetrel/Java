/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAI
 */
public class connect_SqlServer_JDBC {
    // Buoc 1: Ten cua driver va dia chi URL cua co so du lieu

    static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String DB_URL = "jdbc:sqlserver://localhost;";

    //  Ten database, nguoi dung va mat khau cua co so du lieu
    static final String DATABASENAME = "databaseName=softech;";
    static final String USER = "user=sa;";
    static final String PASS = "password=123456";

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;
        try {
            // Buoc 2: Dang ky Driver
            Class.forName(JDBC_DRIVER);

            // Buoc 3: Mo mot ket noi
            System.out.println("Dang ket noi toi co so du lieu ...");
            conn = DriverManager.getConnection(DB_URL + DATABASENAME + USER + PASS);

            // Buoc 4: Thuc thi truy van
            System.out.println("Tao cac lenh truy van SQL ...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT studentid, batch, name FROM student";

            // Buoc 5: Lay du lieu tu Result Set
            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    // Lay du lieu boi su dung ten cot
                    String studentID = rs.getString("studentid");
                    String batch = rs.getString("batch");
                    String name = rs.getString("name");

                    // Hien thi cac gia tri
                    System.out.print("\nStudent ID: " + studentID);
                    System.out.print("\nBatch: " + batch);
                    System.out.println("\nName: " + name);
                    System.out.print("\n=================");
                }
            }
            // Buoc 6: Don sach moi truong va giai phong resource
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(connect_SqlServer_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
