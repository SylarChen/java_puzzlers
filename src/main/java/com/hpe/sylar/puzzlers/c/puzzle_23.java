package com.hpe.sylar.puzzlers.c;

import java.util.Random;

public class puzzle_23 {
        private static Random rnd = new Random();
        public static void main(String[] args){
            //输出是什么？
            StringBuffer word = null;
            switch(rnd.nextInt(2)) {
                case 1: word = new StringBuffer('P');
                case 2: word = new StringBuffer('G');
                default: word = new StringBuffer('M');
            }
            word.append('a');
            word.append('i');
            word.append('n');
            System.out.println(word);

//            有三个bug 凑到一起引发了这种行为

//            Random.nextInt(int)的规范描述道：“返回一个伪随机的、均等地分布在从0
//            （包括）到指定的数值（不包括）之间的一个int 数值”[Java-API]。这意味着
//            表达式rnd.nextInt(2)可能的取值只有0和1

//            在不同的情况（case）中没有任何break 语句

//            最后一个，也是最微妙的一个bug 是表达式new StringBuffer('M')可能没有做
//            哪些你希望它做的事情。你可能对StringBuffer(char)构造器并不熟悉，这很
//            容易解释：它压根就不存在。StringBuffer 有一个无参数的构造器，一个接受
//            一个String 作为字符串缓冲区初始内容的构造器，以及一个接受一个int 作为
//            缓冲区初始容量的构造器。在本例中，编译器会选择接受int 的构造器，通过拓
//            宽原始类型转换把字符数值'M'转换为一个int 数值77[JLS 5.1.2]。换句话说，
//            new StringBuffer('M')返回的是一个具有初始容量77 的空的字符串缓冲区。该
//            程序余下的部分将字符a、i 和n 添加到了这个空字符串缓冲区中，并打印出该
//            字符串缓冲区那总是ain 的内容

            StringBuffer word2 = null;
            switch(rnd.nextInt(3)) {
                case 1:
                    word2 = new StringBuffer("P");
                    break;
                case 2:
                    word2 = new StringBuffer("G");
                    break;
                default:
                    word2 = new StringBuffer("M");
                    break;
            }
            word2.append('a');
            word2.append('i');
            word2.append('n');
            System.out.println(word2);

//            尽管这个程序订正了所有的bug，它还是显得过于冗长了。下面是一个更优雅的版本:
            System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
        }
    }
