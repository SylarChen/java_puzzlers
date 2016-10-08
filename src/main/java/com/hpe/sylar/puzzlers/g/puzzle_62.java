package com.hpe.sylar.puzzlers.g;

import java.util.IdentityHashMap;
import java.util.Map;

public class puzzle_62 {
    //输出是什么
    public static void main(String[ ] args) {
        Map<String, String> m =
                new IdentityHashMap<String, String>();
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
        System.out.println(m.size());
    }
}

//        对该程序的一种幼稚的分析认为，它应该打印 1。它们具有相同的键（Mickey）。从而只留下一个映射关系在映射表中。
//
//        更透彻一些的分析会对这个预测产生质疑。IdentityHashMap 的文档中叙述道：
//        “这个类用一个散列表实现了 Map 接口，它在比较键时，使用的是引用等价性而
//        不是值等价性”(用的是==比较)
//
//        但是，相等的字符串常量同时也是相同的，所以结果是1