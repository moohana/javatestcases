package com.stackroute;

public class Cons{
    public String check(String s) {
        char ch = '\u0000';
        int countv = 0, countc = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countc++;
            } else {
                countv++;
            }
        }
        if (countc > 0 && countv == 0)
            return "vowel";
        else if (countc > 0 && countv > 0)
            return "vowel consonant";
        else if (countv > 0 && countc == 0)
            return "consonant";
        return "error";
    }
}
