package com.edesk.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.DEFAULT)
public class PersonTest {

    Person p = new Person("SAMEERA" , 27);

    @Test
    public void test1() throws Exception
    {
        System.out.print("\nTest[1]");
        String result = p.getPersonName();
        assertEquals(result, "SAMEERA");
    }

    @Test
    public void test2() throws Exception
    {
        System.out.print("\nTest[2]");
        int result = p.getPersonAge();
        assertEquals(result, 27);
    }
}
