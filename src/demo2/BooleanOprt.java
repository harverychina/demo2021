package demo2;

public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println( a && b);  // and
        System.out.println( a & b);  // and
        System.out.println( a || b);  // or
        System.out.println( a | b);  // or
//      当是双或运算符时，当左边是真时，右边是不用理会真或假
        System.out.println(a || (10 / 0 > 1));
//      当是单个或运算符时，需要将右的表达式进行运算一次的
        System.out.println(a | (10 / 0 > 1));
    }
}