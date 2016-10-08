package com.hpe.sylar.puzzlers.h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class puzzle_78{
//    输出？
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Set<String> s = new HashSet<String>();
        s.add("foo");
        Iterator it = s.iterator();
        Method m = it.getClass().getMethod("hasNext");
        System.out.println(m.invoke(it));
    }
}

//        这里的Iterator实例恰好是私有的嵌套类(nested class),也就是内部类
//        java.util.HashMap.KeyIterator。出现 IllegalAccessException 异常的原因
//        就是这个类不是公共的，它来自另外一个包：访问位于其他包中的非公共类型的
//        成员是不合法的