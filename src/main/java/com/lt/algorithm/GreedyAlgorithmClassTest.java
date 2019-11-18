package com.lt.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 尽可能多的将课程安排在一间教室里
 */
public class GreedyAlgorithmClassTest
{

    private List<GreedyAlgorithmClassTest> greedy(List<GreedyAlgorithmClassTest> list)
    {
        List<GreedyAlgorithmClassTest> result = new ArrayList<>();
        boolean flag = true;
        int a = 0;
        double c = list.get(0).getEndTime();
        for (int i = 1; i < list.size(); i++)
        {
            if (c > list.get(i).getEndTime())
            {
                c = list.get(i).getEndTime();
                a = i;
            }
        }
        result.add(list.get(a));
        list.remove(a);

        while (flag)
        {
            a = -1;
            double d = -1;
            for (int i = 0; i < list.size(); i++)
            {
                if (c < list.get(i).getEndTime() && c <= list.get(i).getStartTime()&&d <list.get(i).getStartTime())
                {
                    c = list.get(i).getEndTime();
                    d = c;
                    a = i;
                }
            }
            if (a == -1)
            {
                break;
            }
            result.add(list.get(a));
            list.remove(a);
        }
        return result;
    }

    public static void main(String[] args)
    {
        List<GreedyAlgorithmClassTest> list = new ArrayList<>();
        GreedyAlgorithmClassTest chinese = new GreedyAlgorithmClassTest();
        chinese.setSubject("语文");
        chinese.setStartTime(9);
        chinese.setEndTime(10);
        list.add(chinese);

        GreedyAlgorithmClassTest math = new GreedyAlgorithmClassTest();
        math.setSubject("数学");
        math.setStartTime(9.5);
        math.setEndTime(10.5);
        list.add(math);

        GreedyAlgorithmClassTest english = new GreedyAlgorithmClassTest();
        english.setSubject("英语");
        english.setStartTime(10);
        english.setEndTime(11);
        list.add(english);

        GreedyAlgorithmClassTest chemistry = new GreedyAlgorithmClassTest();
        chemistry.setSubject("化学");
        chemistry.setStartTime(11);
        chemistry.setEndTime(12);
        list.add(chemistry);

        GreedyAlgorithmClassTest physics = new GreedyAlgorithmClassTest();
        physics.setSubject("物理");
        physics.setStartTime(10.5);
        physics.setEndTime(12);
        list.add(physics);

        List<GreedyAlgorithmClassTest> result = chinese.greedy(list);
        for (GreedyAlgorithmClassTest c : result)
        {
            System.out.println(c.getSubject());
        }

    }

    private String subject;

    private double startTime;

    private double endTime;

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public double getStartTime()
    {
        return startTime;
    }

    public void setStartTime(double startTime)
    {
        this.startTime = startTime;
    }

    public double getEndTime()
    {
        return endTime;
    }

    public void setEndTime(double endTime)
    {
        this.endTime = endTime;
    }
}
