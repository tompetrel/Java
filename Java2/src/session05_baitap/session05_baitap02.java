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
//02. Nhập vào một đường dẫn thư mục, liệt kê tên tất cả các file có phần mở rộng là .java
public class session05_baitap02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 duong dan: ");
        String path = input.nextLine();
        File myFile = new File(path);
        boolean check = false;
        String[] listFile = myFile.list();
        for (String i : listFile) {
            if (i.endsWith(".java")) {
                check = true;
            }
        }
        if (!check) {
            System.out.println("Thu muc khong chua file co phan mo rong .java");

        } else {
            System.out.println("Cac file co phan mo rong .java");
            for (String i : listFile) {
                if (i.endsWith(".java")) {
                    myFile = new File(path, i);
                    if (myFile.isFile()) {
                        System.out.println("File co duoi .java: " + myFile.getName());
                    }
                }
            }
        }
    }
}
