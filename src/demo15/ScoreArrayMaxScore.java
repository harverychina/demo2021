package demo15;

public class ScoreArrayMaxScore {
    public static void main(String[] args) {
//        每门课程对应索引
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;

        int totalScoreCount = 6;
        // 6门课的成绩数组
        double[] scores = new double[6];
//      科目名称数组
        String[] scoreNames = new String[totalScoreCount];
        scoreNames[YuWen] = "语文";
        scoreNames[ShuXue] = "数学";
        scoreNames[WaiYu] = "外语";
        scoreNames[WuLi] = "物理";
        scoreNames[HuaXue] = "化学";
        scoreNames[ShengWu] = "生物";
//      随机生成科目成绩
        for (int i = 0; i < totalScoreCount; i++) {
            scores[i] = 80 + Math.random() * 20;
            System.out.println(scoreNames[i] + "的成绩是：" + scores[i]);
        }
//        最高成绩分数
        double maxScore = 0;
//        最高成绩索引
        int maxScoreIndex = -1;

        for(int i = 0; i< totalScoreCount; i++){
            if(scores[i] > maxScore){
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }
        System.out.println("最好成绩科目是"+scoreNames[maxScoreIndex]+"："+maxScore);
    }
}
