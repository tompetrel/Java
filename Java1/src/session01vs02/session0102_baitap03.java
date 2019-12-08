/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//3. Viết chương trình java để nhập 2 số từ bàn phím và in ra màn hình số lớn nhất trong 2 số.
package session01vs02;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session0102_baitap03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        {
            System.out.println("Input a: ");
            int a = input.nextInt();
            System.out.println("Input b: ");
            int b = input.nextInt();
            if(a>b){
                System.out.println("Max :"+a);
            }else{
                System.out.println("Max :"+b);
            }
        }
    }
}
