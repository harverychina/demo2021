package demo17;

import java.util.Scanner;

public class ScoreMaster {
    public static void main(String[] args) {
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        int totalScoreCount = 6;

        String[] names = new String[totalScoreCount];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入共有多少年的成绩：");

        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][totalScoreCount];

        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < totalScoreCount; j++) {
                scores[i][j] = 80 + Math.random() * 20;
                System.out.println("第" + (i + 1) + "年" + names[j] + "成绩为：" + scores[i][j]);
            }
        }
        boolean cont = true;  // 结束条件
        while (cont) {
            System.out.println("请选择要进行的操作：");
            System.out.println("1、求某年最好成绩\n" + "2、求某年的平均成绩\n" + "3、求所有年份最好成绩\n" + "4、求某门课历年最好成绩");

            int oprtId = scanner.nextInt();
            int year = 0;
            switch (oprtId) {
                case 1:
                    System.out.println("请输入要求哪一年的最好成绩？");
                    year = scanner.nextInt() - 1;
                    if (year < 0 || year >= yearCount) {
                        System.out.println("非法年份");
                        break;
                    }
                    int bestOfYearsScoreId = 0;  // 最好成绩id
                    for (int i = 1; i < scores[year].length; i++) {
                        if (scores[year][bestOfYearsScoreId] < scores[year][i]) {
                            bestOfYearsScoreId = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年最好成绩为" + names[bestOfYearsScoreId] + "：" + scores[year][bestOfYearsScoreId]);
                    break;
                case 2:
                    System.out.println("请输入要求哪一年的平均成绩？");
                    year = scanner.nextInt() - 1;
                    if (year < 0 || year >= yearCount) {
                        System.out.println("非法年份");
                        break;
                    }
                    double totalCountForAvg = 0;  // 总分
                    for (int i = 0; i < scores[year].length; i++) {
                        totalCountForAvg += scores[year][i];
                    }
                    double avgOfYear = totalCountForAvg / totalScoreCount;
                    System.out.println("第" + (year + 1) + "年的平均成绩" + avgOfYear + "。");
                    break;
                case 3:
                    int bestYear = 0;
                    int bestScore = 0;
                    for (int i = 0; i < scores.length; i++) {
                        for (int j = 0; j < scores[i].length; j++) {
                            if (scores[bestYear][bestScore] < scores[i][j]) {
                                bestYear = i;
                                bestScore = j;
                            }
                        }
                    }
                    System.out.println("历年最好成绩为第" + (bestYear + 1) + "年的" + names[bestScore] + "成绩" + scores[bestYear][bestScore]);
                    break;
                case 4:
                    System.out.println("请输入科目编号");
                    int subjectId = scanner.nextInt();
                    if (subjectId < 0 || totalScoreCount < subjectId) {
                        System.out.println("非法的科目编号：" + subjectId);
                        cont = false;
                        break;
                    }
                    subjectId = subjectId - 1;
                    year = 0;
                    for (int i = 1; i < yearCount; i++) {
                        if (scores[year][subjectId] < scores[i][subjectId]) {
                            year = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年度" + names[subjectId] + "成绩最好，为" + scores[year][subjectId] + "。");
                    break;
                default:
                    System.out.println("程序结束。");
                    cont = false;
            }
        }
    }
}
