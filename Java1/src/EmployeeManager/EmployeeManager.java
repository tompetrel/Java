/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TAI
 */
/*Tạo class Person có các thuộc tính sau:
	private int ID;
	private String name;
	private boolean gender;
	private String address;
	private String email;
	private String phone;
	private float salary;

Tạo class Employee (thừa kế từ class Person) có các thuộc tính sau:
	private float basicSalary;

Tạo class Teacher (thừa kế từ class Person) có các thuộc tính sau:
	private int hour;

Tạo 1 project EmployeeManager có các chức năng như sau:
CHUONG TRINH QUAN LY NHAN SU
1. Nhap nhan vien
2. Nhap giao vien
3. In thong tin nhan vien va giao vien
4. Tinh tong luong phai tra
5. Thoat
Ban chon :

Chương trình chỉ thoát khi người sử dụng bấm số 5.
Mỗi class được lưu thành 01 file riêng.
Lương của Employee: salary=basicSalary*2.34.
Lương của Teacher: salary= hour*100000.
Dùng một ArrayList để quản lý Employee và Teacher.*/
public class EmployeeManager {

    ArrayList<Employee> listEmployee = new ArrayList<>();
    ArrayList<Teacher> listTeacher = new ArrayList<>();

    void nhapEmployee() {
        Employee employee = new Employee();
        listEmployee.add(employee);
    }

    void nhapTeacher() {
        Teacher teacher = new Teacher();
        listTeacher.add(teacher);
    }

    void hienThiInfoEmployee() {
        for (Employee list : listEmployee) {
            System.out.println(list);
        }
    }

    void hienThiInfoTeacher() {
        for (Teacher list : listTeacher) {
            System.out.println(list);
        }
    }

    float tongLuong() {
        float tongLuong;
        float luongEmployee = 0f, luongTeacher = 0f;
        for (Employee list : listEmployee) {
            luongEmployee = list.getSalary();
        }
        for (Teacher list : listTeacher) {
            luongTeacher = list.getSalary();
        }
        tongLuong = luongEmployee + luongTeacher;
        return tongLuong;
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        do {
            System.out.println("\tCHUONG TRINH QUAN LY NHAN SU");
            System.out.println("1. Nhap nhan vien");
            System.out.println("2. Nhap giao vien");
            System.out.println("3. In thong tin nhan vien va giao vien");
            System.out.println("4. Tinh tong luong phai tra");
            System.out.println("5. Thoat");
            System.out.print("ban chon: ");
            Scanner input = new Scanner(System.in);
            int chose = input.nextInt();
            switch (chose) {
                case 1:
                    manager.nhapEmployee();
                    break;
                case 2:
                    manager.nhapTeacher();
                    break;
                case 3:
                    manager.hienThiInfoEmployee();
                    manager.hienThiInfoTeacher();
                    break;
                case 4:
                    System.out.println("\tTong luong phai tra: " + manager.tongLuong());
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
