package com.supremecorp.week2;

/**
 * Created by suprememajor on the 9/23/21
 */
public class LCP {
    public static String lcp(String[] strArr) {
        if (strArr == null || strArr.length == 0) return "";
        for (int i = 0; i < strArr[0].length() ; i++){
            char c = strArr[0].charAt(i);
            for (int j = 1; j < strArr.length; j ++) {
                if (i == strArr[j].length() || strArr[j].charAt(i) != c)
                    return strArr[0].substring(0, i);
            }
        }
        return strArr[0];
    }
}
