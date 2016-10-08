package com.hpe.sylar.puzzlers.f;

import java.math.BigInteger;

public class puzzle_56 {
    //    输出是什么
    public static void main(String[ ] args) {
        BigInteger fiveThousand = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total.add(fiveThousand);
        total.add(fiftyThousand);
        total.add(fiveHundredThousand);
        System.out.println(total);
    }

}

//        BigInteger 实例是不可变的。String、
//        BigDecimal 以及包装器类型：Integer、Long、Short、Byte、Character、Boolean、
//        Float 和 Double 也是如此，你不能修改它们的值

//        不可变类型看起来可能很不自然，但
//        是它们具有很多胜过与其向对应的可变类型的优势。不可变类型更容易设计、实
//        现和使用；它们出错的可能性更小，并且更加安全(相当于只读，是线程安全的)