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
//11. Viết chương trình vẽ hình chữ nhật rỗng bằng các dấu *
//	**********
//	*        *
//	*        *
//	**********
public class session05_baitap11 {

    public static void main(String[] args) {
        int cDai, cRong;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        cDai = input.nextInt();
        System.out.println("Nhap vao chieu rong: ");
        cRong = input.nextInt();
        for (int i = 0; i < cRong; i++) {
            for (int j = 0; j < cDai; j++) {
                if (j == 0 || j == (cDai - 1) || i == 0 || i == (cRong - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
