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
//9. Nhập vào một số gọi là điểm trung bình của 1 học sinh.
//Sau đó in ra màn hình xếp loại học tập của học sinh đó theo quy tắc sau:
//	+ >= 9.0 là XUẤT SẮC
//	+ 9 < điểm <= 8 là GIỎI
//	+ 8 < điểm <= 6.5 là KHÁ
//	+ 6.5 < điểm <= 5.0 là TRUNG BÌNH
//	+ còn lại là YẾU
public class session04_baitap09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao diem trung binh cua hoc sinh: ");
        float diemTB = input.nextFloat();
        if (diemTB < 0) {
            System.out.println("Nhap khong hop le.");
        } else {
            if (diemTB >= 9) {
                System.out.println("Xuat sac");
            } else if (diemTB < 9 && diemTB >= 6.5) {
                System.out.println("Kha");
            } else if (diemTB < 6.5 && diemTB >= 5) {
                System.out.println("Trung binh");
            } else {
                System.out.println("Yeu");
            }

        }
    }
}
