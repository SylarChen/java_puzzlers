package com.hpe.sylar.puzzlers.f;

import java.util.HashSet;
import java.util.Set;

public class puzzle_59 {
    //    输出是什么
    public static void main(String[ ] args) {
        int vals[ ] = { 789, 678, 567, 456, 345, 234, 123, 012 };
        Set diffs = new HashSet();
        for (int i = 0; i < vals.length; i++)
            for (int j = i; j < vals.length; j++)
                diffs.add(vals[i] - vals[j]);
        System.out.println(diffs.size());
    }
}

//        为什么数组中的最后一个元素是 10 而不是 12 呢？因为以 0 开头的整数类型字面
//        常量将被解释成为八进制数值
//
//        一旦你知道了 012 == 10，就会很清楚为什么该程序打印出了 14：有 6 个不涉及
//        最后一个元素的唯一的非 0 差，有 7 个涉及最后一个元素的非 0 差，还有 0，加
//        在一起正好是 14 个唯一的差