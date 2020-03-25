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
//1. Nhập vào từ bàn phím 1 số nguyên dương n, sau đó in ra từ 1 đến n có bao nhiêu số chia hết cho 3.
public class session05_baitap01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n: ");
        int n = input.nextInt();
        if (n > 0) {
            int check = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    System.out.println(i + " chia het cho 3");
                    check++;
                }
            }
            System.out.println("Co "+check+" so chia het cho 3.");
        }else{
            System.out.println("Nhap n khong hop le.");
        }
    }

}
