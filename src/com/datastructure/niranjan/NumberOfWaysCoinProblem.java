package com.datastructure.niranjan;

import java.util.Arrays;

public class NumberOfWaysCoinProblem {

    public int countNoOfWays(int [] change,int coinvalue,int target) {
        if(target==0) {
            return 1;
        }
        if(target<0) {
            return 0;
        }

        if(coinvalue <=0 && target >=1){
            return 0;
        }
        //System.out.println("udyuc"+target);
        return countNoOfWays(change,coinvalue-1,target) + countNoOfWays(change,coinvalue,target-change[coinvalue-1]);
    }
    public int countNoOfWaysDP(int [] change,int coinvalue,int target) {

        int [] memoizeddata = new int[target+1];
        Arrays.fill(memoizeddata,0);
        memoizeddata[0] =1;

        for(int coin:change) {
            for(int amount=1;amount<= target;amount++) {
              if(coin <=amount) {
                  memoizeddata[amount] +=memoizeddata[amount-coin];
              }
            }
        }
         return memoizeddata[target];
    }

}
