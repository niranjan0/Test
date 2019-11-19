package com.datastructure.niranjan;



public class HeapSort  {

    public int[] heapSort(int[] array) {
        int length= array.length;

        for(int i=length/2-1;i>=0;i--) {
            sink(array,length,i);

        }

        for(int i=length-1;i>=0;i--) {
            swap(array,0,i);
            sink(array,i,0);
        }



        return array;
    }

    private void swap(int[] array, int i, int i1) {
        int temp = array[i1];
        array[i1] = array[i];
        array[i] =temp;
     }

    private void sink(int[] array, int length, int i) {

        int root= i;
        int left = 2*i+1;
        int right= 2*i+2;
            if(left < length && array[left] > array[root])
                root=left;
            if(right < length && array[right] > array[root])
                root=right;
            if(root!=i) {
                swap(array,root,i);
                sink(array,length,root);
            }

    }


}
