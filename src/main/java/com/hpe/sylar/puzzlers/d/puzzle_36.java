package com.hpe.sylar.puzzlers.d;

public class puzzle_36 {
    public static void main(String[] args) {
            //输出是什么？
            System.out.println(decision());
        }
        static boolean decision() {
            try {
                return true;
            } finally {
                return false;
            }
        }

//    总之，每一个 finally 语句块都应该正常结束，除非抛出的是不受检查的异常。
//    千万不要用一个 return、break、continue 或 throw 来退出一个 finally 语句块，
//    并且千万不要允许将一个受检查的异常传播到一个 finally 语句块之外去。
}