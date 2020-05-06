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
//03. Nhập vào đường dẫn một thư mục và một số nguyên n(KB). Tìm tất cả các file có kích thước >n trong thư mục và in tên ra màn hình.
public class session05_baitap03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 duong dan: ");
        String path = input.nextLine();
        System.out.println("Nhap vao so nguyen n(KB):");
        input = new Scanner(System.in);
        int n = input.nextInt();
        File myFile = new File(path);
        System.out.println("Cac file co kich thuoc lon hon n(KB):");
        String[] listFile = myFile.list();
        for (String i : listFile) {
            myFile = new File(path, i);
            if (myFile.isFile()) {
                if ((myFile.length() / 1024) > n) {
                    System.out.println(myFile.getName());
                }
            }
        }
    }
}
