package com.xc.kata;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 2016/2/19.
 */
public class CaffeineBuzzTest {
    @Test
    public void  test(){
        assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(0));
        assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
        assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
        assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
        assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
    }
}
