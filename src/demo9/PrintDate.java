package demo9;
// 引用日期类，否则无法使用日期类及方法
import java.util.Date;

public class PrintDate {
    public static void main(String[] args) {

        Date date = new Date();
//      直接输出，系统根据默认字符串类型进行转换
        System.out.println(date);
//  使用 toString() 函数显示日期时间
        System.out.println(date.toString());
    }
}
