package demo21;

import demo19.Merchandise;

public class ClassInstanceAndRef {
    public static void main(String[] args) {
        Merchandise m = new Merchandise();
        Merchandise1 m1 = new Merchandise1();

        // Merchandise merchandise = m;
        // 即使Merchandise的内容一模一样，那么是不同的类，不同类的引用不可以相互赋值。
        // 因为它们本质上不同的对象。
        // Merchandise merchandise = m1;
    }
}
