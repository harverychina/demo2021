package demo6;

import javax.swing.*;

public class ifElseBaozi {
    public static void main(String[] args) {
        int baozi = 5;
//      判断条件
        boolean baoziGangchuLong = true;

        if (baoziGangchuLong) {
//            baozi = baozi + 2;
            baozi += 2;
            System.out.println("包子刚出笼，买了" + baozi + "个肉包子");
        } else {
            System.out.println("买了" + baozi + "个肉包子");
        }
    }
}
