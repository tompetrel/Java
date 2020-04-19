/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session03_baitap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap03 {

    static Map mapListTenSinhVien;

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
            if ((tenSinhVien.isEmpty())) {
                break;
            }
            System.out.print("Nhập số thứ tự bàn của sinh viên thứ " + dem + ": ");
            input = new Scanner(System.in);
            String soThuTu = input.nextLine();
            if (soThuTu.isEmpty()) {
                break;
            }
            if ((!tenSinhVien.isEmpty()) && (!soThuTu.isEmpty())) {
                mapListTenSinhVien.put(soThuTu, tenSinhVien);
            } else {
                break;
            }
        } while (true);
    }

    static void hienThiDanhSachTenSinhVien() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số thứ tự của sinh viên cần hiển thị tên: ");
            input = new Scanner(System.in);
            String soThuTuSinhVien = input.nextLine();
            if (!soThuTuSinhVien.isEmpty()) {
                if (mapListTenSinhVien.get(soThuTuSinhVien) != null) {
                    System.out.println("Tên của sinh viên có số thứ tự " + soThuTuSinhVien + " la: " + mapListTenSinhVien.get(soThuTuSinhVien));
                } else {
                    System.out.println("Số thứ tự vừa nhập không có");
                }
            } else {
                break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        mapListTenSinhVien = new HashMap();
        nhapDanhSachTenSinhVien();
        hienThiDanhSachTenSinhVien();
    }
}
