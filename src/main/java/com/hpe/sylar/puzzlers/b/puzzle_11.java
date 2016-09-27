package com.hpe.sylar.puzzlers.b;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_11 {

        public static void main(String args[]){
            //输出是什么？
            System.out.println("H"+"a");
            System.out.println('H'+'a');

//            问题在于'H'和'a'是字符型字面
//            常量，因为这两个操作数都不是字符串类型的，所以 + 操作符执行的是加法而
//            不是字符串连接。
//            编译器在计算常量表达式'H'+'a'时，是通过我们熟知的拓宽原始类型转换将两
//            个具有字符型数值的操作数（'H'和'a'）提升为int 数值而实现的
        }

    }
