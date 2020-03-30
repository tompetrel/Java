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
public class Employee extends Person {

    private float basicSalary;

    public Employee() {
        System.out.print("Nhap basic salary: ");
        Scanner input = new Scanner(System.in);
        basicSalary = input.nextFloat();
        setSalary((float) (basicSalary * 2.34));
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        String str;
        str = "\tInformation Employee";
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
        str = str + "\nBasic Salary: " + getBasicSalary();
        str = str + "\nSalary: " + getSalary();
        return str;
    }

}
