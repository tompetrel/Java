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
//2. Nhập vào từ bàn phím 10 số nguyên dương vào mảng
//a) In ra các số theo hướng ngược lại so với thứ tự nhập.
//b) In ra các số theo hướng ngược lại so với thứ tự nhập tại vị trí chẵn.
public class session08_baitap02 {

    public static void main(String[] args) {
        int Arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Arr.length; i++) {
            do {
                System.out.print("Nhap phan tu thu A[" + i + "] = ");
                Arr[i] = input.nextInt();
            } while (Arr[i] <= 0);
        }
        System.out.print("Gia tri cua cac phan tu: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }

        //Cau A:
        for (int i = 0; i < Arr.length / 2; i++) {
            int temp = Arr[i];
            Arr[i] = Arr[Arr.length - 1 - i];
            Arr[Arr.length - 1 - i] = temp;
        }
        System.out.println("");
        System.out.print("Dao nguoc lai: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        //Cau B:
        System.out.println("");
        System.out.print("Gia tri cua cac phan tu tai vi tri chan sao khi dao: ");
        for (int i = 0; i < Arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(Arr[i] + " ");
            }
        }
    }
}
