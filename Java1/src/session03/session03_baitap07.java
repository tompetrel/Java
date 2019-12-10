/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//7. Nhập vào 3 số từ bàn phím. Dùng toán tử ?: để tìm giá trị lớn nhất của 3 số và in ra output.
package session03;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap07 {

    public static void main(String[] args) {
        int a, b, c, max;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap gia tri a: ");
        a = nhap.nextInt();
        System.out.print("Nhap gia tri b: ");
        b = nhap.nextInt();
        System.out.print("Nhap gia tri c: ");
        c = nhap.nextInt();
        max = (a > c) ? (a > b ? a : b) : (b > c ? b : c);
        System.out.println("Gia tri lon nhat la: " + max);
    }
}
