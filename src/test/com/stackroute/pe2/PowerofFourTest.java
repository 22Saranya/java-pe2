package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerofFourTest {
    PowerofFour objpower;
    String result;

    @Before
    public void setUp() throws Exception {
        objpower=new PowerofFour();
    }

    @After
    public void tearDown() throws Exception {
        objpower=null;
    }

    @Test
    public void checkPowerofFour() {
        result=objpower.isPowerOfFour(64);
        assertEquals("Given number is power of four",result);
    }

    @Test
    public void checkNotPowerofFour() {
        result=objpower.isPowerOfFour(32);
        assertEquals("Given number is not power of four",result);
    }
}