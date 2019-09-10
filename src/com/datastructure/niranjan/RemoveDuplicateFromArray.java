package com.datastructure.niranjan;

import com.sun.javafx.runtime.SystemProperties;
import sun.awt.Symbol;

import java.util.ArrayList;

public class RemoveDuplicateFromArray {



    public ArrayList<Integer> remove(int[] arr)
    {
       // int result[] = new int[arr.length];
        ArrayList<Integer> result = new ArrayList<>();
        int i=0;
        int l = arr.length;
        int firstindex=0;
        int lastindex=1;
        int index=0;
       // result.add(arr[0]);
        while(i<l && firstindex<l && lastindex<l) {
            if(arr[firstindex]== arr[lastindex]) {
                firstindex=lastindex;
                lastindex+=1;
            }
            else {
                result.add(arr[firstindex]);
               // result.add(arr[lastindex]);
                firstindex+=1;
                lastindex+=1;
            }
            i++;
        }
        result.add(arr[l-1]);

      return result;
    }
}
