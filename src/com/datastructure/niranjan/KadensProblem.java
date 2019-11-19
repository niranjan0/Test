package com.datastructure.niranjan;

public class KadensProblem {
    public static void main(String args[]) {
        int arr[] ={-1,-2,0,4,-3,7,-6,2};
        int result = getMaxSumSubArray(arr);
        System.out.println(result);
    }

    private static int getMaxSumSubArray(int[] arr) {
        int max_current=arr[0];
        int max_global=arr[0];

        for(int i=1;i<arr.length;i++) {

            max_current= Math.max(arr[i],max_current+arr[i]);

            if(max_current >= max_global){
                max_global=max_current;
            }
        }
        return max_global;
    }
}
