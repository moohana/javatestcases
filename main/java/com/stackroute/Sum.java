package com.stackroute;

public class Sum {
    public int sum(String s)
    {
        int sum=0;
    String[] s1=s.split(" ");
    int[] a = new int[s1.length];
        for (int i = 0; i < s1.length; i++)
        {
        a[i] = Integer.parseInt(s1[i].trim());
        sum=sum+a[i];
    }
        return (sum);
}

}


