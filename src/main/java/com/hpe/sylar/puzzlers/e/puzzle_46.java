package com.hpe.sylar.puzzlers.e;

public class puzzle_46 {
    //输出？
    private puzzle_46(Object o) {
        System.out.println("Object");
    }
    private puzzle_46(double[] dArray) {
        System.out.println("double array");
    }
    public static void main(String[] args) {
        new puzzle_46(null);
    }

//    如果一个方法或构造器可以接受传递给另一个方法或构造器的任何参数，那么我们就说第一个方法比第二个方法缺乏精确性

//    出现在调用中的参数（这里是null）只是被用来确定哪一个重载版本是可应用的 （这里两个版本都可以用）。
//    一旦编译器确定了哪些重载版本是可获得且可应用的，它就会选择最精确的一个重载版本

//    调用时会找最精确的版本用
}

