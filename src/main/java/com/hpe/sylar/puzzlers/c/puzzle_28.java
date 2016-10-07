package com.hpe.sylar.puzzlers.c;

public class puzzle_28 {
    public static void main(String[] args) {
//        你的任务就是写一个变量声明，在将它作用于该循环之上时，使得该循环无限循环下去。
//        例如，考虑下面的 for 循环：
        for (int i = start; i <= start + 1; i++) {}
        //答案：
        //int start = Integer.MAX_VALUE - 1;

//        什么样的声明能够让下面的循环变成一个无限循环？
        While (i == i + 1) {}

        //答案：
//        你可以用任何被计算为无穷大的浮点算术表达式来初始化 i，例如：
//        double i = 1.0 / 0.0;
//        不过，你最好是能够利用标准类库为你提供的常量：
//        double i = Double.POSITIVE_INFINITY;
//        事实上，你不必将 i 初始化为无穷大以确保循环永远执行。任何足够大的浮点数
//        都可以实现这一目的，例如：
//        double i = 1.0e40;


    }
}
