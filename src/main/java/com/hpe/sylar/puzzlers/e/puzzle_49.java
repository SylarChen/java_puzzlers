package com.hpe.sylar.puzzlers.e;

import java.util.Calendar;

public class puzzle_49 {
    //输出？
    public static final puzzle_49 INSTANCE = new puzzle_49();
    private final int beltSize;
    private static final int CURRENT_YEAR =
            Calendar.getInstance().get(Calendar.YEAR);
    private puzzle_49() {
        beltSize = CURRENT_YEAR - 1930;
    }
    public int beltSize() {
        return beltSize;
    }
    public static void main(String[] args) {
        System.out.println("Elvis wears a size " +
                INSTANCE.beltSize() + " belt.");
    }
}

//        让我们来看看其细节。puzzle_49 类的初始化是由虚拟机对其 main 方法的调用而触发的。
//        首先，其静态域被设置为缺省值[JLS 4.12.5]，其中 INSTANCE 域被设置为 null，
//        CURRENT_YEAR 被设置为 0。接下来，静态域初始器按照其出现的顺序执行。第一
//        个静态域是 INSTANCE，它的值是通过调用 puzzle_49()构造器而计算出来的。
//        这个构造器会用一个涉及静态域 CURRENT_YEAR 的表达式来初始化 beltSize。通
//        常，读取一个静态域是会引起一个类被初始化的事件之一，但是我们已经在初始
//        化 puzzle_49 类了。递归的初始化尝试会直接被忽略掉[JLS 12.4.2, 第 3 步]。因此，
//        CURRENT_YEAR 的值仍旧是其缺省值 0。这就是为什么 Elvis 的腰带尺寸变成了
//        -1930 的原因。

    //调换语句位置即可修复：
//    private static final int CURRENT_YEAR =
//            Calendar.getInstance().get(Calendar.YEAR);
//    public static final puzzle_49 INSTANCE = new puzzle_49();