package demo16;

public class MultiDimensionArray {
    public static void main(String[] args) {
        double[][] multiDimensionArr = new double[3][5];

        for (int i = 0; i < multiDimensionArr.length; i++) {
            for (int j = 0; j < multiDimensionArr.length; j++) {
                System.out.println("multiDimensionArr[" + i + "][" + j + "]" + multiDimensionArr[i][j]);
            }
        }
//        重新将第3空间重新指向新的内容（新的数组）
        multiDimensionArr[2] = new double[100];

        for (int i = 0; i < multiDimensionArr.length; i++) {
            System.out.println("multiDimensionArr[" + i + "].length=" + multiDimensionArr[i].length);
        }
    }
}
