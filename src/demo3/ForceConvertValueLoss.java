package demo3;

public class ForceConvertValueLoss {
    public static void main(String[] args) {
//        强制转换结果不是预计想要的结果
        int intVal = 99;
        long longVal = 5555555555555555L;
        intVal = (int)longVal;
        System.out.println(intVal);

//        精度丢失
        float floatVal = 11.32f;
        double doubleVal = 1234567890.123456;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);
        System.out.println(doubleVal);
    }
}
