package com.edesk.test;

import com.edesk.test.*;
import org.junit.Test;
import static  org.junit.Assert.*;


public class TestJunit {

    Hello hello = new Hello();

    @Test
    public void testTotal() {
        String res = Hello.verifire(4);
        assertEquals(res , "Even");
    }

}
