package demo11;

/**
 * 打印出矩形
 */
public class FuncDemo1 {
    public static void main(String[] args) {
        PrintRectangle(3, 5);
        PrintRectangle(5, 2);
        PrintRectangle(3, 8);
    }

    public static void PrintRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
