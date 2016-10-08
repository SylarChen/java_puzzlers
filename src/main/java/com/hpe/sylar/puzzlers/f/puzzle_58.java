package com.hpe.sylar.puzzlers.f;

import java.util.HashSet;
import java.util.Set;

public class puzzle_58 {
    //    输出是什么
    private String first, last;
    public puzzle_58(String first, String last) {
        this.first = first; this.last = last;
    }
    public boolean equals(puzzle_58 n) {
        return n.first.equals(first) && n.last.equals(last);
    }
    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }
    public static void main(String[ ] args) {
        Set s = new HashSet();
        s.add(new puzzle_58("Donald", "Duck"));
        System.out.println(
                s.contains(new puzzle_58("Donald", "Duck")));
    }
}

//应该重写 public boolean equals(Object n)