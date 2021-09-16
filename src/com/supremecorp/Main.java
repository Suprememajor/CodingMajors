package com.supremecorp;

import com.supremecorp.week1.SortedArrayDuplicates;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(SortedArrayDuplicates.removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(SortedArrayDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(SortedArrayDuplicates.removeDuplicates(new int[]{-45, -30, -23, -23, -23, 0, 0, 3, 3, 4}));
        System.out.println(SortedArrayDuplicates.removeDuplicates(new int[]{21, 21, 114, 116, 116, 200, 203, 203}));
        System.out.println(SortedArrayDuplicates.removeDuplicates(new int[]{-100, -90, -90, -65, -65, -45, -45, -8}));
    }
}
