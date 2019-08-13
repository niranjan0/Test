package com.company;

public class UglyNumber {

    boolean isUgly(int n)
    {
        n = Gdp(n,2);
        n = Gdp(n,3);
        n = Gdp(n,5);

        if(n==1)
        {
            return true;
        }
        return false;
    }
    int getnNthUglyNumber(int n) {

        int i=1;
        int count =1;

        while(n> count)
        {
            i++;
            if(isUgly(i))
            {
                count++;
            }
        }
       return i;
    }

    int Gdp(int no,int p)
    {
        while(no%p == 0)
        {
            no = no/p;
        }
        return no;
    }
}
