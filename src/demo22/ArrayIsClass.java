package demo22;

public class ArrayIsClass {
    public static void main(String[] args) {
        // >> TODO “数组变量”其背后正身就是引用。数组类型就是一种特殊类型。
        // >> TODO 数组的大小不决定数组的类型，数组的类型是只是由元素类型决定。

        int[] intArr = new int[1];
        intArr = new int[1];
        intArr = new int[2];

        // 这个数组的元素就是二维的double数组，即double[][]
        double[][] double3DArray;

        int[] a1 = new int[9];
        int[] a2 = new int[0];
        // 类型相同可以相互赋值
        a2 = a1;
        System.out.println("a2.length=" + a2.length);
        // 不能给对象的属性赋值
        // a2.length = 30;
        double[] a3 = new double[5];
        // a3是double[]类型的引用，不可以用int[]类型的引用赋值。
//        a3 = a1;
    }
}
