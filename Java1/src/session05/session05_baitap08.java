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
//8. Viết chương trình nhập vào số nguyên N và tính tổng bình phương các số lẻ 
//từ 1 đến N.
public class session05_baitap08 {

    public static void main(String[] args) {
        int n;
        long tong = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao N: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                tong += i * i;
            }
        }
        System.out.println("Tong binh phuong cac so le la: " + tong);
    }
}
