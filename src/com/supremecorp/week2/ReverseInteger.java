package com.supremecorp.week2;

/**
 * Created by suprememajor on the 9/21/21
 */
public class ReverseInteger {
    public static int reverseInteger(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        long ans = 0;
        while (x > 0) {
            ans *= 10;
            ans += x%10;
            x /= 10;
        }
        if (!isValid(ans)) return 0;
        return (isNegative) ? (int)(ans * -1) : (int)ans;
    }

    private static boolean isValid(long value) {
        return (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE);
    }
}
