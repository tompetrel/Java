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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAI
 */
public class create_database_SqlServer_JDBC {
    static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String DB_URL = "jdbc:sqlserver://localhost;";
    static final String DATABASENAME = "softech1;";
    static final String USER = "user=sa;";
    static final String PASS = "password=123456";

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL + USER + PASS);
            System.out.println("Creating database...");
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE " + DATABASENAME;
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(create_database_SqlServer_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
