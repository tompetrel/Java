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
//9. Viết chương trình nhập vào 1 số từ 0 đến 9. In ra chữ số tương ứng. 
//Ví dụ: nhập vào số 5, in ra "Năm"
public class session05_baitap09 {

    public static void main(String[] args) {
        int so;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap vao 1 so tu 0 -> 9 (nhap so khong tu 0->9 de exit):");
            so = input.nextInt();
            switch (so) {
                case 0:
                    System.out.println("Khong");
                    break;
                case 1:
                    System.out.println("Mot");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bon");
                    break;
                case 5:
                    System.out.println("Nam");
                    break;
                case 6:
                    System.out.println("Sau");
                    break;
                case 7:
                    System.out.println("Bay");
                    break;
                case 8:
                    System.out.println("Tam");
                    break;
                case 9:
                    System.out.println("Chin");
                    break;
            }
        } while (so >= 0 && so <= 9);
    }
}
