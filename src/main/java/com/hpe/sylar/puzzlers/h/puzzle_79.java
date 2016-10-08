package com.hpe.sylar.puzzlers.h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class puzzle_79 {
//    输出？
public final String name;
    public final String food;
    public final String sound;
    public puzzle_79(String name, String food, String sound){
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

    public void eat(){
        System.out.println(name + ": Mmmmm, " + food );
    }
    public void play(){
        System.out.println(name + ": " + sound + " " + sound);
    }
    public void sleep(){
        System.out.println(name + ": Zzzzzzz...");
    }
    public void live(){
        new Thread(){
            public void run(){
                while(true){
                    eat();
                    play();
                    sleep();
                }
            }
        }.start();
    }

    public static void main(String[] args){
        new puzzle_79("Fido", "beef", "Woof").live();
    }

}

//        但是如果你尝试运行这个程序，你会发现它甚至不能通过编译。而产生的编译错
//        误信息没有什么用处：
//        Pet.java:28: cannot find symbol
//        symbol: method sleep()
//        sleep();
//        ^
//        为什么编译器找不到那个符号呢？这个符号确实是白纸黑字地写在那里。与谜题
//        74 一样，这个问题的源自重载解析过程的细节。编译器会在包含有正确名称的
//        方法的最内层范围内查找需要调用的方法[JLS 15.12.1]。在我们的程序中，对
//        于对 sleep 方法的调用，这个最内层的范围就是包含有该调用的匿名类
//        (anonymous class)，这个类继承了 Thread.sleep(long)方法和
//        Thread.sleep(long,int)方法，它们是该范围内唯一的名称为 sleep 的方法，但
//        是由于它们都带有参数，所以都不适用于这里的调用。由于该方法调用的 2 个候
//        选方法都不适用，所以编译器就打印出了错误信息。

//          这里发生了 遮蔽（shadow），查看puzzlle 75 术语表

//          修改为 puzzle_79.this.sleep()