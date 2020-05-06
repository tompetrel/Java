/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05_baitap;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author TAI
 */
//01. Nhập vào đường dẫn, kiểm tra xem đường dẫn đó có tồn tại không? Nếu có, đó là đường dẫn file hay thư mục?
public class session05_baitap01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 duong dan: ");
        String path = input.nextLine();
        File myFile = new File(path);
        if (myFile.exists()) {
            if (myFile.isDirectory()) {
                System.out.println("Duong dan nhap vao la 1 thu muc");
            } else {
                System.out.println("Duong dan nhap vao la 1 file");
            }
        } else {
            System.out.println("Duong dan nhap vao khong dung");
        }
    }
}
