package demo2;

public class BitOprtUsage {
    public static void main(String[] args) {
        int base = 1;
//        0001
        int is_student_mask = base;
//        0010
        int is_programmer_mask = base << 1;
//        0100
        int is_driver_mask = base << 2;
//        1000
        int is_painter_mask = base << 3;

        int data = 5;  // 0101

//        0101 & 0001 = 0001  True
        boolean isStudent = (data & is_student_mask) != 0;
        System.out.println(isStudent);
//        0101 & 0010 = 0000  False
        boolean isProgrammer = (data & is_programmer_mask) != 0;
        System.out.println(isProgrammer);
//        0101 & 0100 = 0100  True
        boolean isDriver = (data & is_driver_mask) != 0;
        System.out.println(isDriver);
//        0101 & 1000 = 0000  False
        boolean isPainter = (data & is_painter_mask) != 0;
        System.out.println(isPainter);
    }
}
