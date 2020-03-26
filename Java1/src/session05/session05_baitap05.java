/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
//5. Yêu cầu người dùng nhập đúng yêu cầu: THANG phải từ 1 đến 12 (dùng do ..while)?
public class session05_baitap05 {

    public static void main(String[] args) {
        int thang;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao thang: (thang phai tu 1 den 12)");
            thang = input.nextInt();
        } while (thang < 1 || thang > 12);
    }
}
