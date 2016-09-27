package com.hpe.sylar.puzzlers.b;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_12 {

        public static void main(String args[]){
            //输出是什么？
            String letters = "ABC";
            char[] numbers = {'1', '2', '3'};
            System.out.println(letters + " easy as " + numbers);
            System.out.println(numbers);
            System.out.println(numbers.toString());
            System.out.println(String.valueOf(numbers));

            //println 的char[]重载版本会打印出数组所包含的所有字符
            //而System.out.println(letters + " easy as " + numbers); 调用的是println(String str), 所以调用的是numbers.toString()
        }

    }
