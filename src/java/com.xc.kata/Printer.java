package com.xc.kata;

/**
 * Created by Administrator on 2016/2/19.
 */
public class Printer {
    public static String printerError(String s) {
        int m = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 'm') {
                m++;
            }
        }
        return m + "/" + s.length();
    }
}
