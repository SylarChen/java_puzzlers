package com.hpe.sylar.puzzlers.b;

import java.io.UnsupportedEncodingException;

public class puzzle_18 {
        public static void main(String[] args){
            //输出是什么？
            byte bytes[] = new byte[256];
            for (int i = 0; i < 256; i++)
                bytes[i] = (byte)i;
            String str = new String(bytes);
            for (int i = 0, n = str.length(); i < n; i++)
                System.out.println((int)str.charAt(i) + " ");

//            如果你运行该程序，可能会看到这样的序列。但是在运行一次，可能看到的就不
//            是这个序列了。我们在四台机器上运行它，会看到四个不同的序列，包括前面描
//            述的那个序列。这个程序甚至都不能保证会正常终止，比打印其他任何特定字符
//            串都要缺乏这种保证。它的行为完全是不确定的。
//            这里的罪魁祸首就是String(byte[])构造器。有关它的规范描述道：“在通过
//            解码使用平台缺省字符集的指定byte 数组来构造一个新的String 时，该新
//            String 的长度是字符集的一个函数，因此，它可能不等于byte 数组的长度。当
//            给定的所有字节在缺省字符集中并非全部有效时，这个构造器的行为是不确定
//            的”

            System.out.println("------------------------------------------------------------------------------");

            String str2 = null;
            try {
                str2 = new String(bytes, "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            for (int i = 0, n = str2.length(); i < n; i++)
                System.out.println((int)str2.charAt(i) + " ");


//            这个谜题的教训是：每当你要将一个byte 序列转换成一个String 时，你都在使
//            用某一个字符集，不管你是否显式地指定了它。如果你想让你的程序的行为是可
//            预知的，那么就请你在每次使用字符集时都明确地指定。
        }
    }
