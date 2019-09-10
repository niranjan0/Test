package com.company;

import com.datastructure.niranjan.*;
import com.sun.javafx.runtime.SystemProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {

public static void main(String [] args) {

          int [] sortedarray = {5,6,7,8,9,10,11,12,1,2,3,4};
       CirculerSortedArray carr = new CirculerSortedArray();
       int n = carr.noOfRotation(sortedarray);

       int n1 = carr.elementIndex(sortedarray,8);


        System.out.print(n1);


}

}