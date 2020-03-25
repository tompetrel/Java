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
//3. Hay yeu cau nguoi dung nhap vao 1 so le, neu khong dung yeu cau nhap lai.
public class session05_baitap03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soLe;
        do {
            System.out.println("Nhap vao 1 so le:");
            soLe = input.nextInt();
        } while ((soLe % 2) == 0);
    }
}
