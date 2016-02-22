package com.xc.kata;

import java.util.Arrays;

/**
 * You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
 * <p>
 * Find max(abs(length(x) − length(y)))
 * <p>
 * If a1 or a2 are empty return -1 in each language except in Haskell where you will return Nothing.
 */


public class MaxDiffLength {

    /**
     * best function
     *
     * @param a1
     * @param a2
     * @return
     */
    public static int mxdiflg(String[] a1, String[] a2) {
        // your code
        if (a1.length < 1 || a2.length < 1) return -1;

        return Math.max(Arrays.stream(a1).mapToInt(s -> s.length()).max().getAsInt() - Arrays.stream(a2).mapToInt(s -> s.length()).min().getAsInt(),
                Arrays.stream(a2).mapToInt(s -> s.length()).max().getAsInt() - Arrays.stream(a1).mapToInt(s -> s.length()).min().getAsInt());
    }


    public static int mxdiflg1(String[] a1, String[] a2) {
        if (a1.length < 1 || a2.length < 1) return -1;

        int min1 = Arrays.stream(a1).min((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();
        int max1 = Arrays.stream(a1).max((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();
        int min2 = Arrays.stream(a2).min((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();
        int max2 = Arrays.stream(a2).max((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();
        return Math.max(max2 - min1, max1 - min2);

    }


    public static int mxdiflg2(String[] a1, String[] a2) {
        int max = -1;
        for (String x : a1) {
            for (String y : a2) {
                int poss = Math.abs(x.length() - y.length());
                if (poss > max) {
                    max = poss;
                }
            }
        }
        return max;
    }

}

