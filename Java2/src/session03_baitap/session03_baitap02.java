/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session03_baitap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author TAI
 */
public class session03_baitap02 {

    static Set setListTenSinhVien;

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
                setListTenSinhVien.add(tenSinhVien);
            } else {
                break;
            }
        } while (true);
    }

    static void hienThiDanhSachTenSinhVien() {
        int dem = 0;
        System.out.println("---------------------------");
        System.out.println("Tên các sinh viên trong lớp");
        for (Object object : setListTenSinhVien) {
            dem++;
            System.out.println("Tên sinh viên thứ " + dem + ": " + object);
        }
    }

    public static void main(String[] args) {
        setListTenSinhVien = new HashSet();
        nhapDanhSachTenSinhVien();
        hienThiDanhSachTenSinhVien();
    }
}
