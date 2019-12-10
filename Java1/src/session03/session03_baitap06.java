/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//6. Viết chương trình nhập vào tuổi và họ tên của một người . In tuổi và họ tên vừa nhập ra output.
package session03;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap06 {

    public static void main(String[] args) {
        int tuoi;
        String hoten;
        Scanner input = new Scanner(System.in);
        System.out.println("Input tuoi: ");
        tuoi = input.nextInt();
        System.out.println("Input ho ten: ");
        input = new Scanner(System.in);
        hoten = input.nextLine();
        System.out.println("Output tuoi: " + tuoi);
        System.out.println("Output ho ten: " + hoten);
    }
}
