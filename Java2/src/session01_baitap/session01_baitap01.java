/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01_baitap;

/**
 *
 * @author TAI
 */
/*1. Viết chương trình thực hiện phép chia 2 số nguyên songuyen1 và songuyen2. Hiển thị kết quả của phép chia ra output
(ketqua=songuyen1/songuyen2). Nếu songuyen2 bằng 0 thì thực hiện bắt lỗi (sử dụng try catch, hiển thị ra output thông báo 
không thể thực hiện phép chia do songuyen2 bằng 0).*/
public class session01_baitap01 {

    public static void main(String[] args) {
        int num1 = 1, num2 = 0;
        try {
            System.out.println("Result = num1 / num2 = " + num1 / num2);
        } 
        catch(ArithmeticException error){
            System.out.println("Khong the thuc hien phep chia cho 0.");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
