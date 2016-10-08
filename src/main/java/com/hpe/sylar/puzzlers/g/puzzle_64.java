package com.hpe.sylar.puzzlers.g;

import java.util.HashMap;
import java.util.Map;

public class puzzle_64 {
    //输出是什么
    public static void main(String args[ ]) throws InterruptedException {
        try{
            final int MODULUS = 3;
            int[] histogram = new int[MODULUS];
            // Iterate over all ints (Idiom from Puzzle 26)
            int i = Integer.MIN_VALUE;
            do {
                histogram[Math.abs(i) % MODULUS]++;
            } while (i++ != Integer.MAX_VALUE);
            for (int j = 0; j < MODULUS; j++)
                System.out.println(histogram[j] + " ");
        }catch(Exception e){
            e.printStackTrace();
        }

//        我们必须要去看看 Math.abs 的文档。这个方法的名字有一点
//        带有欺骗性，它几乎总是返回它的参数的绝对值，但是在有一种情况下，它做不
//        到这一点。文档中叙述道：“如果其参数等于 Integer.MIN_VALUE，那么产生的
//        结果与该参数相同，它是一个负数。

        Thread.sleep(100);
        System.out.println("------------------------------");
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Math.abs(Integer.MIN_VALUE));

//        上述这种行为的根源在于 2 的补码算数具有不对称性，这在谜题 33 中已经很详细的讨论过了。
//        简单地讲，没有任何 int 数值可以表示 Integer.MIN_VALUE 的负值，也没有任何
//        long 数值可以表示 Long.MIN_VALUE 的负值。
    }
}