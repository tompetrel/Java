/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;

import java.util.Scanner;

/**
 *
 * @author TAI
 */
//6. Viết chương trình nhập vào điểm 3 môn thi: Toán, Lý, Hóa của học sinh. 
//Nếu tổng điểm >= 15 và không có môn nào dưới 4 thì in kết quả đậu. 
//Nếu đậu mà các môn đều lớn hơn 5 thì in ra lời phê "Học đều các môn", 
//ngược lại in ra "Học chưa đều các môn", các trường hợp khác là "Thi hỏng".
public class session04_baitap06 {

    public static void main(String[] args) {
        float dToan, dLy, dHoa;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao diem toan: ");
        dToan = input.nextFloat();
        System.out.println("Nhap vao diem ly: ");
        dLy = input.nextFloat();
        System.out.println("Nhap vao diem hoa: ");
        dHoa = input.nextFloat();

        if (dToan < 0 || dLy < 0 || dHoa < 0) {
            System.out.println("Nhap khong hop le.");
        } else {
            if (((dToan + dLy + dHoa) >= 15) && (dToan >= 4) && (dLy >= 4) && (dHoa >= 4)) {
                if (dToan > 5 && dLy > 5 && dHoa > 5) {
                    System.out.println("Thi dau 'Hoc deu cac mon'");
                } else {
                    System.out.println("Hoc chua deu cac mon");
                }
            } else {
                System.out.println("Thi hong");
            }
        }
    }

}
