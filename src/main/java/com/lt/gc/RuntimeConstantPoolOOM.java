package com.lt.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟方法区喝运行时常量池溢出
 */
public class RuntimeConstantPoolOOM
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
