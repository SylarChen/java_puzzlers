package com.hpe.sylar.puzzlers.d;

public class puzzle_35 {
    public static void main(String[] args) {
        //输出是什么？
        int minutes = 0;
        for (int ms = 0; ms < 60*60*1000; ms++)
            if (ms % 60*1000 == 0)
                minutes++;
        System.out.println(minutes);

        //取余和乘法操作符具有相同的优先 级[JLS 15.17]，因此表达式 ms % 60*1000 等价于(ms % 60)*1000


    }
}
