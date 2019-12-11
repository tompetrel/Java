/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAI
 */
public class DatabaseMetaData_Example {

    public static void main(String[] args) {
        String dbURL = "jdbc:sqlserver://localhost;"
                + "databaseName=softech;user=sa;password=123456";

        try {
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
                DatabaseMetaData metaData = conn.getMetaData();
                System.out.println("Driver name: " + metaData.getDriverName());
                System.out.println("Driver version: " + metaData.getDriverVersion());
                System.out.println("Product name: " + metaData.getDatabaseProductName());
                System.out.println("Product version: " + metaData.getDatabaseProductVersion());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMetaData_Example.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
