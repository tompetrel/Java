/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session08;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
//3. Nhập vào từ bàn phím ma trận vuông 2 x 2 các số nguyên dương.
//a) In ma trận vừa nhập ra màn hình.
//b) Đếm có bao nhiêu số lẻ trong ma trận.
//c) In ra các tổng từng dòng của ma trận.
//d) Tìm số lớn nhất, bé nhất trong ma trận.
//e) In ra 2 tổng của 2 đường chéo của ma trận.
public class session08_baitap03 {

    int[][] A = new int[2][2];

    public session08_baitap03() {
    }

    void nhapCacPhanTuVaoMaTran() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
    }

    void hienThiMaTran() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
    }

    int demSoLeTrongMaTran() {
        int cout = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (A[i][j] % 2 != 0) {
                    cout++;
                }
            }
        }
        return cout;
    }

    void tongTungDongTrongMaTran() {
        for (int i = 0; i < 2; i++) {
            long tong = 0;
            for (int j = 0; j < 2; j++) {
                tong += A[i][j];
            }
            System.out.println("Tong dong thu " + (i + 1) + " la :" + tong);

        }
    }

    int maxTrongMaTran() {
        int max = A[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }
        return max;
    }

    int minTrongMaTran() {
        int min = A[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }
        }
        return min;
    }

    void tong2DuongCheo() {
        int tongChinh = 0;
        int tongPhu = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    tongChinh += A[i][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j == 2 - 1) {
                    tongPhu += A[i][j];
                }
            }
        }
        System.out.println("Tong cua duong cheo chinh trong ma tran: " + tongChinh);
        System.out.println("Tong cua duong cheo phu trong ma tran: " + tongPhu);
    }

    public static void main(String[] args) {
        session08_baitap03 maTran = new session08_baitap03();
        maTran.nhapCacPhanTuVaoMaTran();
        //cau a: hien thi ra man hinh
        maTran.hienThiMaTran();
        //b) Đếm có bao nhiêu số lẻ trong ma trận.
        System.out.println("Co " + maTran.demSoLeTrongMaTran() + " so le trong ma tran.");
        //c) In ra các tổng từng dòng của ma trận.
        maTran.tongTungDongTrongMaTran();
        //d) Tìm số lớn nhất, bé nhất trong ma trận.
        System.out.println("Max : " + maTran.maxTrongMaTran());
        System.out.println("Min : " + maTran.minTrongMaTran());
        //e) In ra 2 tổng của 2 đường chéo của ma trận.
        maTran.tong2DuongCheo();

    }
}
