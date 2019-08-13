package com.datastructure.niranjan;

public class OneEditAway {

   public boolean oneEditAwayString(String first,String second)
    {
        if(first.length()== second.length())
        {
            return oneEditReplace(first,second);
        }

        else if(first.length()+1 == second.length())
        {
            return oneEditInsert(first,second);
        }
        else if(first.length()-1 == second.length())
        {
            return oneEditInsert(first,second);
        }
        return false;
    }

    private boolean oneEditInsert(String first, String second) {
        int index1 =0;
        int index2 =0;
        if(first.length() > second.length()) {
            int[] table = getFirstArrayCount(first);
            int[] othertable= getSecondArrayCount(table,second);
            return checkOneEditInsert(othertable);
        }else {
            int[] table = getFirstArrayCount(second);
            int [] othertable = getSecondArrayCount(table,first);
            return checkOneEditInsert(othertable);
        }

    }

    private boolean checkOneEditInsert(int[] othertable) {


        boolean founddiff =false;
        for(int i :othertable)
        {
            if(i!=0)
            {
                if(founddiff)
                {
                    return false;

                }
                founddiff = true;
            }
        }
        return true;
    }

    private int[] getSecondArrayCount(int[] table, String first) {

        for(char ch :first.toCharArray()){
            int val = Character.getNumericValue(ch);
            table[val]--;
        }
        return table;
    }

    private int[] getFirstArrayCount(String first) {
        int [] char_array = new int[128];
        for(char ch : first.toCharArray())
        {
            int val = Character.getNumericValue(ch);
            char_array[val]++;
        }
        return char_array;
    }

    private boolean oneEditReplace(String first, String second) {
        boolean founddiff = false;
        for(int i=0;i<first.length();i++)
        {
            if(first.charAt(i) != second.charAt(i))
            {
                if(founddiff)
                {
                    return false;
                }
                founddiff= true;
            }
        }
        return true;
    }
}
