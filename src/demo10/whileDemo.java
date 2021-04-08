package demo10;

// while语句
public class whileDemo {
    public static void main(String[] args) {
        int n = 10;  // 循环次数

        int dividend = 100;  // 被除数
        int divisor = 89;    // 除数
        int found = 0;       // 能被整除的整数个数

        while (found < n) {
            if (dividend % divisor == 0) {
                found++;
                System.out.println(dividend + "可以整除" + divisor + "，商为" + (dividend / divisor));
            }
            dividend++;
        }
    }
}
