/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session02_baitap;

/**
 *
 * @author TAI
 */
public class session02_baitap09 {

    public static void main(String[] args) {
        String str1 = "Lấp lánh, lấp lánh, sao nhỏ \nTôi tự hỏi bạn là gì. \nHãy vượt lên trên thế giới cao như vậy \nGiống như một viên kim cương trên bầu trời.";
        String str2 = "";
        String regex = "\n";
        System.out.println(str1.replaceAll(regex, str2));
    }
}
