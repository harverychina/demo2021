package demo11;

/**
 * 方法重载，在当方法功能相似，只是参数不同，避免出现方法不清晰
 * java提供了方法名相同，参数不同的重载方法方式
 */
public class FuncDemo4 {
    public static void main(String[] args) {
        int a = add(1, 2);
        int b = add(2, 3, 6);
        double c = add(3.3, 5.6);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double x, double y) {
        return x + y;
    }
}
