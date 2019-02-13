package com.stackroute;
import java.util.Scanner;

public class Jerry {
    public String check(int n)
    {
        if (n % 2 == 0 && n > 20 && n < 30)
        {
            return "Jerry";

        } else if (n % 2 != 0 && n > 20 && n < 30)
        {
            return "Tom";
        }
return "error";

    }
}



