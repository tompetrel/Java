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
public class drop_table_SqlServer_JDBC {
    static void dropTable() throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement stmt;
        Class.forName(session10Constants.JDBC_DRIVER);
        System.out.println("Connecting to database ...");
        conn = DriverManager.getConnection(session10Constants.DB_URL + session10Constants.DATABASENAME + session10Constants.USER + session10Constants.PASS);
        System.out.println("Dropping table...");
        stmt = conn.createStatement();
        String sql = "drop table student1";
        stmt.executeUpdate(sql);
        System.out.println("Table drop table successfully...");
            stmt.close();
            conn.close();
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        dropTable();
    }
}
