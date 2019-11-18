package com.lt.testt;

public class ReplaceTest
{
    public static void main(String[] args)
    {
        String a = "123|123123|";
        a = a.replace("|", "");
        String aa[] = a.split("|");
        System.out.println(aa[0]);
        System.out.println(a);
    }
}
