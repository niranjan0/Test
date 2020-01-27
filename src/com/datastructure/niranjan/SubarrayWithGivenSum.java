package com.datastructure.niranjan;

public class SubarrayWithGivenSum {

    public static void printAllSubarray(int [] array) {

        for(int i=0;i<array.length;i++) {
            for(int j=i;j<array.length;j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }

        }
    }
    public static int subarraySum(int [] array, int sum) {
        int current_sum;
        for(int i=0;i<array.length;i++){
            current_sum= array[i];

            for(int j=i+1;j<array.length;j++){
                if(current_sum==sum){
                    System.out.println(i+" "+(j-1));
                    return 1;
                }
                if(current_sum>sum || j==array.length-1){
                    break;
                }
                current_sum = current_sum+array[j];
            }
        }
        System.out.println("no subarray found");
        return 0;
    }
    public static void main(String [] args) {
        int arr[] = {1,4,20,333,10,5};
        //printAllSubarray(arr);
        subarraySum(arr,10);
    }

}
