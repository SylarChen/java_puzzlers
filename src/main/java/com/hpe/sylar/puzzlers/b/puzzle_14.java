package com.hpe.sylar.puzzlers.b;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_14 {

        public static void main(String args[]){
            //输出是什么？
            // \u0022 是双引号的Unicode 转义字符
            System.out.println("a\u0022.length() +\u0022b".length());


//            Java 对在字符串字面常量中的Unicode 转义字
//            符没有提供任何特殊处理。编译器在将程序解析成各种符号之前，先将Unicode
//            转义字符转换成为它们所表示的字符[JLS 3.2]。因此，程序中的第一个Unicode
//            转义字符将作为一个单字符字符串字面常量（"a"）的结束引号，而第二个
//            Unicode 转义字符将作为另一个单字符字符串字面常量（"b"）的开始引号。程
//            序打印的是表达式"a".length()+"b".length()，即2。

            //上例等价于
            System.out.println("a".length() +"b".length());

            System.out.println("a\\u0022.length() +\\u0022b".length());
        }

    }
