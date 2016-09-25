package com.hpe.sylar.puzzlers;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_5 {

        public static void main(String args[]){
            //输出是什么？
            System.out.println(
                    Long.toHexString(0x100000000L + 0xcafebabe)
            );

            System.out.println("---------------------------------------------");
            //不会是1cafebabe
            //如果十六进制和八进制字面常量的最高位被置位了，那么它们就是负数。 十进制字面常量都是正的
            //0xcafebabe占满int的32位，最高位为1说明是负数，上面加法等价于
            //            0xffffffffcafebabeL
            //          + 0x0000000100000000L
            //          ---------------------
            //            0x00000000cafebabeL
            System.out.println(Long.toHexString(Integer.MAX_VALUE));
            System.out.println(0xcafebabe);
            System.out.println("----------------how to fix it----------------");
            //0xcafebabeL 等于 0x00000000cafebabeL
            System.out.println(
                    Long.toHexString(0x100000000L + 0xcafebabeL)
            );
        }

    }
