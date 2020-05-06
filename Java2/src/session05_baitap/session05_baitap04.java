/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05_baitap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author TAI
 */
//04. Viết chương trình copy một file như sau:
//Yêu cầu người dung nhập vào đường dẫn một file, đặt tên là source, và đường dẫn tới một thư mục, đặt tên là destination, 
//rồi copy file từ đường dẫn source vào thư mục destination, nếu trong thư mục destination đã tồn tại file giống source, 
//thì thêm đuôi “ – Copy”  vào tên file source.
public class session05_baitap04 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao mot duong dan file goc(vidu: c:\\test.txt): ");
        String sourcePath = input.nextLine();
        input = new Scanner(System.in);
        System.out.print("Nhap vao mot duong dan thu muc dich(vidu: c:\\): ");
        String destinationPath = input.nextLine();
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        if (!sourceFile.exists()) {
            System.out.println("Duong dan file goc khong ton tai!");
            System.exit(0);
        }
        if (!destinationFile.exists()) {
            System.out.println("Duong dan file dich khong ton tai!");
            System.exit(0);
        }
        if (!sourceFile.isFile()) {
            System.out.println("Duong dan file goc khong phai la 1 file!");
        } else {
            destinationFile = new File(destinationPath, sourceFile.getName());
            if (destinationFile.exists()) {
                destinationFile = new File(destinationPath, sourceFile.getName().substring(0, sourceFile.getName().indexOf(".")) + "-Copy" + sourceFile.getName().substring(sourceFile.getName().indexOf("."), sourceFile.getName().length()));
            }
            FileInputStream inputFile = null;
            FileOutputStream outputFile = null;
            try {
                inputFile = new FileInputStream(sourceFile);
                outputFile = new FileOutputStream(destinationFile);

                int c;
                while ((c = inputFile.read()) != -1) {
                    outputFile.write(c);
                }

            } finally {
                if (inputFile != null) {
                    inputFile.close();
                }
                if (outputFile != null) {
                    outputFile.close();
                }
            }
        }
    }
}
