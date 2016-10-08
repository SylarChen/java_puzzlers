package com.hpe.sylar.puzzlers.h;

public class puzzle_76{
    //下面的程序全部是由同步化（synchronized）的静态方法组成的。那么它会打印
//    出什么呢？在你每次运行这段程序的时候，它都能保证会打印出相同的内容吗？
    public static synchronized void main(String[] a){
        Thread t = new Thread(){
            public void run(){ pong(); }
        };
        t.run();
        System.out.print( "Ping" );
    }
    static synchronized void pong(){
        System.out.print( "Pong" );
    }
}

//        在一个同步化的静态方法执行之前，它
//        会获取与它的 Class 对象相关联的一个管程（monitor）锁[JLS 8.4.3.6]。所以
//        在上面的程序中，主线程会在创建第二个线程之前获得与 PingPong.class 相关
//        联的那个锁。只要主线程占有着这个锁，第二个线程就不可能执行同步化的静态
//        方法。具体地讲，在 main 方法打印了 Ping 并且执行结束之后，第二个线程才能
//        执行 pong 方法。只有当主线程放弃那个锁的时候，第二个线程才被允许获得这
//        个锁并且打印 Pong 。根据以上的分析，我们似乎可以确信这个程序应该总是打
//        印 PingPong。

//        当你尝试着运行这个程序的时候，你会
//        发现它总是会打印 PongPing。到底发生了什么呢？
//        正如它看起来的那样奇怪，这段程序并不是一个多线程程序。它确实是创建了第二
//        个线程，但是它从未启动这个线程。相反地，主线程会调用那个新的线程实例的
//        run 方法，这个 run 方法会在主线程中同步地运行