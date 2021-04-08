package demo12;
/**
 * 控制读取多字符输入，当按下'q'字符退出程序。
 */

import java.io.*;

public class BRRead {
//    每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。
//    当流结束的时候返回 -1。该方法抛出 IOException。
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'键退出。");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
