package demo3;

public class AutoConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = intVal;
        long longVal2 = intVal + 1;
        System.out.println(longVal2);

        float floatVal = 11.32f;
        double doubleVal = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal2);

        doubleVal = longVal;
        doubleVal = intVal;

        floatVal = intVal;
        floatVal = longVal;

        int a = 99;
        double b = 5;  // 低精度跟高精度运算时，系统会自动转成高精度运算结果
        System.out.println(a / b);

        char ch = 'A';
        int chNum = ch;
        int chNumCalc = ch + 10;
        System.out.println(ch);
        System.out.println(chNum);
    }
}
