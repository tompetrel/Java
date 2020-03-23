/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
//2. Viết một chương trình để nhắc người dùng nhập 3 số nguyên và tìm giá trị lớn nhất.
public class session04_baitap02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập vào 3 số nguyên dương: ");
        System.out.println("Nhập vào số nguyên dương thứ nhất: ");
        a = input.nextInt();
        System.out.println("Nhập vào số nguyên dương thứ hai: ");
        b = input.nextInt();
        System.out.println("Nhập vào số nguyên dương thứ ba: ");
        c = input.nextInt();
        int max = (a > b) ? a : (b > c) ? b : c;
        System.out.println("so lon nhat trong 3 so la: " + max);
    }
}
