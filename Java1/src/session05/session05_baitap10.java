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
//10. Viết chương trình vẽ hình chữ nhật bằng các dấu *
//	**********
//	**********
//	**********
//	**********
public class session05_baitap10 {
    public static void main(String[] args) {
        int cDai,cRong;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        cDai = input.nextInt();
        System.out.println("Nhap vao chieu rong: ");
        cRong = input.nextInt();
        for(int i=1;i<=cRong;i++){
            for(int j=1;j<=cDai;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
            
        
    }
}
