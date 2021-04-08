package demo8;

// 判断空值引例
public class nullStringDemo {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = null;
        String str3 = "";

        System.out.println(str1 == str2);  // 内存地址比较
        System.out.println(str1.equals(str2));  // 值的比较
        System.out.println(str2 == str3);       // 内存地址的比较
        System.out.println(str3.equals(str2));   // 值的比较
        System.out.println(str1 == str3);        // 内存地址的比较
        System.out.println(str1.equals(str3));   // 值的比较

        /**
         * 字符串对象与null的值不相等，且内存地址也不相等；
         * 空字符串对象与null的值不相等，且内存地址也不相等；
         * new String()创建一个字符串对象的默认值为"" (String类型成员变量的初始值为null)
         */

    }
}
