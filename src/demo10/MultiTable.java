package demo10;

/**
 * 变量作用域，命名空间
 * 在大括号内部是不可以重新声明同名变量
 * 大括号内部变量可以使用外部已经声明好的变量
 */
public class MultiTable {
    public static void main(String[] args) {
        int outer = 100;
        {
            int inner = 10;
            System.out.println("outer变量的值是" + outer + "。inner变量的值是" + inner + "。");
        }

        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = a2 + 1;
            }
            {
                int a3 = a2 + 10;
            }
            System.out.println(a2);
        }
    }
}
