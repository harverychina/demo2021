package demo30;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest et = new EncapTest();
        et.setName("James");
        et.setAge(20);
        et.setIdNum("12343ms");
        System.out.println("Name : " + et.getName() + " Age :" + et.getAge());
    }
}
