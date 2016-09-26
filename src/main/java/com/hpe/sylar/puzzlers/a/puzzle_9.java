package com.hpe.sylar.puzzlers.a;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_9 {

        public static void main(String args[]){
            //输出是什么？
            short x = 0;
            int i = 123456;
            x += i;
            System.out.println(x);

            //x += i 包含隐式转换
            //x += i  等价于 x += (short) i
            // += 会隐式转换右操作数类型到左操作数类型
            x = 0;
            i = 123456;
            System.out.println(x + i);
            System.out.println(i + x);
            System.out.println(x += (short) i);
        }

    }
