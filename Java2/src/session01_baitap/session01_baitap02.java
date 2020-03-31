/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01_baitap;

/**
 *
 * @author TAI
 */
class PhepChiaException extends Exception {

    PhepChiaException(String str) {
        super(str);
    }
}

public class session01_baitap02 {

    void divNumber(int num1, int num2) throws PhepChiaException {
        if (num2 == 0) {
            throw new PhepChiaException("Khong the thuc hien phep chia cho so 0");
        } else {
            System.out.println("num1 / num2 = " + num1 / num2);
        }
    }

    public static void main(String[] args) {
        session01_baitap02 obj = new session01_baitap02();
        try {
            obj.divNumber(1, 0);
        } catch (PhepChiaException e) {
            System.out.println(e.getMessage());
        }
    }
}
