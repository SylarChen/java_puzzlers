package com.hpe.sylar.puzzlers.h;

import static java.util.Arrays.toString;

public class puzzle_71 {
    //输出是什么
    public static void main(String[ ] args) {
        printArgs(1, 2, 3, 4, 5);
    }
    static void printArgs(Object... args) {
        System.out.println(toString(args));
    }

}

//        为什么它会尝试着去应用 Object.toString()
//        呢？它与调用参数列表并不匹配，而 Arrays.toString(Object[ ])却可以完全
//        匹配

//        简单地说，本身就属于某个范围的成员在该范围内与静态导入相比具有优先权。
//        这导致的后果之一就是与 Object 的方法具有相同名字的静态方法不能通过静态导入工具而得到使用。

//        既然你不能对 Arrays.toString 使用静态导入，那么你就应该用一个普通的导入
//        声明来代替。下面就是 Arrays.toString 应该被正确使用的方式：
//        import java.util.Arrays;
//        class ImportDuty {
//            static void printArgs(Object... args) {
//                System.out.println(Arrays.toString(args));
//            }
//        }