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
//4. Yêu cầu người dùng nhập đúng yêu cầu: DIEM phải từ 0 đến 10 (dùng do ..while)
public class session05_baitap04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diem;
        do {
            System.out.println("Nhap vao Diem: ");
            diem = input.nextInt();
        } while (diem < 0 || diem > 10);
    }
}
