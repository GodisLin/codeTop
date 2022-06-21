package com.GodisLin.easy;

public class $002_Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int count = 0;
        for (int num : nums) {
            count += num;
            if(res < count){
                res = count;
            }
            if(count < 0)
                count = 0;
        }
        return res;
    }
}
