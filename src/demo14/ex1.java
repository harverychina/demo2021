package demo14;

public class ex1 {
    public static void main(String[] args) {
        /**
         * 生成随机数
         * 生成大于0.5的随机数，程序停止执行
         */
        double randNum = 0;

        while (randNum < 0.5) {
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("大于0.5的随机数是：" + randNum);

        int rangeStart = 30;
        int rangeEnd = 31;

        int mod = rangeEnd - rangeStart;

        if (rangeStart <= 0 || rangeEnd <= 0) {
            System.out.println("开始和结束必须是整型或者0");
        }

        if (mod <= 1) {
            System.out.println("非法的数字范围:(" + rangeStart + "," + rangeEnd + ")");
        }

        for (int i = 0; i < 50; i++) {

            int bigRandom = (int) (Math.random() * rangeEnd * 100);

            int numberToGuess = (bigRandom % mod) + rangeStart;

            if (numberToGuess <= rangeStart) {
                numberToGuess = rangeStart + 1;
            } else if (numberToGuess > rangeStart) {
                numberToGuess = rangeEnd - 1;
            }
            System.out.println("mod=" + mod + ",numberToGuess=" + numberToGuess);
        }
    }
}
