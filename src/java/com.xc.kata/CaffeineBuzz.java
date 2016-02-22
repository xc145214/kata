package com.xc.kata;

/**
 * Created by Administrator on 2016/2/19.
 */
public class CaffeineBuzz {
    public static String caffeineBuzz(int n) {
        String message = "mocha_missing!";
        if (n != 0) {
            if (n % 3 == 0) message = "Java";
            if (n % 12 == 0) message = "Coffee";
            if (n % 2 == 0) message += "Script";
        }
        return message;
    }

    public static String caffeineBuzz1(int n) {
        if (n % 12 == 0) return "CoffeeScript";
        if (n % 6  == 0) return "JavaScript";
        if (n % 3  == 0) return "Java";
        return "mocha_missing!";
    }

    public static String caffeineBuzz2(int n) {

        if (n % 3 != 0)
            return "mocha_missing!";

        String prefix = n % 4 == 0 ? "Coffee" : "Java";
        String suffix = n % 2 == 0 ? "Script" : "";

        return prefix + suffix;
    }
}
