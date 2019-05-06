package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum objEven;
    Boolean result;

    @Before
    public void setUp() throws Exception {
        objEven=new EvenNum();
    }

    @After
    public void tearDown() throws Exception {
        objEven=null;
    }

    @Test
    public void checkEven() {
        result=objEven.isEven(22);
        assertEquals(true,result);
    }

    @Test
    public void checkNotEven() {
        result=objEven.isEven(35);
        assertEquals(false,result);
    }
}