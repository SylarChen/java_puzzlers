package com.hpe.sylar.puzzlers.h;

import java.lang.reflect.Constructor;

public class puzzle_80 {
    //    输出？
    public static void main(String[] args) throws Exception{
        new puzzle_80().greetWorld();
    }
    private void greetWorld()throws Exception {
        System.out.println( Inner.class.newInstance() );
//        Constructor c = Inner.class.getConstructor(puzzle_80.class);
//        System.out.println(c.newInstance(puzzle_80.this));
    }

    public class Inner{
        public String toString(){
            return "Hello world";
        }
    }
}

//        为什么会抛出这个异常呢？从 5.0 版本开始，关于 Class.newInstance 的文档叙
//        述道：如果那个 Class 对象“代表了一个抽象类（abstract class），一个接口
//        （interface），一个数组类（array class），一个原始类型（primitive type），
//        或者是空（void）；或者这个类没有任何空的[也就是无参数的]构造器；或者实
//        例化由于某些其他原因而失败，那么它就会抛出异常”

//        当对程序进行了这样的修改后，它就可以正
//        常的打印出 Hello World 了：
//        private void greetWorld() throws Exception{
//            Constructor c = Inner.class.getConstructor(Outer.class);
//         System.out.println(c.newInst
//        }

//请避免使用反射来实例化内部类。