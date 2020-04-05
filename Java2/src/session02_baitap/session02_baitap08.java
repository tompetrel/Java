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
public class session02_baitap08 {
    public static void main(String[] args) {
        String str1 = "zz11,235.00vnd";
        String str2 = "";
        String regex = "[^\\d|,|\\.]";
        System.out.println(str1.replaceAll(regex, str2));
    }
}
