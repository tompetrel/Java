/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiuaKy;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
/*Bài tập 1:

Viết class NhanVien gồm các thuộc tính:

+ Tên

+ Tuổi

+ Địa chỉ

+ Tiền lương (kiểu double)

+ Tổng số giờ làm (kiểu int)

Constructor không tham số. Constructor đầy đủ tham số.

Và các phương thức:

- void inputInfo() : Nhập các thông tin cho nhân viên từ bàn phím

- void printInfo() : in ra tất cả các thông tin của nhân viên

- double tinhThuong(): Tính toán và trả về số tiền thưởng của nhân viên theo công thức sau:

Nếu tổng số giờ làm của nhân viên >=200 thì thưởng = lương * 20%

Nếu tổng số giờ làm của nhân viên <200 và >=100 thì thưởng = lương * 10%

Nếu tổng số giờ làm của nhân viên <100 thì thưởng = 0*/
class NhanVien {

    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien ");
        System.out.print("Nhap ten nhan vien: ");
        this.ten = input.nextLine();
        System.out.print("Nhap tuoi cua nhan vien: ");
        this.tuoi = input.nextInt();
        System.out.print("Nhap dia chi cua nhan vien: ");
        input = new Scanner(System.in);
        this.diaChi = input.nextLine();
        System.out.print("Nhap tien luong cua nhan vien:");
        this.tienLuong = input.nextFloat();
        System.out.print("Nhap tong so gio lam cua nhan vien:");
        this.tongSoGioLam = input.nextInt();
    }

    void printInfo() {
        System.out.println("Thong tin cua nhan vien: ");
        System.out.println("Ten: " + this.ten);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Tien luong: " + this.tienLuong);
        System.out.println("Tong so gio lam: " + this.tongSoGioLam);
    }

    double tinhThuong(NhanVien nhanVien) {
        double tienThuong;
        if (tongSoGioLam >= 200) {
            tienThuong = tienLuong * 0.2;
        } else if (tongSoGioLam < 200 || tongSoGioLam >= 100) {
            tienThuong = tienLuong * 0.1;
        } else {
            tienThuong = 0;
        }
        return tienThuong;
    }
}

public class giuaky_baitap01 {

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.inputInfo();
        nhanVien.printInfo();
        System.out.println("Tien thuong nhan vien duoc: " + nhanVien.tinhThuong(nhanVien));
    }
}
