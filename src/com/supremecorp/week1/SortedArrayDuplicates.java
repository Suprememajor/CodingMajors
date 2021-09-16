package com.supremecorp.week1;

import java.util.Arrays;

/**
 * Created by suprememajor on the 9/16/21
 */
public class SortedArrayDuplicates {
    public static String removeDuplicates(int[] nums) {
        if (nums.length < 1) return "Empty Array";
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) nums[i] = 0;
        return k + ", nums = " + Arrays.toString(nums);
    }
}
