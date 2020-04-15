/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session03_baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap01 {

    static List arrListTenSinhVien;

    static void nhapDanhSachTenSinhVien() {
        Scanner input = new Scanner(System.in);
        int dem = 0;
        System.out.println("--------------------------------");
        System.out.println("Nhập tên các sinh viên trong lớp");
        do {
            dem++;
            System.out.print("Nhập tên sinh viên thứ " + dem + ": ");
            input = new Scanner(System.in);
            String tenSinhVien = input.nextLine();
            if (!tenSinhVien.isEmpty()) {
                arrListTenSinhVien.add(tenSinhVien);
            } else {
                break;
            }
        } while (true);
    }

    static void hienThiDanhSachTenSinhVien() {
        int dem = 0;
        System.out.println("---------------------------");
        System.out.println("Tên các sinh viên trong lớp");
        for (Object object : arrListTenSinhVien) {
            dem++;
            System.out.println("Tên sinh viên thứ " + dem + ": " + object);
        }
    }

    public static void main(String[] args) {
        arrListTenSinhVien = new ArrayList();
        nhapDanhSachTenSinhVien();
        hienThiDanhSachTenSinhVien();
    }
}
