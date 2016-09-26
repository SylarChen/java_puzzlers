package com.hpe.sylar.puzzlers.a;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_7 {

        public static void main(String args[]){
            //输出是什么？
            int x = 1984; // (0x7c0)
            int y = 2001; // (0x7d1)
            x^= y^= x^= y;
            System.out.println("x= " + x + "; y= " + y);

            //在单个的表达式中不要对相同的变量赋值两次

            int x2 = 1984; // (0x7c0)
            int y2 = 2001; // (0x7d1)
            x2 = y2 ^ x2 ;
            y2 = y2 ^ x2;
            x2 = y2 ^ x2;
            System.out.println("x2= " + x2 + "; y2= " + y2);


        }

    }
