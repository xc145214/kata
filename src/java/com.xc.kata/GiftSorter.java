package com.xc.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2016/2/19.
 */
public class GiftSorter {

    /**
     * best
     * @param code
     * @return
     */
    public String sortGiftCode1(String code){
        char[] chars = code.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }

    public String sortGiftCode2(String code) {
        return new String(code.chars().sorted().toArray(), 0, code.length());
    }

    public String sortGiftCode3(String code) {
        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining(""));
    }

    /**
     * 排序后重组
     * @param code
     * @return
     */
    public String sortGiftCode(String code) {
        //Put code here!
        StringBuilder sb = new StringBuilder();
        String[] chars = code.split("");
        Arrays.sort(chars);
        for (String s : chars) {
            sb.append(s);
        }
        return sb.toString();
    }
}
