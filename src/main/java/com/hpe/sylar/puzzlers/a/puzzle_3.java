package com.hpe.sylar.puzzlers.a;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_3 {

        public static void main(String args[]){
            //输出是什么？
            final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
            final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
            System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);

            //正确的方法
            final long MICROS_PER_DAY2 = 24L * 60 * 60 * 1000 * 1000;
            final long MILLIS_PER_DAY2 = 24 * 60 * 60 * 1000;
            System.out.println(MICROS_PER_DAY2/MILLIS_PER_DAY2);

            System.out.println("------------------");
            System.out.println(Integer.MAX_VALUE + ", 21亿");
            System.out.println(Long.MAX_VALUE + ", 9亿兆");
        }

    }
