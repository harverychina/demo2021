package demo10;
// 不是死循环，能自己结束运行。
public class whileDemo2 {
    public static void main(String[] args) {
        int n = 5;

        int dividend = 100;
        int divisor = 2000000000;

        int found = 0;
        while (found < n) {
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + "。商是" + dividend / divisor);
                found++;
            }
            dividend++;
        }
    }
}
