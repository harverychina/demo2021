package demo10;

// 99乘法表
public class ExampleFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= 9; j++) {
                if (j > i) {
//                    去除重复内容不打印
                    break;
                }
                line += i + "*" + j + "=" + i * j + "\t";
            }
            System.out.println(line);
        }
    }
}
