package com.datastructure.niranjan;

import java.util.ArrayList;

//import static java.util.Collections.swap;

public class PermutationOfArray {

    public  ArrayList<ArrayList<Integer>> getPermutations(ArrayList<Integer> array) {

        ArrayList<ArrayList<Integer>> permutations = new ArrayList<ArrayList<Integer>>();
        getPermutations(0,array,permutations);
        return permutations;
    }

    private void getPermutations(int startindex, ArrayList<Integer> array, ArrayList<ArrayList<Integer>> permutations) {
        if(startindex==array.size()-1) {
            permutations.add(new ArrayList<Integer>(array));
        }
        else {
            for(int j=startindex;j< array.size();j++) {
                swap(array,startindex,j);
                getPermutations(startindex+1,array,permutations);
                swap(array,startindex,j);

            }
        }
    }

    public static void swap(ArrayList<Integer> array,int i,int j) {
        Integer temp = array.get(i);
        array.set(i,array.get(j));
        array.set(j,temp);

    }

}
