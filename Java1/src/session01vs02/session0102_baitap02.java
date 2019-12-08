/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//2. Viết chương trình java để tính tổng 2 số được nhập từ bàn phím và in ra màn hình tổng của 2 số đó.
//Gợi ý: dùng phương thức Integer.parseInt(var) để chuyển ký tự hoặc chuỗi var thành số nguyên
package session01vs02;

import java.util.*;

/**
 *
 * @author TAI
 */
public class session0102_baitap02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        {
            System.out.println("Input a: ");
            int a = input.nextInt();
            System.out.println("Input b: ");
            int b = input.nextInt();
            int total = a + b;
            System.out.println("Total a,b: " + total);

        }
    }
}
