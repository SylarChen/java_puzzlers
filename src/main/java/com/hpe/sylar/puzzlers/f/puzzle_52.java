package com.hpe.sylar.puzzlers.f;

public class puzzle_52 {
    //    输出是什么
    public static void main(String[] args) {
        System.out.println(Cache.getSum());
    }
}

class Cache {
    static {
        initializeIfNecessary();
    }
    private static int sum;
    public static int getSum() {
        initializeIfNecessary();
        return sum;
    }

    private static boolean initialized = false;
    private static synchronized void initializeIfNecessary() {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
    }
}

//        我们知道这个总和是 99×100/2，即 4,950。但是，这个程序可不这么想，它打印的是 9900，是我们所预期值的整整两倍。
//
//        类初始化是按照静态初始器在源代码中出现的顺序去执行这些初始器
//        的。Cache 类有两个静态初始器：在类顶端的一个 static 语句块，以及静态域
//        initialized 的初始化。静态语句块是先出现的，它调用了方法
//        initializeIfNecessary，该方法将测试 initialized 域。因为该域还没有被赋
//        予任何值，所以它具有缺省的布尔值 false。与此类似，sum 具有缺省的 int 值
//        0。因此，initializeIfNecessary 方法执行的正是你所期望的行为，将 4,950
//        添加到了 sum 上，并将 initialized 设置为 true。
//        在静态语句块执行之后，initialized 域的静态初始器将其设置回 false，从而
//        完成 Cache 的类初始化。
//
//        此后，Client 类的 main 方法调用 Cache.getSum 方法，它将再次调用
//        initializeIfNecessary 方法。因为 initialized 标志是 false，所以
//        initializeIfNecessary方法将进入其循环，该循环将把另一个4,950添加到sum
//        上，从而使其值增加到了 9,900。getSum 方法返回的就是这个值，而程序打印的
//        也是它。
