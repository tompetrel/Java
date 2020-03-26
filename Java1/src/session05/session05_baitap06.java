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
//6. Viết chương trình nhập vào N số nguyên và tính tổng bậc 3 N số nguyên.
public class session05_baitap06 {

    public static void main(String[] args) {
        int n, tong = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            tong = (int) (tong + (Math.pow(i, 3)));
        }
        System.out.println("Tong bac 3 cua N so nguyen la: " + tong);
    }
}
