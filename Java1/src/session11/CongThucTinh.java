/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class CongThucTinh implements CongThuc {

    @Override
    public float dienTichHinhVuong(float a) {
        return a * a;
    }

    @Override
    public float dienTichHinhChuNhat(float a, float b) {
        return a * b;
    }

    @Override
    public float chuViHinhVuong(float a) {
        return 4 * a;
    }

    @Override
    public float chuViHinhChuNhat(float a, float b) {
        return (a + b) * 2;
    }

    public static void main(String[] args) {
        float canh;
        float cDai, cRong;
        CongThucTinh tinh = new CongThucTinh();
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao canh hinh vuong: ");
        canh = input.nextFloat();
        System.out.println("Dien tich cua hinh vuong: " + tinh.dienTichHinhVuong(canh));
        System.out.println("Chu vi cua hinh vuong: " + tinh.chuViHinhVuong(canh));

        System.out.print("Nhap vao chieu dai cua hinh chu nhat: ");
        cDai = input.nextFloat();
        System.out.print("Nhap vao chieu rong cua hinh chu nhat: ");
        cRong = input.nextFloat();
        System.out.println("Dien tich cua hinh chu nhat: " + tinh.dienTichHinhChuNhat(cDai, cRong));
        System.out.println("Chua vi cua hinh chu nhat: " + tinh.chuViHinhChuNhat(cDai, cRong));
    }
}
