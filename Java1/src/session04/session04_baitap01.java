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
//1. Viết chương trình để nhập một số nguyên bất kỳ từ bàn phím và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 100.
public class session04_baitap01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Nhập vào số nguyên bất kỳ: ");
        n = input.nextInt();
        if (n > 100) {
            System.out.println("Số vừa nhập lớn hơn 100");
        } else {
            if (n == 100) {
                System.out.println("Số vừa nhập là 100");
            } else {
                System.out.println("Số vừa nhập nhỏ hơn 100");
            }
        }

    }

}
