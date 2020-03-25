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
//8. Nhập vào một số gọi là tháng trong năm.
//Sau đó in ra màn hình tên tháng đó theo quy tắc:
//1, 2, 3: XUAN
//4, 5, 6: HA
//7, 8, 9: THU
//10, 11, 12: DONG
public class session04_baitap08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao thang trong nam :");
        int thang = input.nextInt();
        switch (thang) {
            case 1:
            case 2:
            case 3:
                System.out.println("Mua Xuan");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Mua Ha");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Mua Thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Mua Dong");
                break;
            default:
                System.out.println("So nhap vao khong phai la thang trong nam.");
        }
    }
}
