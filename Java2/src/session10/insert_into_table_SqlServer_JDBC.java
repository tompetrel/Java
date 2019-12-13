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
public class insert_into_table_SqlServer_JDBC {

    static void insertIntoTable() throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement stmt;
        Class.forName(session10Constants.JDBC_DRIVER);
        System.out.println("Connecting to database ...");
        conn = DriverManager.getConnection(session10Constants.DB_URL + session10Constants.DATABASENAME + session10Constants.USER + session10Constants.PASS);
        System.out.println("Inserting into table...");
        stmt = conn.createStatement();
        String sql = "insert into student1 values "
                + "('softech001','batch130','Nguyen Anh Tan'),"
                + "('softech002','batch130','Nguyen Hong Hai'),"
                + "('softech003','batch130','Phan Phuong Nam'),"
                + "('softech004','batch131','Nguyen Huu Hiep'),"
                + "('softech005','batch131','Vo Ngoc Hai'),"
                + "('softech006','batch131','Tran Anh Tuan')";
        stmt.executeUpdate(sql);
        System.out.println("Table insert into table successfully...");
        stmt.close();
        conn.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        insertIntoTable();
    }
}
