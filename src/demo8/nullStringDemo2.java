package demo8;

public class nullStringDemo2 {
    public static void main(String[] args) {
        String str = null;
        /**
         * 如果 String 类型为null, 而去进行 equals(String) 或 length() 等操作会抛出
         * str==null 是前置条件，必须写在前面，否则报出"Cannot invoke "String.equals(Object)" because "str" is null"异常
         */
        if(str.equals("") || str == null){
//        if (str == null || str.equals("")) {
            System.out.println("success");
        }
    }
}
