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
public class session02_baitap03 {

    String name;

    public session02_baitap03(String name) {
        this.name = name;
    }

    static void soSanh(session02_baitap03 obj1, session02_baitap03 obj2) {

        if (obj1.name.equalsIgnoreCase(obj2.name)) {
            if (obj1.hashCode() == obj2.hashCode()) {
                System.out.println("Các giá trị thuộc tính và địa chỉ được cấp phát của 2 đối tượng bằng nhau");
            } else {
                System.out.println("Các giá trị thuộc tính của 2 đối tượng bằng nhau và địa chỉ được cấp phát của 2 đối tượng không bằng nhau");
            }
        } else {
            if (obj1.hashCode() == obj2.hashCode()) {
                System.out.println("Các giá trị thuộc tính của 2 đối tượng không bằng nhau và địa chỉ được cấp phát của 2 đối tượng bằng nhau");
            } else {
                System.out.println("Các giá trị thuộc tính và địa chỉ được cấp phát của 2 đối tượng không bằng nhau");
            }
        }
    }

    public static void main(String[] args) {
        session02_baitap03 obj1 = new session02_baitap03("name1");
        session02_baitap03 obj2 = new session02_baitap03("name1");
        soSanh(obj1, obj2);
    }
}
