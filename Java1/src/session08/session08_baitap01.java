/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session08;

import java.util.*;
import java.util.stream.IntStream;

/**
 *
 * @author TAI
 */
//1. Nhập vào từ bàn phím 10 số lẻ nguyên dương vào mảng, nếu không đúng bắt nhập lại.
//a) Sau đó tính tổng 5 số lẻ đầu tiên.
//b) Tính tổng 5 số lẻ cuối cùng.
//c) Tính tổng các số lẻ ở vị trí lẻ.
public class session08_baitap01 {

    public int Arr[] = new int[10];

    public session08_baitap01() {
    }

    void nhapSoLe() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Arr.length; i++) {
            do {
                System.out.print("Nhap phan tu thu A[" + i + "] = ");
                Arr[i] = input.nextInt();
            } while (Arr[i] % 2 == 0);
        }
        System.out.println("");
    }

    void hienThiMang() {
        System.out.print("Gia tri cua cac phan tu: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("");
    }

    void tinhTong5SoLeDauTien() {
        long tong = 0;
        for (int i = 0; i < 5; i++) {
            tong += Arr[i];
        }
        System.out.println("Tong 5 so le dau tien trong mang la: " + tong);
    }

    void tinhTong5SoLeCuoiCung() {
        //Dao nguoc mang
        for (int i = 0; i < Arr.length / 2; i++) {
            int temp = Arr[i];
            Arr[i] = Arr[Arr.length - 1 - i];
            Arr[Arr.length - 1 - i] = temp;
        }
        long tong = 0;
        for (int i = 0; i < 5; i++) {
            tong += Arr[i];
        }
        System.out.println("Tong 5 so le cuoi cung trong mang la: " + tong);
    }

    void tinhTongSoLeTaiViTriLe() {
        long tong = 0;
        for (int i = 1; i <= Arr.length; i++) {
            if (i % 2 != 0) {
                tong += Arr[i];
            }
        }
        System.out.println("Tong so le tai vi tri le trong mang la: " + tong);
    }

    public static void main(String[] args) {
        session08_baitap01 array = new session08_baitap01();
        array.nhapSoLe();
        array.hienThiMang();
        array.tinhTong5SoLeDauTien();
        array.tinhTong5SoLeCuoiCung();
        array.tinhTongSoLeTaiViTriLe();
    }
}
