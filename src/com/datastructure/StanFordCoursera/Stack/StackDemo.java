package com.datastructure.StanFordCoursera.Stack;

public class StackDemo {


    public static void main(String [] args) {

        StackOfLinkedList<String> stack =  new StackOfLinkedList<>();
        stack.push("ram");
        stack.push("shree");
        stack.push("jai");

       /* while (!stack.isEmpty()){
            String item = stack.pop();
            System.out.print(item +" ");
        }*/
        System.out.println();

      /*  Iterator<String> i = stack.iterator();
        while (i.hasNext()){
            String item = i.next();
            System.out.print(item+" ");
        }*/
        for(String s:stack){
          //  System.out.println("coming");
            System.out.print(s +" ");
        }

    }
}
