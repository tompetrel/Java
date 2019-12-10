/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//8. Nhập vào 3 số nguyên từ bàn phím. Tìm giá trị trung bình của 3 số và in ra output.
package session03;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap08 {

    public static void main(String[] args) {
        int a, b, c;
        float tbc;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap gia tri a: ");
        a = nhap.nextInt();
        System.out.print("Nhap gia tri b: ");
        b = nhap.nextInt();
        System.out.print("Nhap gia tri c: ");
        c = nhap.nextInt();
        tbc = ((float) a + b + c) / 3;
        System.out.println("Trung binh cong cua 3 so a, b, c la: " + tbc);
    }
}
