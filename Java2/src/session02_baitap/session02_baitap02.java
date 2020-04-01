/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session02_baitap;

/**
 *
 * @author TAI
 */
//2. Viết phương thức có tên sosanh2 để so sánh địa chỉ được cấp phát của 2 đối tượng có bằng nhau hay không.
public class session02_baitap02 {

    static void soSanh(session02_baitap02 obj1, session02_baitap02 obj2) {
        System.out.println(obj1.hashCode() + " vs " + obj2.hashCode());
        //so sánh địa chỉ cấp phát của 2 đôi tượng
        if (obj1.hashCode() == obj2.hashCode()) {
            System.out.println("Địa chỉ được cấp phát của 2 đối tượng bằng nhau");
        } else {
            System.out.println("Địa chỉ được cấp phát của 2 đối tượng không bằng nhau");
        }
    }

    public static void main(String[] args) {
        session02_baitap02 obj1 = new session02_baitap02();
        session02_baitap02 obj2 = new session02_baitap02();
        soSanh(obj1, obj2);
    }
}
