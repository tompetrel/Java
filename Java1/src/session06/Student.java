/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session06;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class Student {

    String Name;
    int Age;
    float English;
    float Computer;
    float Math;

    public Student(String Name, int Age, float English, float Computer, float Math) {
        this.Name = Name;
        this.Age = Age;
        this.English = English;
        this.Computer = Computer;
        this.Math = Math;
    }

    public void hienThiThongTinSinhVien() {
        System.out.println("\tName : " + Name);
        System.out.println("\tAge : " + Age);
        System.out.println("\tMask : ");
        System.out.println("\t\tEnglish : " + English);
        System.out.println("\t\tComputer : " + Computer);
        System.out.println("\t\tMath : " + Math);
    }

    public void hienThiDiemTB(String Name, float English, float Computer, float Math) {
        float diemTB = (English + Computer + Math) / 3;
        System.out.println("\tName: " + Name);
        System.out.println("\tMaskAvg: " + diemTB);
        if (diemTB >= 8) {
            System.out.println("Excellent");
        } else if (diemTB >= 6.5) {
            System.out.println("Good");
        } else if (diemTB >= 5) {
            System.out.println("Average");
        } else if (diemTB >= 3.5) {
            System.out.println("Weak");
        } else {
            System.out.println("Poor");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien 1: ");
        System.out.print("Name: ");
        String ten = input.nextLine();
        System.out.print("Age: ");
        int tuoi = input.nextInt();
        System.out.println("English: ");
        float anhVan = input.nextFloat();
        System.out.println("Computer: ");
        float tinHoc = input.nextFloat();
        System.out.println("Math: ");
        float toan = input.nextFloat();
        Student student1 = new Student(ten, tuoi, anhVan, tinHoc, toan);

        input = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien 2: ");
        System.out.print("Name: ");
        ten = input.nextLine();
        System.out.print("Age: ");
        tuoi = input.nextInt();
        System.out.println("English: ");
        anhVan = input.nextFloat();
        System.out.println("Computer: ");
        tinHoc = input.nextFloat();
        System.out.println("Math: ");
        toan = input.nextFloat();
        Student student2 = new Student(ten, tuoi, anhVan, tinHoc, toan);

        System.out.println("Sinh vien 1");
        student1.hienThiThongTinSinhVien();
        System.out.println("Student 1: ");
        student1.hienThiDiemTB(student1.Name, student1.English, student1.Computer, student1.Math);

        System.out.println("Sinh vien 2");
        student2.hienThiThongTinSinhVien();
        System.out.println("Student 2: ");
        student2.hienThiDiemTB(student2.Name, student2.English, student2.Computer, student2.Math);
    }
}
