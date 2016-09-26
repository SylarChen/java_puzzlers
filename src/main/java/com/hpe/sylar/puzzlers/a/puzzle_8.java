package com.hpe.sylar.puzzlers.a;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_8 {

        public static void main(String args[]){
            //输出是什么？
            char x = 'X';
            int i = 0;
            System.out.println(true ? x : 0);
            System.out.println(false ? i : x);

            //• 如果第二个和第三个操作数具有相同的类型，那么它就是条件表达式的类型。
            //• 如果一个操作数的类型是 T，T 表示 byte、short 或 char，而另一个操作
            //            数是一个 int 类型的常量表达式，它的值是可以用类型 T 表示的，那么条
            //            件表达式的类型就是 T。
            //• 否则(即另一个操作数不是一个 int 类型的常量表达式， 或超出T的表示范围)，将对操作数类型运用二进制数字提升，而条件表达式的类型就是第
            //            二个和第三个操作数被提升之后的类型。

        }

    }
