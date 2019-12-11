/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TAI
 */
public class update_ResultSet {
    public static void printRs(ResultSet rs) throws SQLException {
        // Bao dam rang chung ta bat dau tu hang dau tien
        rs.beforeFirst();
        while (rs.next()) {
            // Lay du lieu boi su dung ten cot
            String studentID = rs.getString("studentID");
            String batch = rs.getString("batch");
            String name = rs.getString("name");

            // Hien thi cac gia tri
            System.out.print("\nStudent ID: " + studentID);
            System.out.print("\nBatch: " + batch);
            System.out.println("\nName: " + name);
            System.out.print("\n=================");
        }
        System.out.println();
    }// Ket thuc printRs()

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement stmt;
        // Buoc 2: Dang ky Driver
        Class.forName(session10Constants.JDBC_DRIVER);

        // Buoc 3: Mo mot ket noi
        System.out.println("Dang ket noi toi co so du lieu ...");
        conn = DriverManager.getConnection(session10Constants.DB_URL + session10Constants.DATABASENAME + session10Constants.USER + session10Constants.PASS);
        // Buoc 4: Thuc thi truy van
        System.out.println("Tao cac lenh truy van SQL ...");
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT studentid, batch, name FROM student";
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("Liet ke result set de tham chieu ...");
        printRs(rs);
        // Buoc 6: Lap qua result set va thay doi ket qua
        // Di chuyen toi vi tri truoc hang dau tien de vong lap while lam viec chinh xac
        rs.beforeFirst();
        // Buoc 7: Lay du lieu result set
        while (rs.next()) {
            // Lay du lieu boi su dung ten cot
            String temp = rs.getString("batch") + "_1";
            rs.updateString("batch", temp);
            rs.updateRow();
        }
        System.out.println("Liet ke result set de hien thi du lieu moi ...");
        printRs(rs);

        // Chen mot ban ghi vao trong bang.
        //Move to insert row and add column data with updateXXX()
        System.out.println("Chen mot ban ghi moi ...");
        rs.moveToInsertRow();
        rs.updateString("studentid", "softech007");
        rs.updateString("batch", "batch132");
        rs.updateString("name", "Nguyen Van Phu");
        // Ky thac hang vua chen
        rs.insertRow();

        System.out.println("Liet ke result set de hien thi cac ban ghi ...");
        printRs(rs);

        // Xoa ban ghi thu hai trong bang.
        // Thiet lap vi tri con tro tai hang thu hai
        rs.absolute(2);
        System.out.println("Liet ke ban ghi truoc khi xoa ...");
        // lay va hien thi cac gia tri
        System.out.print("\nStudent ID: " + rs.getString("studentid"));
        System.out.print("\nBatch: " + rs.getString("batch"));
        System.out.println("\nName: " + rs.getString("name"));
        System.out.print("\n=================");

        // Xoa hang
        rs.deleteRow();
        rs.close();
        rs = stmt.executeQuery(sql);
        System.out.println("\nLiet ke result set sau khi xoa ...");
        printRs(rs);

        // Buoc 8: Don sach moi truong va giai phong resource
        stmt.close();
        conn.close();
    }
}
