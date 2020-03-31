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
public class Person {

    String ID;
    String fullName;
    int yearOfBirth;

    public Person() {
    }

    public Person(String ID, String fullName, int yearOfBirth) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void inputInfor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID: ");
        this.ID = input.nextLine();
        System.out.print("Input Full Name: ");
        input = new Scanner(System.in);
        this.fullName = input.nextLine();
        System.out.print("Input year of birth: ");
        this.yearOfBirth = input.nextInt();

    }

}
