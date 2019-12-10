/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1. Khai báo biến local, nhập giá trị cho biến local từ bàn phím và in giá trị của biến local ra output.
package session03;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Input local: ");
            String local = input.nextLine();
            System.out.println("Output local: " + local);
        }
    }
}
