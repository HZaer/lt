package com.lt.testt;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class HashSetTest
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(1);
        Set<String> hs = new HashSet<String>();
        hs.add("1");
        hs.add("12");
        hs.add("3");
        hs.add("90");
        hs.add("4");
        hs.add("32");
        hs.add("88");
        hs.add("8");
        hs.add("9");
        hs.add("1");

        for (int i = 0; i < 10000; i++)
        {

        }
        //增强for遍历
        for (String s : hs)
        {
            System.out.print(s + " ");
        }
    }
}
