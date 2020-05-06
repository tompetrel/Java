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
class HocVien<Key, Value> {

    private Key key;
    private Value value;

    public HocVien() {
    }

    public Key getKey() {
        return key;
    }

    public HocVien(Key key, Value value) {
        this.key = key;
        this.value = value;
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

class SoDienThoai extends HocVien<Integer, String> {

    public SoDienThoai() {
    }

    public SoDienThoai(Integer key, String value) {
        super(key, value);
    }
}

class DiaChi extends HocVien<Integer, Object> {

    public DiaChi() {
    }

    public DiaChi(Integer key, Object value) {
        super(key, value);
    }

}

class ThongTinLienHe<Key, Value, I> extends HocVien<Key, Value> {

    private I i;

    public ThongTinLienHe() {
    }

    public ThongTinLienHe(I i) {
        this.i = i;
    }

    public ThongTinLienHe(I i, Key key, Value value) {
        super(key, value);
        this.i = i;
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }

}

public class session04_baitap04 {

}
