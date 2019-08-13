package com.datastructure.niranjan;

import java.util.Stack;

public class ValidParanthesis {

    public boolean Isvalid(String s)
    {
        char data[] = s.toCharArray();

        if(data.length%2 !=0)
        {
            return false;
        }
 else {
            Stack stack = new Stack();

            for (int i = 0; i < data.length; i++) {
                stack.push(data[i]);
            }
            return true;
        }

    }
}
