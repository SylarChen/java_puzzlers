package com.hpe.sylar.puzzlers.g;

import java.util.HashMap;
import java.util.Map;

public class puzzle_63 {
    //输出是什么
    private Map<String,String> m = new HashMap<String,String>();
    public void puzzle_63() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }
    public int size() {
        return m.size();
    }
    public static void main(String args[ ]) {
        puzzle_63 moreNames = new puzzle_63();
        System.out.println(moreNames.size());
    }
}

//        订正该程序很简单，只需将 void 返回类型从 MoreNames 声明中移除即可，这将
//        使它从一个实例方法声明变成一个构造器声明。通过这种修改，该程序就可以打
//        印出我们所期望的 1