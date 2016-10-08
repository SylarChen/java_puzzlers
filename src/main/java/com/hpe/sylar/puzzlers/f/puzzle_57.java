package com.hpe.sylar.puzzlers.f;

import java.util.HashSet;
import java.util.Set;

public class puzzle_57 {
    //    输出是什么
    private String first, last;
    public puzzle_57(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public boolean equals(Object o) {
        if (!(o instanceof puzzle_57))
            return false;
        puzzle_57 n = (puzzle_57)o;
        return n.first.equals(first) && n.last.equals(last);
    }
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(new puzzle_57("Mickey", "Mouse"));
        System.out.println(
                s.contains(new puzzle_57("Mickey", "Mouse")));
    }


}

//        因为 Name 类没有覆写 hashCode 方法，所以它从 Object 那里继承了其 hashCode
//        实现。这个实现返回的是基于标识的散列码。换句话说，不同的对象几乎总是产
//        生不相等的散列值，即使它们是相等的也是如此。所以说 Name 没有遵守 hashCode
//        的约定，因此包含 Name 元素的散列集合的行为是不确定的。

//        只要我们把该方法添加到了程序中，那么该程序就可以打印出我们所期望的 true：
//        public int hashCode() {
//            return 37 * first.hashCode() + last.hashCode();
//        }
//        总之，当你覆写 equals 方法时，一定要记着覆写 hashCode 方法