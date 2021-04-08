package demo15;

public class WhatArray {
    public static void main(String[] args) {
//        int[] book = new int[999];

//        System.out.println(book[0]);
//        System.out.println(book[1]);

//        System.out.println("数据长度是：" + book.length);
//      输出数据超出数组边界 java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(book[book.length]);

        int[] book = new int[3];
        book[0] = 9;
        System.out.println("book长度为" + book.length + "。book[0]=" + book[0]);
 //     重新定义空间
        book = new int[32];
        System.out.println("book长度为" + book.length + "。book[0]=" + book[0]);
    }
}
