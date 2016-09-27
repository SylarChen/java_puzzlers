package com.hpe.sylar.puzzlers.b;

    public class puzzle_16 {
        public static void main(String[] args){
            //输出是什么？
            // Note: \u000A is Unicode representation of linefeed (LF)
            char c = 0x000A;
            System.out.println(c);

//            这个谜题的关键就是程序第三行的注释。与最好的注释一样，这条注释也是一种
//            准确的表达，遗憾的是，它有一点准确得过头了。编译器不仅会在将程序解析成
//            为符号之前把Unicode 转义字符转换成它们所表示的字符（谜题14），而且它
//                    是在丢弃注释和空格之前做这些事的
        }
    }
