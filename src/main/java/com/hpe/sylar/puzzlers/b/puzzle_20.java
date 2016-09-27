package com.hpe.sylar.puzzlers.b;

import java.io.UnsupportedEncodingException;

public class puzzle_20 {
        public static void main(String[] args){
            //输出是什么？
            System.out.println(puzzle_20.class.getName());
            System.out.println(puzzle_20.class.getName().replaceAll(".","/") + ".class");

//            问题在于String.replaceAll 接受了一个正则表达式作为它的第一个参数，而并
//            非接受了一个字符序列字面常量。（正则表达式已经被添加到了Java 平台的1.4
//            版本中。）正则表达式“.”可以匹配任何单个的字符，因此，类名中的每一个
//            字符都被替换成了一个斜杠，进而产生了我们看到的输出。
//            要想只匹配句点符号，在正则表达式中的句点必须在其前面添加一个反斜杠（\）
//            进行转义。因为反斜杠字符在字面含义的字符串中具有特殊的含义——它标识转
//            义字符序列的开始——因此反斜杠自身必须用另一个反斜杠来转义，这样就可以
//            产生一个转义字符序列，它可以在字面含义的字符串中生成一个反斜杠

            //两个反斜杠转义！ 正则表达式中 . 代表左右， \ 代表转义字符的开始
            System.out.println(puzzle_20.class.getName().replaceAll("\\.","/") + ".class");
        }
    }
