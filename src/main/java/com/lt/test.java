package com.lt;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        sb.append(sb2);
        System.out.println(sb.toString());
        Map<String, String> map = new HashMap<String, String>();
        map.hashCode();
        map.put("a", "a");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        int single = 1;
        System.out.println(single-- != 0);

        System.out.println(2 << 2);
        int[] array = {1, 2, 3, 4, 5};
        int x = 1, y = 5;
        x ^= y ^= x ^= y;
        System.out.println(x);
        System.out.println(y);
        long a = 100000_1000;
        System.out.println(100_000000);
        array[0] = array[0] ^ array[4];
        for (int b : array)
        {
            System.out.println(b);
        }
        System.out.println();
        array[4] = array[0] ^ array[4];
        for (int b : array)
        {
            System.out.println(b);
        }
        System.out.println();
        array[0] = array[0] ^ array[4];

        for (int b : array)
        {
            System.out.println(b);
        }

    }

    private static void copy(List<String> e)
    {

    }

    @DateTimeFormat
    @JsonFormat
    private Date time;

}
