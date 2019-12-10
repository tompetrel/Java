/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//3. Khai báo biến static, nhập giá trị cho biến static từ bàn phím và in giá trị của biến static ra output.
package session03;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap03 {

    static String bienStatic;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input variable static: ");
        bienStatic = input.nextLine();
        System.out.println("Output variable static: \n" + bienStatic);
    }
}
