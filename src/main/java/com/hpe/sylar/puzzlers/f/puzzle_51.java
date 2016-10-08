package com.hpe.sylar.puzzlers.f;

public class puzzle_51 {
//    输出是什么
        public static void main(String[] args) {
            System.out.println(new ColorPoint(4, 2, "purple"));
        }
}

class Point {
    protected final int x, y;
    private final String name; // Cached at construction time
    Point(int x, int y) {
        this.x = x;
        this.y = y;
        name = makeName();
    }

    protected String makeName() {
        return "[" + x + "," + y + "]";
    }
    public final String toString() {
        return name;
    }
}
class ColorPoint extends Point {
    private final String color;
    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    protected String makeName() {
        return super.makeName() + ":" + color;
    }
}

//        这个程序遭遇了实例初始化顺序这一问题。要理解该程序，我们就需要详细跟踪
//        该程序的执行过程。下面是该程序注释过的版本的列表，用来引导我们了解其执
//        行顺序：
//class Point {
//    protected final int x, y;
//    private final String name; // Cached at construction time
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//        name = makeName(); // 3. Invoke subclass method
//    }
//
//    protected String makeName() {
//        return "[" + x + "," + y + "]";
//    }
//    public final String toString() {
//        return name;
//    }
//}
//public class ColorPoint extends Point {
//    private final String color;
//    ColorPoint(int x, int y, String color) {
//        super(x, y); // 2. Chain to Point constructor
//        this.color = color; // 5. Initialize blank final-Too late
//    }
//    protected String makeName() {
//        // 4. Executes before subclass constructor body!
//        return super.makeName() + ":" + color;
//    }
//    public static void main(String[] args) {
//        // 1. Invoke subclass constructor
//        System.out.println(new ColorPoint(4, 2, "purple"));
//    }
//}