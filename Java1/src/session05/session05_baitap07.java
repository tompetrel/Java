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
//7. Viết chương trình tính tổng nghịch đảo của N số nguyên đầu tiên 
//theo công thức S = 1 + 1/2 + 1/3 + … + 1/N
public class session05_baitap07 {

    public static void main(String[] args) {
        int n;
        float tong = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            tong = tong + (1 / (float) i);
        }
        System.out.println("Tong nghich dao cua N so nguyen dau tien la: " + tong);

    }
}
