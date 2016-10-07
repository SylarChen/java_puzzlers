package com.hpe.sylar.puzzlers.c;

import java.util.Random;

public class puzzle_24 {
        public static void main(String[] args){
            //输出是什么？
            for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
                if (b == 0x90)
                    System.out.print("Joy!");
            }

//            简单地说，0x90 是一个 int 常量，它超出了 byte 数值的范围。这与直觉是相悖
//            的，因为 0x90 是一个两位的十六进制字面常量，每一个十六进制位都占据 4 个
//            比特的位置，所以整个数值也只占据 8 个比特，即 1 个 byte。问题在于 byte 是
//            有符号类型。常量 0x90 是一个正的最高位被置位的 8 位 int 数值。合法的 byte
//            数值是从-128 到+127，但是 int 常量 0x90 等于+144。

            //0x90 等于 2进制 10010000 等于10进制 144
            //byte 有正负 10010000 是个负数

            for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
                if (b == (byte)0x90)
                    System.out.print("Joy!");
            }
        }
    }
