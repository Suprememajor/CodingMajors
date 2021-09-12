package com.supremecorp.week0;

/**
 * Created by suprememajor on the 9/11/21
 */
public class PythagoreanTriple {
    public static String pythagoreanTriple(int input) {
        long startTime = System.currentTimeMillis();
        int hyp;
        for (int i = 1; i < input/2; i++)
            for (int j = i + 1; j < input/2; j++) {
                hyp = input - (i + j);
                if ( ( i * i + j * j == hyp * hyp) && (j != hyp) && (i != j)) {
                    return "" + input + ": " + i + " " + j + " " + hyp + "\ntime taken: " + (System.currentTimeMillis() - startTime) + " ms\n";
                }

            }
        return input +": None\ntime taken: " + (System.currentTimeMillis() - startTime) + " ms\n";
    }
}
