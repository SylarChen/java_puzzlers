package com.hpe.sylar.puzzlers.c;

public class puzzle_29 {
    public static void main(String[] args) {
//        请提供一个对 i 的声明，将下面的循环转变为一个无限循环：
        while (i != i) {
            System.out.println("qq");
        }

        //答案：
//        你可以用任何计算结果为 NaN 的浮点算术表达式来初始化 i，例如：
//        double i = 0.0 / 0.0;
//        同样，为了表达清晰，你可以使用标准类库提供的常量：
//        double i = Double.NaN;

        //double i = Double.POSITIVE_INFINITY 不行



    }
}
