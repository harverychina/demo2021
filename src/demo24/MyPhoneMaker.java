package demo24;

public class MyPhoneMaker {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.hasFigurePrintUnlocker = true;
        phone.price = 1999;
        phone.screen = new Screen();

        phone.screen.producer = "京东方";
        phone.screen.size = 8.8;

        CPU cpu = new CPU();
        cpu.producer = "三星";
        cpu.speed = 3.5;

        Memory memory = new Memory();
        memory.producer = "三星";
        memory.capacity = 4;

        Storage storage = new Storage();
        storage.producer = "Intel";
        storage.capacity = 128;

        phone.mainboard = new Mainboard();

        phone.mainboard.cpu = cpu;
        phone.mainboard.memory = memory;
        phone.mainboard.storage = storage;

        phone.mainboard.model = "EA888";
        phone.mainboard.year = 2020;
//      类型也可以包含自己
        phone.prePhone = new Phone();
//      想想我们创建了几个对象，有创建了几个引用？

    }
}