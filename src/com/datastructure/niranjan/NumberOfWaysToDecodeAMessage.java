package com.datastructure.niranjan;

public class NumberOfWaysToDecodeAMessage {

    public int getNumberOfWaysToDecodeAMessage(String message) {

        int memo[] = new int[message.length()+1];
        return getNumberOfWaysToDecodeAMessageHelper(message,message.length(),memo);
    }

    private int getNumberOfWaysToDecodeAMessageHelper(String message, int length,int [] memo) {
       // System.out.println("first length "+length);
        if(length==0){
            return 1;
        }
        int s =message.length()-length;
        System.out.println(s);
        if(message.charAt(s)=='0') {
            return 0;
        }
        if(memo[length]!=0) {
            return memo[length];
        }
        int result = getNumberOfWaysToDecodeAMessageHelper(message,length-1,memo);
      //  System.out.println("here"+Integer.parseInt(message.substring(s,s+2)));
      //  System.out.println("and length "+length);
        if(length>=2 && Integer.parseInt(message.substring(s,s+2))<=26){
            result=result+getNumberOfWaysToDecodeAMessageHelper(message,length-2,memo);
           // System.out.println(length);
        }
        memo[length]=result;
        return result;
    }
}
