package com.datastructure.niranjan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class TreeTraversal {

   public Node root;

    // Constructors
    public TreeTraversal(int key)
    {
        root = new Node(key);
    }

    public TreeTraversal()
    {
        root = null;
    }
    public static class Node {
   public int data;
    public Node left;
   public Node right;
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
    }
    HashMap <String,ArrayList<String>> hmap = new HashMap<>();
    public void postOrder(Node root) {

        Node current = root;

        //Stack <Node> stk = new Stack<Node>();

        Stack <Node>stk = new Stack<Node>();

        while(current!=null || !stk.isEmpty()) {
            if(current !=null){
                stk.push(current);
               // System.out.println(current.data);
                current = current.left;
            }
            else {
                Node temp = stk.peek().right;
                if(temp==null)
                {
                    temp =stk.pop();
                    System.out.println(temp.data);
                    while(!stk.isEmpty() && temp==stk.peek().right)
                    {
                        temp = stk.pop();
                        System.out.println(temp.data);
                    }

                }
                else {
                    current=temp;
                }

            }


        }
    }
    public void postOrderWithTwoStack(Node root) {
        if(root==null) return;
        Node current = root;
        Stack<Node> stk1 = new Stack<Node>();
        Stack<Node> stk2 = new Stack<Node>();
         stk1.push(current);
         while(!stk1.isEmpty()) {
             Node temp = stk1.pop();
             stk2.push(temp);
             if(temp.left!=null) {
                 stk1.push(temp.left);
             }
             if(temp.right!=null) {
                 stk1.push(temp.right);
             }
         }

         while(!stk2.isEmpty()) {
             Node temp =stk2.pop();
             System.out.println(temp.data);
         }
    }
}
