package com.Leetcode;

public class TwoDMatrixSearch {



    public boolean searchMatrix(int[][] matrix, int target) {

        boolean search=false;
        boolean found=false;
        for(int i=0;i<matrix.length;i++) {
             System.out.println("coming ++++");
            for(int j=matrix[i].length-1;j>=0;j--) {
                if(matrix[i][j] < target) {
                    System.out.println("does not satisfy condition");
                    continue;
                }
                else {
                    found=true;
                    System.out.println("coming here++++"+i);
                    int [] tmp = formOneDArray(matrix,i,target);
                    search = doBinarySearch(tmp,0,tmp.length-1,target);
                    break;

                }

            }
            if(found) {
                break;
            }

        }
        return search;

    }

    private boolean doBinarySearch(int[] tmp, int left, int right, int target) {
      if(right>=left) {
          int mid = left +(right-left)/2;
          if(tmp[mid]==target){
              return true;
          }
          else if(tmp[mid]< target){
              return doBinarySearch(tmp,mid+1,right,target);
          }
          else{
              return doBinarySearch(tmp,0,mid-1,target);
          }
      }
      return false;
    }

    private int[] formOneDArray(int[][] matrix, int i, int target) {
        int arr[] = new int[matrix[i].length];
        for(int j=0;j<matrix[i].length;j++) {
            arr[j] = matrix[i][j];
        }

        return arr;

    }
}
