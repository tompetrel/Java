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
//1. Viết phương thức có tên sosanh1 để so sánh các giá trị thuộc tính của 
//2 đối tượng có bằng nhau hay không.
public class session02_baitap01 {

    String name;

    public session02_baitap01(String name) {
        this.name = name;
    }

    static void soSanh(session02_baitap01 obj1, session02_baitap01 obj2) {
        //so sánh 2 giá trị của 2 đối tượng có bằng nhau không
        if (obj1.name.equalsIgnoreCase(obj2.name)) {
            System.out.println("Giá trị của 2 đối tượng bằng nhau");
        } else {
            System.out.println("Giá trị của 2 đối tượng không bằng nhau");
        }
    }

    public static void main(String[] args) {
        session02_baitap01 obj1 = new session02_baitap01("Name1");
        session02_baitap01 obj2 = new session02_baitap01("name1");
        soSanh(obj1, obj2);
    }
}
