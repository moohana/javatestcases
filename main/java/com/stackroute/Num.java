package com.stackroute;

public class Num {
    public int[] loop(int n)

{
    int[] a=new int[100];
    int k=0;
    for(int i=1;i<=n;i++)

            for(int j=1;j<=i;j++)
                    {
                    a[k]=i;
                    k++;
                    }
    int[] a1 = a;
    return a1;
                    }
                    }