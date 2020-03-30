/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiuaKy;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
/*Bài tập 2:

Tạo lớp Student, lưu trữ các thông tin một sinh viên:

- Mã sinh viên: chứa 8 kí tự

- Điểm trung bình: từ 0.0 – 10.0

- Tuổi: Phải lớn hơn hoặc bằng 18

- Lớp: Phải bắt đầu bởi kí tự ‘A’ hoặc kí tự ‘C’

Constructor không tham số. Constructor đầy đủ tham số.

a. phương thức inputInfo(), nhập thông tin Student từ bàn phím

b. phương thức showInfo(), hiển thị tất cả thông tin Student

c. Viết phương thức xét xem Student có được học bổng không? Điểm trung bình trên 8.0 là được học bổng*/
class Student {

    String maSV;
    float diemTB;
    int tuoi;
    String lop;

    public Student() {
    }

    public Student(String maSV, float diemTB, int tuoi, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    void inputInfo() {
        System.out.println("Nhap vao thong tin cua sinh vien:");
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhap ma sinh vien(8 ki tu): ");
            maSV = input.nextLine();
        } while (maSV.length() != 8);
        do {
            System.out.print("Nhap diem trung binh(tu 0 den 10): ");
            diemTB = input.nextFloat();
        } while (diemTB < 0 || diemTB > 10);
        do {
            System.out.print("Nhap tuoi cua sinh vien(tuoi >=18): ");
            tuoi = input.nextInt();
        } while (tuoi < 18);
        do {
            System.out.print("Nhap lop ma sinh vien dang hoc(bat dau bang A hoac C): ");
            input = new Scanner(System.in);
            lop = input.nextLine();
        } while (lop.charAt(0) != 'A' && lop.charAt(0) != 'C');
    }

    void showInfo() {
        System.out.println("Thong tin cua sinh vien:");
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Tuoi sinh vien: " + tuoi);
        System.out.println("Diem trung binh sinh vien: " + diemTB);
        System.out.println("Lop cua sinh vien: " + lop);
    }

    void hocBong() {
        if (diemTB >= 8) {
            System.out.println("Sinh vien duoc nhan hoc bong.");
        } else {
            System.out.println("Sinh vien khong du dieu kien nhan hoc bong.");
        }
    }

}

public class giuaky_baitap02 {

    public static void main(String[] args) {
        Student student = new Student();
        student.inputInfo();
        student.showInfo();
        student.hocBong();
    }
}
