package demo11;

/**
 * 求矩形面积
 */
public class FuncDemo2 {
    public static void main(String[] args) {
        int area = getArea(3, 6);
        System.out.println("矩形面积：" + area);
    }

    public static int getArea(int x, int y) {
        int temp = x * y;
        return temp;
    }
}
