package com.lt.gc;

import java.util.ArrayList;
import java.util.List;

public class StackOverTest
{
    static class OOMObject
    {

    }

    public static void main(String[] args)
    {
        StackOverTest s= new StackOverTest();
        s.stackLeak();
    }


    String stackLeak(){
        return stackLeak();
    }
}
