package com.hpe.sylar.puzzlers.c;

import java.util.Random;

public class puzzle_26 {
    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;
    public static void main(String[] args) {
        //输出是什么？
        int count = 0;
        for (int i = START; i <= END; i++)
            count++;
        System.out.println(count);

        //i加到END后还会加1，导致i溢出为0，重新进入循环
        //实际上是死循环
    }
}
