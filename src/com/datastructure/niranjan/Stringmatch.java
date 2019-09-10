package com.datastructure.niranjan;

import com.sun.javafx.runtime.SystemProperties;
import sun.awt.Symbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringmatch {
    ArrayList<String> matchlist = new ArrayList<>();
    public List<String> getMatchElement(String phrase, String[] strarray,int count, int lastindex) {

        return getMatchelEmentAfterSlice(phrase,strarray);

    }

    public List<String> getMatchelEmentAfterSlice(String phrase, String[] strarray) {

            //String[] sliceArray = Arrays.copyOfRange(strarray, count, lastindex)
             for(String s : strarray) {
                 if(phrase.contains(s)) {
                     matchlist.add(s);
                     System.out.println(s.length());
                     System.out.println(s.indexOf(s));

                 }
             }


        return matchlist;


    }
}
