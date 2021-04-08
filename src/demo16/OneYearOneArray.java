package demo16;

import java.util.Scanner;

public class OneYearOneArray {
    public static void main(String[] args) {
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        double[] year1 = new double[6];

        for (int i = 0; i < 6; i++) {
            year1[i] = 80 + Math.random() * 20;
        }

        double[] year2 = new double[6];

        for (int i = 0; i < 6; i++) {
            year2[i] = 80 + Math.random() * 20;
        }

        double[] year3 = new double[6];

        for (int i = 0; i < 6; i++) {
            year3[i] = 80 + Math.random() * 20;
        }

        double[] yearToUse;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查看第几学年的成绩：");
        int year = scanner.nextInt();

        switch (year) {
            case 1:
                yearToUse = year1;
                break;
            case 2:
                yearToUse = year2;
                break;
            case 3:
                yearToUse = year3;
                break;
            default:
                System.out.println("输入的年份不对，请查看的是最新一年的成绩");
                yearToUse = year3;
                break;
        }

        System.out.println("请输入要查看的成绩编号");

        int scoreIndex = scanner.nextInt();

        System.out.println("第" + year + "年的" + names[scoreIndex] + "的成绩是：" + yearToUse[scoreIndex]);
    }
}
