package com.stackroute.pe2;

public class PowerofFour {
    public static String isPowerOfFour(int n)
    {
        String str = "";

        if (n == 0)
        {
            str = "Given input is zero";
        }
        while (n != 1)
        {
            if (n % 4 != 0)
            {
                str = "Given number is not power of four";
                return str;
            }
            n = n / 4;
        }
        str = "Given number is power of four";
        return str;
    }

}
