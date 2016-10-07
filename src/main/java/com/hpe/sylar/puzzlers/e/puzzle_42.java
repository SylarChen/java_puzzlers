package com.hpe.sylar.puzzlers.e;

public class puzzle_42 {
    public static void main(String[] args) {
        int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 },
                { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
        int successCount = 0;
        try {
            int i = 0;
            while (true) {
                if (thirdElementIsThree(tests[i++]))
                    successCount ++;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            // No more tests to process
        }
        System.out.println(successCount);
    }
    private static boolean thirdElementIsThree(int[] a) {
        return a.length >= 3 & a[2] == 3;
    }


//    第一个错误是该程序使用了一种可怕的循环惯
//    用法，该惯用法依赖的是对数组的访问会抛出异常。这种惯用法不仅难以阅读，
//    而且运行速度还非常地慢。不要使用异常来进行循环控制；

//    第二个错误， a.length >= 3 & a[2] == 3 总会去执行 a[2] == 3
//    应使用&&
}

