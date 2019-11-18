package com.lt.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟方法区喝运行时常量池溢出
 */
public class RuntimeConstantPoolOOM2
{
    public static void main(String[] args)
    {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("计算").append("机 ").toString();
        System.out.println(str2.intern() == str2);
    }
}
