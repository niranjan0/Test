package com.datastructure.niranjan;

import java.util.ArrayList;

public class PowersetOfArray {

    public ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> array) {

        ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
        subsets.add(new ArrayList<Integer>());

        for(Integer elem:array) {
         // System.out.println("in each loop "+elem);
            int length=subsets.size();
            System.out.println("length =="+length);
            System.out.println("subset size"+subsets.size());
            for(int j=0;j<length;j++) {
               // System.out.println("for each elem "+j);
                ArrayList<Integer> currentsubset = new ArrayList<Integer>(subsets.get(j));
                //System.out.println();
                currentsubset.add(elem);
                subsets.add(currentsubset);
            }
        }
        return subsets;
    }
}
