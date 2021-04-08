package demo24;

public class PhoneMaker {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.hasFigurePrintUnlocker = true;
        phone.price = 2999.9;
        phone.screen = new Screen();
        phone.screen.producer = "小米";
        phone.screen.size = 5.7;

        Mainboard mainboard = new Mainboard();

        mainboard.model = "XIAOMI11";
        mainboard.year = 2020;
        mainboard.cpu = new CPU();
        mainboard.cpu.producer = "德州仪器";
        mainboard.memory = new Memory();
        mainboard.memory.producer = "三星";
        mainboard.storage = new Storage();
        mainboard.storage.producer = "Intel";
        mainboard.storage.capacity = 256;

    }
}
