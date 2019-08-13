package com.company;

public class Fibonacci {

    final int MAX = 100;
    final int NIL = -1;

    int lookuptable[] = new int[MAX];

    void  Initilize() {
        System.out.println("coming");
        for (int i = 0; i < MAX; i++) {
            lookuptable[i] = NIL;

        }
    }

    public int fibrecursion(int n) {
        if(n<=1)
            return n;
        if(lookuptable[n] !=-1)
        {
            return lookuptable[n];
        }
        else
        {
            lookuptable[n] = fibrecursion(n-1)+fibrecursion(n-2);
            return lookuptable[n];
        }
    }
    int fibMemoization(int n)
    {
        if(lookuptable[n] == NIL)
        {
            if(n<=1)
            {
                lookuptable[n] = n;
            }
            else {
                lookuptable[n] = fibMemoization(n-1) + fibMemoization(n-2);
            }
        }
        return lookuptable[n];
    }

    int fibTabulization(int n)
    {
        int fib[] = new int[n+1];
        fib[0] =0;
        fib[1] = 1;
        for(int i=2;i<=n;i++)
        {
            fib[i] = fib[i-1]+fib[i-2];
        }

    return fib[n];
    }
}
