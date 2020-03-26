/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session07;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class Student {

    String Name;
    int Age;
    float English, Computer, Math;

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.Name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        this.Age = input.nextInt();
        System.out.print("Nhap diem anh van: ");
        this.English = input.nextFloat();
        System.out.print("Nhap diem tin hoc: ");
        this.Computer = input.nextFloat();
        System.out.print("Nhap diem toan: ");
        this.Math = input.nextFloat();
    }

    public void hienThiThongTinSInhVien(Student student) {
        System.out.println("\tName: " + student.Name);
        System.out.println("\tAge: " + student.Age);
        System.out.println("\tMarks:");
        System.out.println("\t\tEnglish: " + student.English);
        System.out.println("\t\tComputer: " + student.Computer);
        System.out.println("\t\tMath: " + student.Math);
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println("Student 1:");
        student1.hienThiThongTinSInhVien(student1);
        System.out.println("Student 2:");
        student2.hienThiThongTinSInhVien(student2);
        System.out.println("Student 3:");
        student3.hienThiThongTinSInhVien(student3);
    }
}
