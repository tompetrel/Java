/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session08;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class Student {

    String Name;
    int Age;
    float English, Computer, Math, markAverage;
    String level;

    public Student(String Name, int Age, float English, float Computer, float Math) {
        this.Name = Name;
        this.Age = Age;
        this.English = English;
        this.Computer = Computer;
        this.Math = Math;
        this.markAverage = 0;
        this.level = "";
    }

    public void hienThiThongTinSinhVien(Student student, int soThuTu) {

        System.out.println("Student " + (soThuTu + 1) + ": ");
        System.out.println("\tName: " + this.Name);
        System.out.println("\tAge: " + this.Age);
        System.out.println("\tMarks:");
        System.out.println("\t\tEnglish: " + this.English);
        System.out.println("\t\tComputer: " + this.Computer);
        System.out.println("\t\tMath: " + this.Math);
    }

    public void diemTrungBinh(Student student, int soThuTu) {
        System.out.println("Student " + (soThuTu + 1) + ":");
        System.out.println("\tName: " + this.Name);
        this.markAverage = (this.English + this.Computer + this.Math) / 3;
        System.out.println("\tMarks Average: " + this.markAverage);
    }

    public void xepLoai(Student student, int soThuTu) {

        if (this.markAverage >= 8) {
            this.level = "Excellent";
        } else {
            if ((this.markAverage < 8) && (this.markAverage >= 6.5)) {
                this.level = "Good";
            } else {
                if ((this.markAverage < 6.5) && (this.markAverage >= 5)) {
                    this.level = "Average";
                } else {
                    if ((this.markAverage < 5) && (this.markAverage >= 3.5)) {
                        this.level = "Weak";
                    } else {
                        this.level = "Poor";
                    }
                }
            }
        }
        System.out.println("Student " + (soThuTu + 1) + ":");
        System.out.println("\tName: " + this.Name);
        System.out.println("\tMarks Average: " + this.markAverage);
        System.out.println("\tLevel: " + this.level);
    }

    public static void sapXepDiemAnhVan(Student[] student, int soLuongSinhVien) {
        for (int i = 0; i < soLuongSinhVien - 1; i++) {
            for (int j = i + 1; j < soLuongSinhVien; j++) {
                if (student[i].English < student[j].English) {
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        System.out.println("Number 1 EngLish:");
        System.out.println("\tName: " + student[0].Name);
        System.out.println("\tMark: " + student[0].English);
    }

    public static void sapXepDiemTinHoc(Student[] student, int soLuongSinhVien) {
        for (int i = 0; i < soLuongSinhVien - 1; i++) {
            for (int j = i + 1; j < soLuongSinhVien; j++) {
                if (student[i].Computer < student[j].Computer) {
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        System.out.println("Number 1 Computer:");
        System.out.println("\tName: " + student[0].Name);
        System.out.println("\tMark: " + student[0].Computer);
    }

    public static void sapXepDiemToan(Student[] student, int soLuongSinhVien) {
        for (int i = 0; i < soLuongSinhVien - 1; i++) {
            for (int j = i + 1; j < soLuongSinhVien; j++) {
                if (student[i].Math < student[j].Math) {
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        System.out.println("Number 1 Math:");
        System.out.println("\tName: " + student[0].Name);
        System.out.println("\tMark: " + student[0].Math);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] student = new Student[10];
        System.out.print("Nhap so luong sinh vien: ");
        int soLuongSinhVien = input.nextInt();
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
            System.out.print("\tHo van ten: ");
            input = new Scanner(System.in);
            String hovaten = input.nextLine();
            System.out.print("\tTuoi: ");
            int tuoi = input.nextInt();
            System.out.print("\tDiem Anh van: ");
            float diemAnhVan = input.nextFloat();
            System.out.print("\tDiem Tin hoc: ");
            float diemTinHoc = input.nextFloat();
            System.out.print("\tDiem Toan: ");
            float diemToan = input.nextFloat();
            student[i] = new Student(hovaten, tuoi, diemAnhVan, diemTinHoc, diemToan);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Thong tin cua cac sinh vien:");
        for (int i = 0; i < soLuongSinhVien; i++) {
            student[i].hienThiThongTinSinhVien(student[i], i);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Diem trung binh cua cac sinh vien:");
        for (int i = 0; i < soLuongSinhVien; i++) {
            student[i].diemTrungBinh(student[i], i);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Xep loai cua cac sinh vien:");
        for (int i = 0; i < soLuongSinhVien; i++) {
            student[i].xepLoai(student[i], i);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Danh sach cac sinh vien co diem cao nhat cua tung mon:");
        sapXepDiemAnhVan(student, soLuongSinhVien);
        sapXepDiemTinHoc(student, soLuongSinhVien);
        sapXepDiemToan(student, soLuongSinhVien);
    }
}
