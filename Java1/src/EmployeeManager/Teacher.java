/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManager;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class Teacher extends Person {

    private int hour;

    public Teacher() {
        System.out.print("Nhap hour: ");
        Scanner input = new Scanner(System.in);
        hour = input.nextInt();
        setSalary(hour * 100000);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        String str;
        str = "\tInformation Teacher";
        str = str + "\nID: " + getID();
        str = str + "\nTen: " + getName();
        if (isGender()) {
            str = str + "\nGioi tinh: Nam";
        } else {
            str = str + "\nGioi tinh: Nu";
        }
        str = str + "\nDia chi: " + getAddress();
        str = str + "\nEmail: " + getEmail();
        str = str + "\nPhone: " + getPhone();
        str = str + "\nHour: " + getHour();
        str = str + "\nSalary: " + getSalary();
        return str;
    }

}
