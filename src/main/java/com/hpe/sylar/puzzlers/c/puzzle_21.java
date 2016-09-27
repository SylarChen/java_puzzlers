package com.hpe.sylar.puzzlers.c;

import java.io.File;
import java.util.regex.Matcher;

public class puzzle_21 {
        public static void main(String[] args){
            //输出是什么？
            System.out.println(puzzle_21.class.getName().replaceAll("\\.", File.separator) + ".class");

//            这个程序根据底层平台的不同会显示两种行为中的一种。如果文件分隔符是斜
//            杠，就像在UNIX 上一样，那么该程序将打印com/javapuzzlers/MeToo.class，
//            这是正确的。但是，如果文件分隔符是反斜杠，就像在Windows 上一样，那么该
//            程序将报错
//
//            事实证明，String.replaceAll 的第二个参数不是一个普通的字符串，而是一个
//            替代字符串（replacement string），就像在java.util.regex 规范中所定义的
//            那样[Java-API]。在替代字符串中出现的反斜杠会把紧随其后的字符进行转义，
//            从而导致其被按字面含义而处理了。

            System.out.println(puzzle_21.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");

//            引入到5.0 版本中的第二个方法提供了一个更好的解决方案。该方法就是
//            String.replace(CharSequence, CharSequence)，它做的事情和
//            String.replaceAll 相同，但是它将模式和替代物都当作字面含义的字符串处
//            理。下面展示了如何使用这个方法来订正该程序：
            System.out.println(puzzle_21.class.getName().replace(".", File.separator) + ".class");

//            Replace 和 ReplaceAll的区别
//            http://stackoverflow.com/questions/10827872/difference-between-string-replace-and-replaceall
        }
    }
