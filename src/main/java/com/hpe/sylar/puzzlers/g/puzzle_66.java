package com.hpe.sylar.puzzlers.g;

class Base {
    public String className = "Base";
}
class Derived extends Base {
    private String className = "Derived";
}
public class puzzle_66 {
    //输出是什么
    public static void main(String[ ] args) {
        System.out.println(new Derived().className);
    }
}

//        在我们的程序中的编译错误出现在 PrivateMatter 类试图访问
//        Derived.className 的时候。尽管 Base 有一个公共域 className，但是这个域没
//        有被继承到 Derived 类中，因为它被 Derived.className 隐藏了。在 Derived
//        类内部，域名 className 引用的是私有域 Derived.className。因为这个域被声
//        明为是 private 的，所以它对于 PrivateMatter 来说是不可访问的。因此，编译
//        器产生了类似下面这样的一条错误信息：
//        PrivateMatter.java:11: className has private access in Derived
//        System.out.println(new Derived().className);

//请注意，尽管在 Derived 实例中的公共域 Base.className 被隐藏了，但是我们
//        还是可以通过将 Derived 实例转型为 Base 来访问到它。下面版本的
//        PrivateMatter 就可以打印出 Base：
//public class PrivateMatter {
//    public static void main(String[] args) {
//        System.out.println(((Base)new Derived()).className);
//    }
//}

