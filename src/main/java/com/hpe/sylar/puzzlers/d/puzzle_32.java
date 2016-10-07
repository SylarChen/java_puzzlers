package com.hpe.sylar.puzzlers.d;

public class puzzle_32 {
    public static void main(String[] args) {
//        请提供一个对 i 的声明，将下面的循环转变为一个无限循环：
        while (i <= j && j <= i && i != j) {
        }

//        答案：
//        Integer i = new Integer(0);
//        Integer j = new Integer(0);
//        前两个子表达式（i <= j 和 j <= i）在 i 和 j 上执行解包转换，
//        并且在数字上比较所产生的 int 数值。i 和 j 都表示 0，所以这两个子表达式都
//        被计算为 true。第三个子表达式（i != j）在对象引用 i 和 j 上执行标识比较，
//        因为它们都初始化为一个新的 Integer 实例，因此，第三个子表达式同样也被计
//        算为 true，循环也就永远地环绕下去了。
//        你可能会感到奇怪，为什么语言规范没有修改为：当判等操作符作用于被包装的
//        数字类型时，它们执行的是值比较。答案很简单：兼容性。当一种语言被广泛使
//        用之后，以违反现有规范的方式去改变现有程序的行为是让人无法接受的。下面
//        的程序过去总是保证可以打印 false，因此它必须继续保持此特征：
//        public class ReferenceComparison {
//            public static void main(String[] args) {
//                System.out.println(
//                        new Integer(0) == new Integer(0));
//            }
//        }

    }
}
