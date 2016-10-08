package com.hpe.sylar.puzzlers.h;

import java.util.Timer;
import java.util.TimerTask;

public class puzzle_77 extends Thread{
//    下面的这段程序模拟了一个小车间。程序首先启动了一个工人线程，该线程在停
//    止时间到来之前会一直工作（至少是假装在工作），然后程序安排了一个定时器
//    任务（timer task）用来模拟一个恶毒的老板，他会试图阻止停止时间的到来。
//    最后，主线程作为一个善良的老板会告诉工人停止时间到了，并且等待工人停止
//    工作。那么这个程序会打印什么呢？
    private volatile boolean quittingTime = false;
    public void run() {
        while (!quittingTime)
            pretendToWork();
        System.out.println("Beer is good");
    }
    private void pretendToWork() {
        try {
            Thread.sleep(300); // Sleeping on the job?
        } catch (InterruptedException ex) { }
    }
    // It's quitting time, wait for worker - Called by good boss
    synchronized void quit() throws InterruptedException {
        quittingTime = true;
        join();
    }
    // Rescind quitting time - Called by evil boss
    synchronized void keepWorking() {
        quittingTime = false;
    }

    public static void main(String[] args)
            throws InterruptedException {
        final puzzle_77 worker = new puzzle_77();
        worker.start();
        Timer t = new Timer(true); // Daemon thread
        t.schedule(new TimerTask() {
            public void run() { worker.keepWorking(); }
        }, 500);
        Thread.sleep(400);
        worker.quit();
    }
}