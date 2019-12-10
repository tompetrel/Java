/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//2. Khai báo biến instance, nhập giá trị cho biến instance từ bàn phím và in giá trị của biến instance ra output.
package session03;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class session03_baitap02 {

    String instance;

    public session03_baitap02(String s) {
        this.instance = s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input instance: ");
        String s = input.nextLine();
        session03_baitap02 ins = new session03_baitap02(s);
        System.out.println("Output instance: \n" + ins.instance);

    }

}
