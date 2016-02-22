package com.xc.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a function
 * <p>
 * vowel2Index(String s)
 * that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within that string.
 * E.g:
 * <p>
 * Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
 * Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
 * Your function should be case insensitive to the vowels.
 */
public class Kata {
    /**
     * 最佳方案：
     * 反向思考，先考虑不存在的情况，在考虑存在的情况
     *
     * @param s
     * @return
     */
    public static String vowel2Index1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) sb.append(s.charAt(i));
            else sb.append(i + 1);
        }
        return sb.toString();
    }

    public static String vowel2Index2(String s) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < s.length(); index++) {
            char v = s.charAt(index);
            if ((v == 'a') || (v == 'e') || (v == 'i') || (v == 'o') || (v == 'u'))
                result.append(Integer.toString(index + 1));
            else result.append(s.charAt(index));
        }
        return result.toString();
    }

    /**
     * 列表包含来判断
     *
     * @param s
     * @return
     */
    public static String vowel2Index3(String s) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('e', 'u', 'i', 'o', 'a'));
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                result += i + 1;
            } else {
                result += c;
            }
        }
        return result;
    }


    public static String vowel2Index4(String s) {
        StringBuffer sb = new StringBuffer();

        for (int index = 0; index < s.length(); index++) {
            switch (s.charAt(index)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    sb.append(index + 1);
                    break;
                default:
                    sb.append(s.charAt(index));
                    break;
            }
        }

        return sb.toString();

    }

    public static String vowel2Index5(String s) {

        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);

        StringBuffer sb = new StringBuffer();

        while (m.find()) {
            m.appendReplacement(sb, String.valueOf(m.end()));
        }

        m.appendTail(sb);

        return sb.toString();
    }

    /**
     * 替换s中的a,e,i,o,u为所在位置数
     *
     * @param s
     * @return
     */
    public static String vowel2Index(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ('a' == s.charAt(i) || 'e' == s.charAt(i) || 'i' == s.charAt(i) || 'o' == s.charAt(i) || 'u' == s.charAt(i)) {
                str.append(i + 1);
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
