/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class GiangVien extends SinhVien {

    protected float tienLuongHangThang;

    public float getTienLuongHangThang() {
        return tienLuongHangThang;
    }

    public void setTienLuongHangThang(float tienLuongHangThang) {
        this.tienLuongHangThang = tienLuongHangThang;
    }

    public void setInfo(GiangVien giangVien) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thong tin giang vien: ");
        System.out.print("Nhap Name: ");
        this.Name = input.nextLine();
        System.out.print("Nhap birth day: ");
        input = new Scanner(System.in);
        this.birthDay = input.nextInt();
        System.out.print("Nhap keycard: ");
        input = new Scanner(System.in);
        this.keyCard = input.nextLine();
        System.out.print("Nhap tien luong hang thang: ");
        input = new Scanner(System.in);
        this.tienLuongHangThang = input.nextFloat();
    }

    public void getInfo(GiangVien giangVien) {
        System.out.println("Thong tin: ");
        System.out.println("Name: " + this.Name);
        System.out.println("Birth day: " + this.birthDay);
        System.out.println("KeyCard: " + this.keyCard);
        System.out.println("Tien luong hang thang: " + this.tienLuongHangThang);
    }
}
