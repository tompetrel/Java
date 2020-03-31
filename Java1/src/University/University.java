/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class University {

    ArrayList<Student> listsStudents = new ArrayList<>();
    ArrayList<Teacher> liststTeachers = new ArrayList<>();

    public void inputStudent() {
        Student student = new Student();
        student.inputInformation();
        listsStudents.add(student);
    }

    public void inputTeacher() {
        Teacher teacher = new Teacher();
        teacher.inputInformation();
        liststTeachers.add(teacher);
    }

    public void showInformation() {
        System.out.println("\tInformation Student");
        for (int i = 0; i < listsStudents.size(); i++) {
            System.out.println("======");
            System.out.println("Student " + (i + 1));
            System.out.println("ID: " + listsStudents.get(i).getID());
            System.out.println("Full Name: " + listsStudents.get(i).getFullName());
            System.out.println("Year of birth: " + listsStudents.get(i).getYearOfBirth());
            System.out.println("ID of class: " + listsStudents.get(i).getIDOfClass());
            System.out.println("Average Mark: " + listsStudents.get(i).getAverageMark());
        }
        System.out.println("-----------");
        System.out.println("\tInformation Teacher");
        for (int i = 0; i < liststTeachers.size(); i++) {
            System.out.println("=======");
            System.out.println("Teacher " + (i + 1));
            System.out.println("ID: " + liststTeachers.get(i).getID());
            System.out.println("Full Name: " + liststTeachers.get(i).getFullName());
            System.out.println("Year of birth: " + liststTeachers.get(i).getYearOfBirth());
            System.out.println("Coefficients Salary: " + liststTeachers.get(i).getCoefficientsSalary());
            System.out.println("Specialize: " + liststTeachers.get(i).getSpecialize());
        }
    }

    public void searchByName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Name need search: ");
        String nameSearch = input.nextLine();
        for (int i = 0; i < listsStudents.size(); i++) {
            if (listsStudents.get(i).getFullName().equalsIgnoreCase(nameSearch)) {
                System.out.println("------------");
                System.out.println("Student " + (i + 1));
                System.out.println("ID: " + listsStudents.get(i).getID());
                System.out.println("Full Name: " + listsStudents.get(i).getFullName());
                System.out.println("Year of birth: " + listsStudents.get(i).getYearOfBirth());
                System.out.println("ID of class: " + listsStudents.get(i).getIDOfClass());
                System.out.println("Average Mark: " + listsStudents.get(i).getAverageMark());
            }
        }
        for (int i = 0; i < liststTeachers.size(); i++) {
            if (liststTeachers.get(i).getFullName().equalsIgnoreCase(nameSearch)) {
                System.out.println("------------");
                System.out.println("Teacher " + (i + 1));
                System.out.println("ID: " + liststTeachers.get(i).getID());
                System.out.println("Full Name: " + liststTeachers.get(i).getFullName());
                System.out.println("Year of birth: " + liststTeachers.get(i).getYearOfBirth());
                System.out.println("Coefficients Salary: " + liststTeachers.get(i).getCoefficientsSalary());
                System.out.println("Specialize: " + liststTeachers.get(i).getSpecialize());
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        do {
            System.out.println("\t---------------");
            System.out.println("\tMANAGEMENT PROGRAM STUDENTS AND TEACHERS");
            System.out.println("1. Enter Students Information.");
            System.out.println("2. Enter Teachers Information.");
            System.out.println("3. Display information of Students and Teachers.");
            System.out.println("4. Search for Students and Teachers by name.");
            System.out.println("5. Exit program.");
            System.out.print("Your choose: ");
            Scanner input = new Scanner(System.in);
            int yourChoose = input.nextInt();

            switch (yourChoose) {
                case 1:
                    university.inputStudent();
                    break;
                case 2:
                    university.inputTeacher();
                    break;
                case 3:
                    university.showInformation();
                    break;
                case 4:
                    university.searchByName();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
