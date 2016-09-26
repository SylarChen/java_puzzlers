package com.hpe.sylar.puzzlers.a;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class puzzle_6 {

        public static void main(String args[]){
            //输出是什么？
            System.out.println((int)(char)(byte) -1);

            //int 32位
            //char 16位 ---> 无符号类型
            //byte 8位

            //多位到低位的转换： 窄化原始类型转化（narrowing primitiveconversion），直接砍掉高位保留低位
            //(byte) -1 剩下 8位1

            //低位到高位转换：如果最初的数值类型是有符号的，那么就执行符号扩展；如果它是 char，那么不管它将要被转换成什么类型，都执行零扩展

            //16位置1，等于16进制4位全f
            System.out.println(0xffff);
        }

    }
