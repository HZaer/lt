package com.lt.testt;

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
        BooleanTest b = new BooleanTest();
        System.out.println(b.getS());
    }
}
