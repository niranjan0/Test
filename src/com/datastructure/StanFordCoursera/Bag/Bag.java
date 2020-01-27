package com.datastructure.StanFordCoursera.Bag;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

    private Node first =null;
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    public class ListIterator implements Iterator<Item> {

        private Node current =first;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return first==null;
    }
    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item=item;
        first.next=oldfirst;
    }

    public int size() {
        Node current = first;
        int size=0;
        while(current!=null) {
            size++;
            current=current.next;
        }
        return size;
    }

}
