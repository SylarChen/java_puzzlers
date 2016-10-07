package com.hpe.sylar.puzzlers.d;

public class puzzle_40 {
            private puzzle_40 internalInstance = new puzzle_40();
            public puzzle_40() throws Exception {
                throw new Exception("I'm not coming out");
            }
            public static void main(String[] args) {
                //输出是什么？
                try {
                    puzzle_40 b = new puzzle_40();
                    System.out.println("Surprise!");
                } catch (Exception ex) {
                    System.out.println("I told you so");
                }
            }

//    当你调用一个构造器时，实例变量的初始化操作将先于构造器的程序体而
//    运行[JLS 12.5]。在本谜题中， internalInstance 变量的初始化操作递归调用
//    了构造器，而该构造器通过再次调用 Reluctant 构造器而初始化该变量自己的
//    internalInstance 域，如此无限递归下去。这些递归调用在构造器程序体获得
//    执行机会之前就会抛出 StackOverflowError 异常，因为 StackOverflowError
//    是 Error 的子类型而不是 Exception 的子类型，所以 catch 子句无法捕获它
}

