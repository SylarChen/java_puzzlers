package com.hpe.sylar.puzzlers.f;

public class puzzle_55 {
    //    输出是什么
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)
            Creature creature = new Creature();
        System.out.println(Creature.numCreated());
    }
}
class Creature {
    private static long numCreated = 0;
    public Creature() {
        numCreated++;
    }
    public static long numCreated() {
        return numCreated;
    }
}

//        一个本地变量声明看起来像是一条语句，但是从技术上说，它不是；它应该是一
//        个本地变量声明语句（local variable declaration statement）[JLS 14.4]。
//        Java 语言规范不允许一个本地变量声明语句作为一条语句在 for、while 或 do
//        循环中重复执行[JLS 14.12-14]。