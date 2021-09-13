package com.supremecorp.week1;

/**
 * Created by suprememajor on the 9/13/21
 */
public class TwoSum {
    public static String twoSum(int[] nums, int target) {
        int val, limit = 110;
        int[][][] temp = new int[limit][2][2];
        for (int i = 0; i < nums.length; i++) {
            val = target - nums[i];
            if (val < 0 && temp[Math.abs(val)][0][0] == 1)
                return "[" + i + " " + temp[Math.abs(val)][0][1] + "]";
            else if (val > -1 && temp[val][1][0] == 1)
                return "[" + i + " " + temp[val][1][1] + "]";
            else if (nums[i] < 0){
                temp[Math.abs(nums[i])][0][0] = 1;
                temp[Math.abs(nums[i])][0][1] = i;
            } else {
                temp[nums[i]][1][0] = 1;
                temp[nums[i]][1][1] = i;
            }
        }
        return "None found";
    }
}
