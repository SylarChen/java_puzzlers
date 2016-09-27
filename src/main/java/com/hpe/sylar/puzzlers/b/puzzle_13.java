package com.hpe.sylar.puzzlers.b;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_13 {

        public static void main(String args[]){
            //输出是什么？
            final String pig = "length: 10";
            final String dog = "length: " + pig.length();
            System.out. println("Animals are equal: " + (pig == dog));

//            ==操作符测试的是这两个对象引用是否正好引用到了相同的对象上。在本例中，它
//            们并非引用到了相同的对象上。
//            你可能知道String类型的编译期常量是内存限定的。换句话说，任何两个String
//            类型的常量表达式，如果标明的是相同的字符序列，那么它们就用相同的对象引
//            用来表示。如果用常量表达式来初始化pig 和dog，那么它们确实会指向相同的
//            对象，但是dog 并不是用常量表达式初始化的
            final String pig2 = "length: 10";
            final String dog2 = "length: " + "10";
            System.out. println("Animals are equal: " + (pig2 == dog2));
        }

    }
