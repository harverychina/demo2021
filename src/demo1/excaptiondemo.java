package demo1;

public class excaptiondemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            float result = a / b;
        } catch(Exception e) {
            System.out.println("除数不能为零" + e.getMessage());
        }
    }
}
