package com.stackroute;

public class Prog9 {
    public String check(String s) {
        String str1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            str1 += s.charAt(i);
        }


        return str1;

    }
}