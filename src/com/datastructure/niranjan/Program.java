package com.datastructure.niranjan;

class Program {
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree,target,Integer.MAX_VALUE);

    }
    public static int findClosestValueInBst(BST tree,int target,int closest){
        BST current = tree;
        while(current!=null) {
            if(Math.abs(target-closest)>Math.abs(target-current.value)) {
                closest = current.value;
            }
            if(target < current.value){
                current=current.left;
            }
            else if(target > current.value){
                current=current.right;
            }
            else
                break;

        }
        return  closest;
    }
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
