package com.datastructure.niranjan;

import com.sun.javafx.runtime.SystemProperties;
import sun.awt.Symbol;

public class RemoveDuplicateFromArray {



    public int[] remove(int[] arr)
    {
        int result[] = new int[arr.length];
        int i=0;
        int l = arr.length;
        int firstindex=0;
        int lastindex=1;
        int index=0;
        do

        {
            if(arr[firstindex]==arr[lastindex] )
            {
                // System.out.println("here j = "+lastindex);
                firstindex =lastindex ;
                lastindex=lastindex+1;
            }
            else
            {
                //  System.out.println("coming here and i and j are"+firstindex+" "+lastindex);
                result[index] = arr[firstindex];
                //   System.out.println("here index is "+index+"and element is "+result[index]);
                index=index+1;
                result[index]=arr[lastindex];
                firstindex=firstindex+1;

                lastindex=lastindex+1;

            }
            i++;
        }
        while(i < l && (lastindex< l && firstindex<l) );
        return result;
    }
}
