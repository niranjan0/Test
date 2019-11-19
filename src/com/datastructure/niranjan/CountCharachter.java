package com.datastructure.niranjan;

public class CountCharachter {

    public String countCharacter(String string) {
        //string = string.toLowerCase();
        StringBuilder result = new StringBuilder();
        int count=1;
        char prev=string.charAt(0) ;
        char current=string.charAt(0);
        for(int i=1;i<string.length();i++) {
            current = string.charAt(i);
            if(current==prev) {
                count++;
            }
            else {
                result.append(count);
                result.append(prev);
                count=1;
            }
            prev=current;
        }
        result.append(count);
        result.append(prev);
        return result.toString();
    }
}
