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
//5. Viết chương trình giải phương trình bậc hai (ax2 + bx + c = 0) với a,b,c nhập từ bàn phím.
public class session04_baitap05 {

    public static void main(String[] args) {
        float a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao he so a: ");
        a = input.nextFloat();
        System.out.print("Nhap vao he so b: ");
        b = input.nextFloat();
        System.out.print("Nhap vao he so c: ");
        c = input.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else {
                float x = -c / b;
                System.out.println("Phuong trinh co 1 nghiem la: X = " + x);
            }
        } else {
            float delta = b * b - 4 * a * c;
            float x, x1, x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co 2 nghiem :");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            } else if (delta == 0) {
                x = (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep : X = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}
