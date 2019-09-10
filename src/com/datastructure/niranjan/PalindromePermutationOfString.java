package com.datastructure.niranjan;

import java.util.*;

public class PalindromePermutationOfString {
    SortedSet<String> permutate =  new TreeSet<>();
    public SortedSet<String> palindromePermutation(String string, int startIndex, int endIndex) {

        if(startIndex==endIndex) {
            if(ispalindrome(string)) {
                permutate.add(string);
            }
        }
        for(int i=startIndex;i<=endIndex;i++) {
            string = swap(string,startIndex,i);
            palindromePermutation(string,startIndex+1,endIndex);
            string = swap(string,startIndex,i);
        }
        return permutate;
    }

    private boolean ispalindrome(String string) {

        String temp = new StringBuffer(string).reverse().toString();
        if(string.equals(temp)) {
            return true;
        }
        else
            return false;
    }

    private String swap(String string, int startIndex, int i) {
        char temp;
        char[] ch = string.toCharArray();
        temp = ch[startIndex];
        ch[startIndex] = ch[i];
        ch[i] = temp;
        return String.valueOf(ch);
    }
}
