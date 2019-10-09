package com.company;

import com.datastructure.niranjan.AddingOnetoAnArray;

class Main {
    public static void main(String [] args) {

        int [] array ={9,9,9,9};

        AddingOnetoAnArray addingOnetoAnArray = new AddingOnetoAnArray();
        int [] result = addingOnetoAnArray.addOneSecond(array);

        for(int elem:result) {
            System.out.print(elem +" ");
        }

    }
} // Contributed by Aakash Hasija
