package com.Leetcode;

public class Driver {

    public static void main(String [] args) {

        int [][] matrix = {{1},{3}

        };
        TwoDMatrixSearch twoDMatrixSearch = new TwoDMatrixSearch();
        boolean result = twoDMatrixSearch.searchMatrix(matrix,3);
        System.out.println(result);
    }
}
