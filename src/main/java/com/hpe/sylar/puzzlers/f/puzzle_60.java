package com.hpe.sylar.puzzlers.f;

import java.util.*;

public class puzzle_60 {
//    现在该轮到你写一些代码了。下面的谜题每一个都可以用一个方法来解决，这些
//    方法的方法体都只包含一行代码。各就各位，预备，编码！

//            • A．编写一个方法，它接受一个包含元素的 List，并返回一个新的 List，
//                   它以相同的顺序包含相同的元素，只不过它把第二次以及后续出现的重复
//                  元素都剔除了。例如，如果你传递了一个包
//                  含”spam”,”sausage”,”spam”,”spam”,”bacon”,”spam”,”t
//                  omato”和”spam”的列表，那么你将得到一个包
//                  含”spam”,”sausage”,”bacon”,”tomato”的新列表。

    static <E> List<E> withoutDuplicates(List<E> original) {
        return new ArrayList<E>(new LinkedHashSet<E>(original));
    }

//            • B．编写一个方法，它接受一个由 0 个或多个由逗号分隔的标志所组成的
//                  字符串，并返回一个表示这些标志的字符串数组，数组中的元素的顺序与
//                  这些标志在输入字符串中出现的顺序相同。每一个逗号后面都可能会跟随
//                  0 个或多个空格字符，这个方法忽略它们。例如，如果你传递的字符串
//                  是”fear, surprise, ruthless efficiency, an almost fanatical
//                  devotion to the Pope, nice red uniforms”，那么你得到的将是一个
//                  包含 5 个元素的字符串数组，这些元素
//                  是”fear”，”surprise”，”ruthless efficiency”，”an almost
//                  fanatical devotion to the Pope” 和 “nice red uniform”。

    static String[ ] parse(String string) {
        return string.split(",\\S*");
    }


    //            • C．假设你有一个多维数组，出于调试的目的，你想打印它。你不知道这
//                  个数组有多少级，以及在数组的每一级中所存储的对象的类型。编写一个
//                  方法，它可以向你显示出在每一级上的所有元素。

    static void print(String[][][] arr) {
        System.out.println(Arrays.toString(arr));
    }

//            • D．编写一个方法，它接受两个 int 数值，并在第一个数值与第二个数值
//                   以二进制补码形式进行比较，具有更多的位被置位时，返回 true。
    static Boolean hasMoreBitsSet(int i, int j) {
        return (Integer.bitCount(i) > Integer.bitCount(j));
    }
}
