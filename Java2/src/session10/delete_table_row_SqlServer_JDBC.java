/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TAI
 */
public class delete_table_row_SqlServer_JDBC {
    static void deleteTable() throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement stmt;
        Class.forName(session10Constants.JDBC_DRIVER);
        System.out.println("Connecting to database ...");
        conn = DriverManager.getConnection(session10Constants.DB_URL + session10Constants.DATABASENAME + session10Constants.USER + session10Constants.PASS);
        System.out.println("Deleting table...");
        stmt = conn.createStatement();
        String sql = "delete student1 where batch='batch131'";
        stmt.executeUpdate(sql);
        System.out.println("Table delete table successfully...");
            stmt.close();
            conn.close();
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        deleteTable();
    }
}
