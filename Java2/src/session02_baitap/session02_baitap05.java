/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session02_baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TAI
 */
public class session02_baitap05 {
    public static void main(String[] args) {
        String str1 = "abc123def";
        String str2 = "abc";
//        String str2="123";
        String regex = ".*" + str2 + ".*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str1);
        System.out.println(matcher.matches());
    }
}
