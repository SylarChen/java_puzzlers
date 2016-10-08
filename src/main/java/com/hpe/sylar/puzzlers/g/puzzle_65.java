package com.hpe.sylar.puzzlers.g;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class puzzle_65 {
    //输出是什么
    public static void main(String[ ] args) {
        Random rnd = new Random();
        Integer[ ] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt();
        Comparator<Integer> cmp = new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        };
        Arrays.sort(arr, cmp);
        System.out.println(order(arr));

//        当你在做两个 int 或 long 数值的减法时，其结果可
//        能会溢出，在这种情况下我们就会得到错误的符号
        Comparator<Integer> cmp2 = new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return (i2 < i1 ? -1 : (i2 == i1 ? 0 :1));
            }
        };

        Arrays.sort(arr, cmp2);
        System.out.println(order(arr));
    }
    enum Order { ASCENDING, DESCENDING, CONSTANT, UNORDERED }

    static Order order(Integer[ ] a) {
        boolean ascending = false;
        boolean descending = false;
        for (int i = 1; i < a.length; i++) {
            ascending |= a[i] > a[i-1];
            descending |= a[i] < a[i-1];
        }
        if (ascending && !descending)
            return Order.ASCENDING;
        if (descending && !ascending)
            return Order.DESCENDING;
        if (!ascending)
            return Order.CONSTANT; // All elements equal
        return Order.UNORDERED; // Array is not sorted
    }
}