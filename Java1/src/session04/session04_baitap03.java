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
//3.  Viết chương trình nhập vào 2 số nguyên, hiển thị chức năng cho phép người dùng lựa chọn.
//Nhấn phím số 1: Thực hiện phép cộng
//Nhấn phím số 2: Thực hiện phép trừ
//Nhấn phím số 3: Thực hiện phép nhân
//Nhấn phím số 4: Thực hiện phép chia
public class session04_baitap03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu nhat:");
        int a = input.nextInt();
        System.out.println("Nhap so nguyen thu hai:");
        int b = input.nextInt();
        System.out.println("Nhan phim so 1: Thuc hien phep cong ");
        System.out.println("Nhan phim so 2: Thuc hien phep tru ");
        System.out.println("Nhan phim so 3: Thuc hien phep nhan ");
        System.out.println("Nhan phim so 4: Thuc hien phep chia ");
        System.out.println("Nhap phep tinh can thuc hien:");
        int pheptinh = input.nextInt();
        switch (pheptinh) {
            case 1:
                System.out.println("Phep tinh cong bang :" + (a + b));
                break;
            case 2:
                System.out.println("Phep tinh tru bang :" + (a - b));
                break;
            case 3:
                System.out.println("Phep tinh nhan bang :" + (a * b));
                break;
            case 4:
                System.out.println("Phep tinh chia bang :" + ((float) a / b));
                break;
            default:
                System.out.println("Phim nhap vao khong dung !");
        }

    }
}
