package com.lt.testt;

public class StringTest
{
    public static void main(String[] args)
    {
        String a = "asdfsdf";
        String aa = a.substring(0,4);
        System.out.println(aa);
        String s = null;
        s = toMe();
        System.out.println(s);
    }

    private static String toMe()
    {
        return "a";
    }
}
