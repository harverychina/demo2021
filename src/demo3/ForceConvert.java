package demo3;

public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
        intVal = (int)longVal;  // 强制转换类型

        float floatVal = 11.32f;
        double doubleVal = 3344556.789;
        floatVal = (float)doubleVal;

        int a = 65 + 2;
        char b = (char)a;
        System.out.println(b);
    }
}
