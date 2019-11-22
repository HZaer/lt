package com.lt.testt;

import java.security.SecureRandom;

public class IntegerTest
{
    public static void main(String[] args)
    {
        System.out.println(2/3);
        //int a = Integer.valueOf("");
        //System.out.println(a);
        /*for(int i  =0;i<1000;i++){
            System.out.println(new SecureRandom().nextInt(99999999 - 100000 + 1) + 100000);
        }*/

        char aa = 'a';
        String str = Character.toString(aa);
        System.out.println(str);
        str = String.valueOf(aa);
        System.out.println(str);
    }
}
