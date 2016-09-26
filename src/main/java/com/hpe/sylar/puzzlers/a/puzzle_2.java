package com.hpe.sylar.puzzlers.a;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_2 {
    public static void main(String args[]){
        //输出是什么？
        System.out.println(2.00 - 1.10);

        //正确的方式
        BigDecimal b1 = new BigDecimal("2.00");
        BigDecimal b2 = new BigDecimal("1.10");
        System.out.print(b1.subtract(b2));
    }
}
