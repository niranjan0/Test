package com;

public class Leetcode1 {

    public int maxArea(int[] height) {


        int max_area =0;

        for (int i=0;i<height.length;i++) {

            for(int j=i+1;j<height.length;j++)
            {
                int area = Math.min(height[i],height[j])*(j-i);
                if(max_area<area)
                {
                    max_area = area;
                }
            }

        }

        return max_area;
    }

}
