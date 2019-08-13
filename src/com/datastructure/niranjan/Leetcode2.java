package com.datastructure.niranjan;

import com.sun.javafx.runtime.SystemProperties;
import sun.awt.Symbol;

import java.util.ArrayList;

public class Leetcode2 {

    class roman
    {
        int val;
        String s;

        public roman(int v,String str)
        {
            val = v;
            s = str;
        }
    }

    public String intToRoman(int num) {

        StringBuilder ans = new StringBuilder();

        ArrayList<roman> a = new ArrayList<roman>();

        a.add(new roman(1000,"M"));
        a.add(new roman(900,"CM"));
        a.add(new roman(500,"D"));
        a.add(new roman(400,"CD"));
        a.add(new roman(100,"C"));
        a.add(new roman(90,"XC"));
        a.add(new roman(50,"L"));
        a.add(new roman(40,"XL"));
        a.add(new roman(10,"X"));
        a.add(new roman(9,"IX"));
        a.add(new roman(5,"V"));
        a.add(new roman(4,"IV"));
        a.add(new roman(1,"I"));

        System.out.println("hxshgcs"+a.get(2).val);

      return ans.toString();
    }
    }

