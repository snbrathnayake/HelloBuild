package com.edesk.test;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestJunit {
    // test case
    @Test
    public void testTotal() {
        String res = new Hello().verifire(4);
        assertEquals(res, "Even number");
    }

}
