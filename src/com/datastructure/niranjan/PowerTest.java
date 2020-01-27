package com.datastructure.niranjan;

import java.util.ArrayList;

public class PowerTest {

    public static void main(String [] args){
        String test = "abc";
       ArrayList<String> result =getPowerSet(test);
       System.out.println(result);
    }

    private static ArrayList<String> getPowerSet(String test) {
       String result="";
        ArrayList<String> result_set=new ArrayList<>();
       getPowerSet(test,0,result,result_set);
       return result_set;
    }

    private static void getPowerSet(String test, int index, String result,ArrayList<String> result_set) {

        int n= test.length();
        if(index==n){
          //  System.out.println(result);
           // System.out.println("coming");
            result_set.add(result);
            return ;
        }
        getPowerSet(test,index+1,result+test.charAt(index),result_set);
        getPowerSet(test,index+1,result,result_set);
        //return result_set;
    }
}
