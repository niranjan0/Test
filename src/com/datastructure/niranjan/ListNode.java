package com.datastructure.niranjan;

public class ListNode {
     Node head;
    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList(Node n) {

        while(n!=null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public void print()
    {
        Node n=head;
        while(n!=null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public void push(int data) {

        Node new_node = new Node(data);
        new_node.next =head;
        head =new_node;
    }

    public void insertAfer(int n,int data) {
        Node current =head;
        while(n!=0 && current.next!=null) {

            current=current.next;
        }

        Node new_node = new Node(data);
        new_node.next =current.next;
        current.next=new_node;

    }
}

