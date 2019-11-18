package com.lt.testt;

public class CloneTest
{
    public static void main(String[] args)
    {
        A a = new A(new B(1));
        A aa = null;
        try
        {
            aa = (A)a.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        a.print();
        a.c = 2;
        a.b.setA(2);
        a.print();
        aa.c = 3;
        aa.print();

        System.out.println("A = " + a);
        System.out.println("B = " + aa);
    }
}

class A implements Cloneable
{
    int c;

    B b;

    public A(B b)
    {
        this.b = b;
    }

    @Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public void print()
    {
        System.out.println("B = " + this.b.getA() + " c = " + c);
    }
}

class B
{
    private int a;

    public B(int a)
    {
        this.a = a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getA()
    {
        return a;
    }
}


