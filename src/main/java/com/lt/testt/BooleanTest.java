package com.lt.testt;

import java.util.HashMap;
import java.util.Map;

public class BooleanTest
{
    boolean s;

    public boolean getS()
    {
        return s;
    }

    public void setS(boolean s)
    {
        this.s = s;
    }

    public static void main(String[] args)
    {

        Map<String, Object> map = new HashMap<>();
        Boolean flag = (Boolean)map.get("is");
        if (flag)
        {
            System.out.println(flag);
        }
        BooleanTest b = new BooleanTest();
        System.out.println(b.getS());
    }
}
