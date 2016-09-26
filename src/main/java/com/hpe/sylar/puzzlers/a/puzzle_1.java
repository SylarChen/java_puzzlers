package com.hpe.sylar.puzzlers.a;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_1 {
    public static void main(String[] args){
        System.out.println("-1是奇数吗： " + isOdd(-1));
        System.out.println("1是奇数吗： " + isOdd(1));
        System.out.println("------------------------");
        System.out.println("-1是奇数吗： " + isOddNew(-1));
        System.out.println("1是奇数吗： " + isOddNew(1));
    }

    //判断一个数是否为奇数（错误的方法， 负奇数%2 为 -1）
    public static boolean isOdd(int i){
        return i % 2 == 1;
    }

    //正确方法
    public static boolean isOddNew(int i){
        return i % 2 != 0;
    }
}
