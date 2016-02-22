package com.xc.kata;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits in descending order. Descending order means that you take the highest digit and place the next highest digit immediately after it.
 * <p>
 * Examples:
 * <p>
 * Input: 145263 Output: 654321
 * <p>
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {

    public static int sortDesc1(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    public static int sortDesc2(final int num) {
        if (num < 0) throw new IllegalArgumentException("Negative number: " + num);

        return Integer.parseInt(Integer.toString(num).codePoints()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString());
    }

    public static int sortDesc3(final int num) {
        char[] c = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(c);
        return Integer.parseInt(new StringBuffer(new String(c)).reverse().toString());
    }

    public static int sortDesc(final int num) {
        char[] numbers = String.valueOf(num).toCharArray();
        Arrays.sort(numbers);
        String res = "";
        for (int i = numbers.length; i > 0; i--) {
            res += numbers[i-1];
        }
        return Integer.parseInt(res);
    }
}
