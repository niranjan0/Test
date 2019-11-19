package com.datastructure.niranjan;

import java.util.HashMap;

public class Uitility {


   static HashMap<Integer,Character> charmap= new HashMap<>() ;
   static {
      // charmap=new HashMap<>();
       charmap.put(1,'a');
    }

 public void printHashmap() {
       System.out.println(charmap);
 }
}
