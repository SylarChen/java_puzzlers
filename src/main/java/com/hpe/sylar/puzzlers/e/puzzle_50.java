package com.hpe.sylar.puzzlers.e;

import java.util.Calendar;

public class puzzle_50 {
//    下面的三个程序每一个都会做些什么呢？
    public static void main(String[] args) {
        //1
        String s = null;
        System.out.println(s instanceof String);

        //2
//        System.out.println(new puzzle_50() instanceof String);

        //3
        puzzle_50 p_50 = (puzzle_50) new Object();
    }
}

//        第一个程序，展示了 instanceof 操作符应用于一个空对象引用时的行为。
//        尽管 null 对于每一个引用类型来说都是其子类型，但是 instanceof 操作符被定
//        义为在其左操作数为 null 时返回 false。因此，Type1 将打印 false。这被证明
//        是实践中非常有用的行为。如果 instanceof 告诉你一个对象引用是某个特定类
//        型的实例，那么你就可以将其转型为该类型，并调用该类型的方法，而不用担心
//        会抛出 ClassCastException 或 NullPointerException 异常。
//
//        第二个程序，该程序编译失败是因为 instanceof 操作符有这样的要求：如果两个操作数的类
//        型都是类，其中一个必须是另一个的子类型
//
//        第三个程序展示了转型
//        操作符的行为的一个冷僻案例，在此案例中，编译器并不能将你从你所做荒唐的
//        事中搭救出来，只能靠 VM 在运行期来帮你绷紧这根弦。