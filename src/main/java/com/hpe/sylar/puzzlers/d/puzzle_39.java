package com.hpe.sylar.puzzlers.d;

public class puzzle_39 {
        public static void main(String[] args) {
            //输出是什么？
            try {
                System.out.println("Hello world");
                System.exit(0);
            } finally {
                System.out.println("Goodbye world");
            }

//            当 System.exit 被调用时，虚拟机在关闭前要执行两项清理工作。首先，它执行
//            所有的关闭挂钩操作，这些挂钩已经注册到了 Runtime.addShutdownHook 上。这
//            对于释放 VM 之外的资源将很有帮助。务必要为那些必须在 VM 退出之前发生的行
//            为关闭挂钩。下面的程序版本示范了这种技术，它可以如我们所期望地打印出
//            Hello world 和 Goodbye world：

//            System.out.println("Hello world");
//            Runtime.getRuntime().addShutdownHook(
//                    new Thread() {
//                        public void run() {
//                            System.out.println("Goodbye world");
//                        }
//                    });
//            System.exit(0);
        }
}
