package com.datastructure.niranjan;

import java.util.ArrayList;

public class AddingOnetoAnArray {
    public int[] addOne(int[] array) {

        StringBuilder stringBuilder = new StringBuilder();

        for(int elem:array) {
            stringBuilder = stringBuilder.append(elem);
        }

        String str = stringBuilder.toString();
        System.out.println(str);
        int element = Integer.parseInt(str);
        element = element+1;
        System.out.println(element);
        str  = String.valueOf(element);
    //    str= str.
        char [] chararray = str.toCharArray();

        ArrayList<Integer> result = new ArrayList<>();
        //int count=1;
       for(char ch : chararray) {
           result.add(Character.getNumericValue(ch));
       }
        int[] resultarray = new int[result.size()];
     //   int j=0;
        for(int i=result.size()-1;i>=0;i--){
            resultarray[i] = result.get(i).intValue();
            //j++;
        }
      return  resultarray;
    }

    public int[] addOneSecond(int [] array) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int elem:array) {
            stringBuilder = stringBuilder.append(elem);
        }

        String str = stringBuilder.toString();
        System.out.println(str);
        int element = Integer.parseInt(str);
        element = element+1;
        System.out.println(element);
        str  = String.valueOf(element);
        //    str= str.
        char [] chararray = str.toCharArray();
        int[] resultarray = new int[chararray.length];
       // ArrayList<Integer> result = new ArrayList<>();
        //int count=1;
        for(int i=0;i<chararray.length;i++) {
            resultarray[i] = Character.getNumericValue(chararray[i]);
           // resultarray.add(Character.getNumericValue(ch));
        }



        return  resultarray;
    }

}
