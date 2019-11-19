package com.company;

import java.util.Stack;

public class StackReverse {

    public Stack<Integer> reverseas (Stack stack) {
        int i = 0;
        int n = stack.size()-1;

            while(i <=n)
            {
                // stack.
                swap(i, n, stack);
                i++;
                n--;
                //n--;
            }

        //ListIterator listIterator = new Iterable<>() {
        return stack;
    }

    private void swap(int i, int n, Stack stack) {
        Object temp = stack.elementAt(i);
        stack.set(i,stack.elementAt(n));
        stack.set(n,temp);
    }

   /* private void swap(Object o, Object o1, Stack stack) {
        Integer temp = (Integer) stack.elementAt((Integer) o);
        Integer temp1 = (Integer) stack.elementAt((Integer) o1);
        stack.add((Integer) o,stack.elementAt(temp1));
        stack.add((Integer) o1,stack.elementAt(temp));

    }*/

    /*private void swap(Integer next, Integer o,Stack stack) {
        Integer temp = (Integer) stack.elementAt(next);
        stack.add(next,stack.elementAt(o));
        stack.add(o,temp);
       // o =next;
        next=o;
      //  o=temp;
    }*/
}
