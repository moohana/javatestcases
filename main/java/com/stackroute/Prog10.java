package com.stackroute;

public class Prog10 {
    public String check(String str,int num)
    {
        char ch;
        String str2 = "";
        for (int i = 0; i < num; i++) {
        for (int j = str.length() - num; j < str.length(); j++) {
            str2 += str.charAt(j);

        }

    }
        str +=str2;
        return str;
}
}

