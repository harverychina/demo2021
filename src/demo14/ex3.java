package demo14;

import java.util.Scanner;

public class ex3 {
    /**
     * 猜数字的游戏
     */
    public static void main(String[] args) {
//        创建Scanner来读取用户的键盘输入
        Scanner in = new Scanner(System.in);

//        游戏设置
        int rangeStart = 30;
        int rangeEnd = 50;
        int guessTotal = 5;
//      游戏统计
        int totalGameCount = 0;  // 玩游戏次数
        int correctGuessCount = 0;  // 猜对数字的次数

//        是否结束游戏
        boolean gameEnd = false;

        while (!gameEnd) {
            // 生成指定范围内的随机数
            int mod = rangeEnd - rangeStart;
            if (rangeStart < 0 || rangeEnd < 0) {
                System.out.println("开始和结束必须是正数或者0");
            }

            if (mod <= 1) {
                System.out.println("非法的数字范围：(" + rangeStart + "，" + rangeEnd + ")");
            }

            int bigRandom = (int) (Math.random() * rangeEnd * 100);

            int numberToGuess = (bigRandom % mod) + rangeStart;

            if (numberToGuess <= rangeStart) {
                numberToGuess = rangeStart + 1;
            } else if (numberToGuess > rangeEnd) {
                numberToGuess = rangeEnd - 1;
            }

            // 剩余的猜测次数
            int leftToGuess = guessTotal;
//            是否有效猜测
            boolean currentGameCounted = false;
//            当前是否猜测正确
            boolean currentGuess = false;

            System.out.println("请输入猜测的数字，范围在（" + rangeStart + "，" + rangeEnd + "）。输入-1代表结束游戏");
            while (leftToGuess > 0) {
                System.out.println("剩余猜测次数" + leftToGuess + "。请输入本次猜测的数字：");
                int guess = in.nextInt();
                if (guess < 0) {
                    gameEnd = true;
                    System.out.println("游戏结束！");
                    break;
                }
                if (!currentGameCounted) {
                    totalGameCount++;
                    currentGameCounted = true;
                }
                leftToGuess--;
                if (guess > numberToGuess) {
                    System.out.println("输入的数字比目标数字大");
                } else if (guess < numberToGuess) {
                    System.out.println("输入的数字比目标数字小");
                } else {
                    correctGuessCount++;
                    currentGuess = true;
                    System.out.println("输入的数字正确！");
                    break;
                }
            }
            if (!currentGuess) {
                System.out.println("本次的目标数字是：" + numberToGuess);
            }
            System.out.println("共进行了" + totalGameCount + "次游戏，其中猜中的次数是" + correctGuessCount);
        }
    }
}
