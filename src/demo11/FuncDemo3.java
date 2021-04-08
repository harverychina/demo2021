package demo11;

/**
 * 九九乘表表
 */
public class FuncDemo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i < j) {
                    break;
                }
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println("\n");
        }
    }
}