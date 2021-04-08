package demo9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {

        Date dNow = new Date();
        // 使用SimpleDateFormat方法进行时间格式转换
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为：" + ft.format(dNow));
//      输出短年份、分钟、一年中的日子
        SimpleDateFormat ft2 = new SimpleDateFormat("yy-mm-DD hh:mm:ss");
        System.out.println("当前时间为：" + ft2.format(dNow));
//      输出本周是一年当中是第几周
        SimpleDateFormat ft3= new SimpleDateFormat("w");
        System.out.println("当前时间为：" + ft3.format(dNow));
//      输出当前是周几
        SimpleDateFormat ft4 = new SimpleDateFormat("E");
        System.out.println("当前是：" + ft4.format(dNow));

    }
}
