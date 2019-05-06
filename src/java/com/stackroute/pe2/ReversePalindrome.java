package com.stackroute.pe2;
import java.util.Scanner;

public class ReversePalindrome {

    public static String  findPalindrome(int n)
    {
        int temp, reverse = 0,x;
        String result;
        temp = n;
        while(n > 0)
        {
            x = n % 10;
            reverse = reverse * 10 + x;
            n = n / 10;
        }

        if(reverse == temp)
        {
            result="Given number is Palindrome";
        }
        else
        {
            result="Given number is Not Palindrome";
        }
        return result;
    }
}
