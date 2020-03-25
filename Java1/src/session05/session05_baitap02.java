/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05;

/**
 *
 * @author TAI
 */
//2. Hay in ra 10 so nguyen duong dau tien chia het cho 5
public class session05_baitap02 {

    public static void main(String[] args) {
        int i = 1, dem = 0;
        System.out.print("10 so nguyen duong dau tien chia het cho 5 la: ");
        do {
            if ((i % 5) == 0) {
                dem++;
                System.out.print(i + " ");
            }
            i++;
        } while (dem < 10);
    }
}
