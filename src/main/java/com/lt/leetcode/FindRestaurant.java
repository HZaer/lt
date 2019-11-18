package com.lt.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 599. 两个列表的最小索引总和
 * 暴力解法O(n2)
 */
public class FindRestaurant
{
    public static void main(String[] args)
    {
        String[] a = {"1", "2", "3", "4"};
        String[] b = {"3", "2", "5", "9"};
        FindRestaurant s = new FindRestaurant();

        String[] result = s.findRestaurant(a, b);
        for (String str : result)
        {
            System.out.println(str);
        }

    }

    public String[] findRestaurant(String[] list1, String[] list2)
    {
        List<String> resultList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int a = 0;
        int index = 6001;
        for (String list : list1)
        {
            map.put(list, a++);
        }

        for (int j = 0; j < list2.length; j++)
        {
            if (map.get(list2[j]) != null)
            {
                if (map.get(list2[j]) + j < index)
                {
                    index = map.get(list2[j]) + j;
                    resultList.clear();
                    resultList.add(list2[j]);
                }
                else if (map.get(list2[j]) + j == index)
                {
                    resultList.add(list2[j]);
                }
            }
            if (j > index)
            {
                break;
            }
        }

        String[] resultStr = new String[0];
        return resultList.toArray(resultStr);
    }

}
