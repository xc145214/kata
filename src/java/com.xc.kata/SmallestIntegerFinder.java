package com.xc.kata;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Description:
 * <p>
 * Find the smallest integer in the array.
 * <p>
 * Given an array of integers your solution should find the smallest integer. For example:
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * <p>
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinder {

    /**
     * best
     *
     * @param args
     * @return
     */
    public static int findSmallestInt1(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }

    public static int findSmallestInt2(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

    public static int findSmallestInt3(int[] args) {
        return java.util.Arrays.stream(args).min().getAsInt();
    }

    public static int findSmallestInt4(int[] args) {
        int smallest = Integer.MAX_VALUE;
        for (int i : args)
            smallest = (smallest > i) ? i : smallest;
        return smallest;
    }

    public static int findSmallestInt(int[] args) {
        int ans = Integer.MAX_VALUE;
        if (args.length < 1) {
            ans = 0;
        } else {
            for (int i : args) {
                if (i < ans) {
                    ans = i;
                }
            }
        }
        return ans;
    }
}
