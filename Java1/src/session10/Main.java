/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

/**
 *
 * @author TAI
 */
//Bài tập 1:
//Dùng tính kế thừa khai báo 3 class:
//Class "Sinh Viên" gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền học phí còn nợ.
//Class "Giảng Viên" gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền lương hàng tháng.
//Class "Giám Đốc" gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền tiêu hàng tháng.
//
//Các thuộc tính để protected, truy cập các thuộc tính sử dụng phương thức getter và setter
//Tạo 1 đối tượng giảng viên, giá trị nhập vào từ bàn phím, in thông tin ra ngoài màn hình console
public class Main {

    public static void main(String[] args) {
//        SinhVien sinhVien = new SinhVien();
//        sinhVien.setInfo(sinhVien);
//        sinhVien.getInfo(sinhVien);

        GiangVien giangVien = new GiangVien();
        giangVien.setInfo(giangVien);
        giangVien.getInfo(giangVien);
    }
}
