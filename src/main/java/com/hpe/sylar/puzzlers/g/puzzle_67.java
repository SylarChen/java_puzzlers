package com.hpe.sylar.puzzlers.g;

public class puzzle_67 {
    //输出是什么
    public static void main(String[] args) {
        String s = new String("Hello world");
        System.out.println(s);
    }
}
//class String {
//    private final java.lang.String s;
//    public String(java.lang.String s) {
//        this.s = s;
//    }
//    public java.lang.String toString() {
//        return s;
//    }
//}

//        如果你尝试着运行该程序，你会发现你运行不了它，VM 将弹出了
//        一个像下面这样的错误消息：
//        Exception in thread "main" java.lang.NoSuchMethodError: main
//        但是它肯定是一个 main 方法的：它就白纸黑字地写在那里。为什么 VM 找不到它
//        呢？
//        VM 不能找到 main 方法是因为它并不在那里。尽管 puzzle_67 有一个被命名为
//        main 的方法，但是它却具有错误的签名。一个 main 方法必须接受一个单一的字
//        符串数组参数[JVMS 5.2]。VM 努力要告诉我们的是 StrungOut.main 接受的是由
//        我们的 String 类所构成的数组，它无论如何都与 java.lang.String 没有任何关
//        系。

//改 public static void main(String[] args) 为 public static void main(java.lang.String[] args)
