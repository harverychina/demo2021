package demo5;

public class IncreaseDecrease {
    public static void main(String[] args) {
        int a = 1;
//        后加 a = a + 1
        System.out.println("a++=" + a++);
        System.out.println("a=" + a);

        int b = 10;
//        后减 a = a - 1
        System.out.println("b--" + b--);
        System.out.println("b=" + b);
    }
}
