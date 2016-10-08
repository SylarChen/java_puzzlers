package com.hpe.sylar.puzzlers.g;

import java.util.Calendar;
import java.util.Date;

public class puzzle_61 {
    //输出是什么
    public static void main(String[ ] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1999, 12, 31); // Year, Month, Day
        System.out.println(cal.get(Calendar.YEAR) + " ");
        Date d = cal.getTime();
        System.out.println(d.getDay());

//        该程序的第一个 bug 就位于方法调用 cal.set(1999,12,31)中。当月份以数字来
//        表示时，习惯上我们将第一个月被赋值为 1。遗憾的是，Date 将一月表示为 0，
//        而 Calendar 延续了这个错误。因此，这个方法调用将日历设置到了 1999 年第
//        13 个月的第 31 天。但是标准的（西历）日历只有 12 个月，该方法调用肯定应
//        该抛出一个 IllegalArgumentException 异常，对吗？它是应该这么做，但是它
//        并没有这么做。Calendar 类直接将其替换为下一年，在本例中即 2000 年的第一
//        个月。这也就解释了我们的程序为什么打印出的第一个数字是 2000。

//        Date.getDay 返回的是 Date
//        实例所表示的星期日期，而不是月份日期。这个返回值是基于 0 的，从星期天开
//        始计算。因此程序所打印的 1 表示 2000 年 1 月 31 日是星期一

        System.out.println(cal.getTime());

        cal.set(1999, Calendar.DECEMBER, 31);
        System.out.println(cal.get(Calendar.YEAR) + " ");
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}

