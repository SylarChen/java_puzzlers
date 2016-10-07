package com.hpe.sylar.puzzlers.e;

class Dogg {
    //输出？
    public static void bark() {
        System.out.println("woof ");
    }
}
class Basenji extends Dogg {
    public static void bark() { }
}
public class puzzle_48 {
    public static void main(String args[]) {
        Dogg woofer = new Dogg();
        Dogg nipper = new Basenji();
        woofer.bark();
        nipper.bark();
    }
}

//        bark 是一个静态方法，而对静态方法的调用不存在任何动态的分派机
//        制[JLS 15.12.4.4]。当一个程序调用了一个静态方法时，要被调用的方法都是
//        在编译时刻被选定的，而这种选定是基于修饰符的编译期类型而做出的，修饰符
//        的编译期类型就是我们给出的方法调用表达式中圆点左边部分的名字。在本案
//        中，两个方法调用的修饰符分别是变量 woofer 和 nipper，它们都被声明为 Dog
//        类型。因为它们具有相同的编译期类型，所以编译器使得它们调用的是相同的方
//        法：Dog.bark。这也就解释了为什么程序打印出 woof woof。尽管 nipper 的运
//        行期类型是 Basenji，但是编译器只会考虑其编译器类型