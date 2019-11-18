package com.lt.gc;


import sun.misc.Unsafe;

import java.lang.reflect.Field;
/**
 * 模拟本直接内存溢出
 */
public class DirectMemoryOOM
{
    private static final int _1MB = 1024*1024;

    public static void main(String[] args)
    {
       // Field unsafeField = Unsafe.class.getDeclaredField("1");
    }
}
