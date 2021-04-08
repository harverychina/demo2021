package demo14;

import java.util.Scanner;

/**
 * 键盘输入 Scanner函数
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请问你的名字是？");
        String str = in.nextLine();

        System.out.println("你是哪里人？");
//  next不会吸取字符前/后的空格/Tab键，只吸取字符，开始吸取字符（字符前后不算）直到遇到空格/tab键/回车截止吸取
        String address = in.next();


        System.out.println(str + ",你好！");

        System.out.println("请问你几岁？");

        int age = in.nextInt();

        System.out.println("好的，" + str + age + "岁了。");

    }
}