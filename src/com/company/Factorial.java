package com.company;


public class Factorial {
int [] fact_array = new int[55];
    public int getFectorial(int n)
    {
        int factorial =0;
       if (n==1 || n==0)
       return 1;

       else
        {
           return n*getFectorial(n-1);
        }

    }
}
