package demo31.src.com.imooc;

import java.util.Scanner;

public class setTest {
    public list<Course> coursesToSelect;

    private Scanner console;

    public Student student;

    public SetTest(){
        coursesToSelect = new ArrayList<Cousrse>;
        console = new Scanner(System.in);
    }

    public void testAdd(){
        Cousrse cr1 = new Cousrse("1", "数据结构");
        coursesToSelect.add(cr1);
        Cousrse temp = (Cousrse) coursesToSelect.get(0);

    }



}
