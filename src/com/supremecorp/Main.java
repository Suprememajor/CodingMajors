package com.supremecorp;

import com.supremecorp.week2.LCP;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(LCP.lcp(new String[] {"flower","flow","flight"}));
        System.out.println(LCP.lcp(new String[] {"dog","racecar","car"}));
        System.out.println(LCP.lcp(new String[] {"brand", "brain", "brandon", "brit", "boys", "bring"}));
    }
}
