package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePalindromeTest {
    ReversePalindrome objpalindrome;
    String result;

    @Before
    public void setUp() throws Exception {
        objpalindrome=new ReversePalindrome();

    }

    @After
    public void tearDown() throws Exception {
        objpalindrome=null;
    }

    @Test
    public void checkPalindrome() {
        result=objpalindrome.findPalindrome(424);
        assertEquals("Given number is Palindrome",result);
    }

    @Test
    public void checkNotPalindrome() {
        result=objpalindrome.findPalindrome(523);
        assertEquals("Given number is Not Palindrome",result);

    }
}

