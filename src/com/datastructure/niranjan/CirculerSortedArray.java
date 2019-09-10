package com.datastructure.niranjan;

public class CirculerSortedArray {
// 5,6,7,8,1,2,3,4
    public int noOfRotation(int [] sortedArray) {
        int low = 0;
        int high = sortedArray.length - 1;
        int length =sortedArray.length;

        while (low <= high) {
            if (sortedArray[low] <= sortedArray[high]) {
                return low;
            }
            int mid = low + (high - low) / 2;
            int next =(mid+1)%length;
            int prev = (mid+length-1)/length;

                if (sortedArray[mid] <= sortedArray[next] && sortedArray[mid] <= sortedArray[prev]) {
                    return mid;
                }
           else if (sortedArray[mid] <= sortedArray[high]) {
                      high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }

        return -1;
    }

    public int elementIndex(int[] sortedArray,int target) {
        int low = 0;
        int high = sortedArray.length - 1;
        int length =sortedArray.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(sortedArray[mid] == target) {
                return mid;
            }
           else if(sortedArray[mid] <= sortedArray[high]) {
                if(target > sortedArray[mid] && target <= sortedArray[high]) {
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            else {
                if(sortedArray[low] <= target && target < sortedArray[mid]) {
                    high = mid-1;
                }
                else {
                    low=mid+1;
                }
            }

        }
        return -1;
    }
}
