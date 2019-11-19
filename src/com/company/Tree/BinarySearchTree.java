package com.company.Tree;

public class BinarySearchTree {

    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            left=right=null;
        }
    }

    Node root;


    public BinarySearchTree() {
      root=null;
    }

    public void insert(int value) {
        root = insertHelper(root,value);
       // return root;
    }

    private Node insertHelper(Node root, int value) {
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value < root.data) {
            root.left = insertHelper(root.left,value);

            }
            else if(value > root.data) {
            root.right = insertHelper(root.right,value);
        }
        return root;
    }

   public void inOrder() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node root) {
        if (root!=null) {
            inOrderHelper(root.left);
            System.out.print(root.data+" ");
            inOrderHelper(root.right);

        }
    }

    public void deleteKey(int key) {
        root = deleteKeyHelper(root,key);
    }

    private Node deleteKeyHelper(Node root, int key) {
        if(root==null) {
            System.out.println("tree is empty or data is not present");
            return root;
        }
        if(key < root.data){
            root.left = deleteKeyHelper(root.left,key);
        }
        else if(key > root.data){
            root.right = deleteKeyHelper(root.right,key);
        }
        else {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteKeyHelper(root.right,root.data);
        }
        return root;
    }

    private int minValue(Node right) {
        int data = right.data;
        while(right.left!=null){
            data=right.left.data;
            right = right.left;
        }
        return data;

    }
}
