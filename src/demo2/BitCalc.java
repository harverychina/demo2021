package demo2;

public class BitCalc {
    public static void main(String[] args) {
//        二进制的 1111 1000
        int a = 0xF8;
//               1111 0100
        int b = 0xF4;
//               1111 1111
        int c = 0xFF;

        System.out.println(a & b);   // 1111 0011  十进制 240
        System.out.println(a | b);  //  1111 1100  十进制 252
        System.out.println(a ^ b);  // 0000 1100   十进制  12

        System.out.println(~c);    // 0000 0000    十进制 -256
    }
}
