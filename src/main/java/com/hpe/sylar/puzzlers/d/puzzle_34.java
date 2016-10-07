package com.hpe.sylar.puzzlers.d;

public class puzzle_34 {
    public static void main(String[] args) {
        //输出是什么？
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++)
            count++;
        System.out.println(count);

//        问题在于终止条件测试失败了，其方式与增量操作失败的方式非常相似。这个循
//        环只有在循环索引 f 比(float)(START + 50)小的情况下才运行。在将一个 int
//        与一个 float 进行比较时，会自动执行从 int 到 float 的提升[JLS 15.20.1]。
//        遗憾的是，这种提升是会导致精度丢失的三种拓宽原始类型转换的一种[JLS
//        5.1.2]。（另外两个是从 long 到 float 和从 long 到 double。）
//        f 的初始值太大了，以至于在对其加上 50，然后将结果转型为 float 时，所产生
//        的数值等于直接将 f 转换成 float 的数值。换句话说，(float)2000000000 ==
//                2000000050，因此表达式 f < START + 50 即使是在循环体第一次执行之前就是
//        false，所以，循环体也就永远的不到机会去运行。

    }
}
