package com.lt.testt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest
{
    public static void main(String[] args)
        throws ParseException
    {
        //1、
        System.out.println("is 1");
        Calendar c = Calendar.getInstance();
        Date date = null;
        try
        {
            date = new SimpleDateFormat("yyyy-MM-dd").parse("2019-07-01");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);

        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        System.out.println(dayBefore);

        //2
        System.out.println("is 2");
        System.out.println(System.currentTimeMillis());
        Date date2 = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        System.out.println(sdf.format(date2));

        //3
        System.out.println("is 3");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        System.out.println(sdf.format(calendar.getTime()));

        System.out.println("is 4");
        System.out.println(isBetweenTimeEx(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-16"),
            new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-18"),
            new Date()));
    }

    public static boolean isBetweenTimeEx(Date beginTime, Date endTime, Date nowTime)
    {
        return nowTime.after(beginTime) && nowTime.before(endTime);
    }
}
