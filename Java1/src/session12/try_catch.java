/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session12;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class try_catch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen: ");
        System.out.print("So nguyen 1: ");
        int soNguyen1 = input.nextInt();
        System.out.print("So nguyen 2: ");
        int soNguyen2 = input.nextInt();

        try {
            float ketqua = soNguyen1 / soNguyen2;
            System.out.println("Ket qua phep chia: " + ketqua);
        } catch (ArithmeticException error) {
            if (error.getMessage().equalsIgnoreCase("/ by zero")) {
                System.out.println("Khong the thuc hien phep chia cho 0.");
            }
        }
    }
}
