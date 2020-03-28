/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
public class SinhVien {

    protected String Name;
    protected int birthDay;
    protected String keyCard;
    protected float tienHocPhiConNo;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getKeyCard() {
        return keyCard;
    }

    public void setKeyCard(String keyCard) {
        this.keyCard = keyCard;
    }

    public float getTienHocPhiConNo() {
        return tienHocPhiConNo;
    }

    public void setTienHocPhiConNo(float tienHocPhiConNo) {
        this.tienHocPhiConNo = tienHocPhiConNo;
    }

    public void setInfo(SinhVien sinhVien) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.print("Nhap Name: ");
        this.Name = input.nextLine();
        System.out.print("Nhap birth day: ");
        input = new Scanner(System.in);
        this.birthDay = input.nextInt();
        System.out.print("Nhap keycard: ");
        input = new Scanner(System.in);
        this.keyCard = input.nextLine();
        System.out.print("Nhap tien no hoc phi: ");
        input = new Scanner(System.in);
        this.tienHocPhiConNo = input.nextFloat();
    }

    public void getInfo(SinhVien sinhVien) {
        System.out.println("Thong tin: ");
        System.out.println("Name: " + this.Name);
        System.out.println("Birth day: " + this.birthDay);
        System.out.println("KeyCard: " + this.keyCard);
        System.out.println("Tien no hoc phi: " + this.tienHocPhiConNo);
    }

}
