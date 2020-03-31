/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class Teacher extends Person {

    float coefficientsSalary;
    String specialize;

    public Teacher() {
    }

    public Teacher(float coefficientsSalary, String specialize) {
        this.coefficientsSalary = coefficientsSalary;
        this.specialize = specialize;
    }

    public float getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(float coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public void inputInformation() {
        System.out.println("\tInput Information Student");
        inputInfor();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Coefficients Salary: ");
        this.coefficientsSalary = input.nextFloat();
        System.out.print("Input Specialize: ");
        input = new Scanner(System.in);
        this.specialize = input.nextLine();
    }

}
