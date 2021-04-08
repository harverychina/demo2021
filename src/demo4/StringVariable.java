package demo4;

public class StringVariable {
    public static void main(String[] args) {
//      变量赋值和拼接内容
        int a = 10;
        String str = "a的值是";
        str = str + a;
        System.out.println(str);
//      拼接运算
        String s2 = "a的值是";
        System.out.println(s2 + a);
        System.out.println(s2);
    }
}
