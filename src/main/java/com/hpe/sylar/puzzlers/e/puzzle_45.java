package com.hpe.sylar.puzzlers.e;

public class puzzle_45 {
    //输出？
    public static void main(String[] args) {
        workHard();
        System.out.println("It's nap time.");
    }
    private static void workHard() {
        try {
            workHard();
        } finally {
            workHard();
        }
    }

//    Java 虚拟机对栈的深度限制到了某个预设的水平。当超过这个水平时，VM 就抛
//    出 StackOverflowError。为了让我们能够更方便地考虑程序的行为，我们假设
//    栈的深度为 3，这比它实际的深度要小得多。现在让我们来跟踪其执行过程。
//    main 方法调用 workHard，而它又从其 try 语句块中递归地调用了自己，然后它
//    再一次从其 try 语句块中调用了自己。在此时，栈的深度是 3。当 workHard 方
//    法试图从其 try 语句块中再次调用自己时，该调用立即就会以
//    StackOverflowError 而失败。这个错误是在最内部的 finally 语句块中被捕获
//    的，在此处栈的深度已经达到了 3。在那里，workHard 方法试图递归地调用它自
//    己，但是该调用却以 StackOverflowError 而失败。这个错误将在上一级的
//finally 语句块中被捕获，在此处站的深度是 2。该 finally 中的调用将与相对
//    应的 try 语句块具有相同的行为：最终都会产生一个 StackOverflowError。
}

