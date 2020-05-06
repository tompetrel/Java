/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04_baitap;

/**
 *
 * @author TAI
 */
public class session04_baitap03 {

    static <mang> void inMang(mang[] mangcanin) {
        for (mang phantumang : mangcanin) {
            System.out.print(phantumang + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Integer[] mangInteger = {1, 2, 3, 4, 5};
        inMang(mangInteger);
        Double[] mangDouble = {1.1, 2.2, 3.3, 4.4};
        inMang(mangDouble);
    }
}
