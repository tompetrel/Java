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
class classAllKeyValue<Key, Value> {

    private Key key;
    private Value value;

    public classAllKeyValue() {
    }

    public Key getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setValue(Value value) {
        this.value = value;
    }

}

public class session04_baitap02 {

    static void classHoTenNamSinh() {
        classAllKeyValue<String, Integer> classHoten_NamSinh = new classAllKeyValue<>();
        classHoten_NamSinh.setKey("Nguyen Van Thanh");
        classHoten_NamSinh.setValue(1990);
        System.out.println("Họ tên: " + classHoten_NamSinh.getKey());
        System.out.println("Năm sinh: " + classHoten_NamSinh.getValue());
    }

    static void classNamSinhHoTen() {
        classAllKeyValue<Integer, String> classHoten_NamSinh = new classAllKeyValue<>();
        classHoten_NamSinh.setKey(1990);
        classHoten_NamSinh.setValue("Nguyen Van Thanh");
        System.out.println("Họ tên: " + classHoten_NamSinh.getKey());
        System.out.println("Năm sinh: " + classHoten_NamSinh.getValue());
    }

    public static void main(String[] args) {
        classHoTenNamSinh();
        System.out.println("");
        classNamSinhHoTen();
    }
}
