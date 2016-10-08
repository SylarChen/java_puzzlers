package com.hpe.sylar.puzzlers.g;

public class puzzle_68 {
    //输出是什么
    public static void main(String[] args){
        System.out.println(X.Y.Z);
    }
}
class X {
    static class Y {
        static String Z = "Black";
    }
    static C Y = new C();
}
class C {
    String Z = "White";
}

//        当一个变量和一个类型具有相同的名字，并且它们位于相同的作用域时，变量名具有优先
//        权[JLS 6.5.2]。变量名将遮掩（obscure）类型名

//        总之，应该遵守标准的命名习惯以避免不同的命名空间之间的冲突，还有一个原
//        因就是如果你违反这些习惯，那么你的程序将让人难以辨认。同样，为了避免变
//        量名与通用的顶层包名相冲突，请使用 MixedCase 风格的类名，即使其名字是首
//        字母缩拼词也应如此