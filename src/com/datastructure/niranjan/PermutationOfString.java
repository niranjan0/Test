package com.datastructure.niranjan;

import java.util.ArrayList;

public class PermutationOfString {
    ArrayList<String> permutate_string = new ArrayList<>();
    public ArrayList<String> permutate(String str,int start_index,int end_endex) {
        if(start_index==end_endex){
           // System.out.println(str);
            permutate_string.add(str);
        }
        else {
            for (int i = start_index; i <= end_endex; i++) {
                str = swap(str, start_index, i);
                permutate(str, start_index + 1, end_endex);
                str = swap(str, start_index, i);
            }
        }
        return permutate_string;
    }

    private String swap(String str,int i, int i1) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[i1];
        charArray[i1] = temp;
        return String.valueOf(charArray);

    }
}
