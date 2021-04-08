package demo7;
// for 循环 break continue 语法
public class CalcDivFor {
    public static void main(String[] args) {
        int divided = 5;
        int divisor = 30;

        int found = 0;
        int toBefound = 10;

//        for (int i = 0; i < 100 && found < 10; i++) {
        for (int i = 0; i < 100; i++) {
            if(divided < divisor){
                System.out.println(divided+"小于"+divisor+",当前循环跳转");
                divided++;
                continue;
            }
            if (divided % divisor == 0) {
                System.out.println(divided + "能被" + divisor + "整除" + "，商是：" + (divided / divisor));
//                统计能整除3的数字个数
                found++;
            }

            if (found >= toBefound) {
                System.out.println("已经找到" + toBefound + "个数，循环退出");
                break;
            }
            divided++;
        }
    }
}
