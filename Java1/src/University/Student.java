/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class Student extends Person {

    String IDOfClass;
    float averageMark;

    public Student() {
    }

    public Student(String IDOfClass, float averageMark) {
        this.IDOfClass = IDOfClass;
        this.averageMark = averageMark;
    }

    public String getIDOfClass() {
        return IDOfClass;
    }

    public void setIDOfClass(String IDOfClass) {
        this.IDOfClass = IDOfClass;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public void inputInformation() {
        System.out.println("\tInput Information Student");
        inputInfor();
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID of Class: ");
        this.IDOfClass = input.nextLine();
        System.out.print("Input Average Mark: ");
        this.averageMark = input.nextFloat();
    }

}
