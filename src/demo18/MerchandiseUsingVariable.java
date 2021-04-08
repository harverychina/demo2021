package demo18;

public class MerchandiseUsingVariable {
    public static void main(String[] args) {
        String m1Name = "红茶茶包 20包";
        String m1Id = "000099518";
        int m1Count = 1000;
        double m1Price = 99.9;

        String m2Name = "雪碧 330ml";
        String m2Id = "000099519";
        int m2Count = 1000;
        double m2Price = 3.0;

        // 卖出一个商品1
        int m1ToSold = 1;
        System.out.println("感谢购买" + m1ToSold + "包" + m1Name + "。商品单价为" + m1Price + "。消费总价为" + m1Price * m1ToSold + "。");
        m1Count -= m1ToSold;
        System.out.println(m1Id + "剩余的库存数量为" + m1Count);

        // 卖出3个商品2
        int m2ToSold = 3;
        System.out.println("感谢购买" + m2ToSold + "瓶" + m2Name + "。商品单价为" + m2Price + "。消费总价为" + m2Price * m2ToSold + "。");
        m2Count -= m2ToSold;
        System.out.println(m2Id + "剩余的库存数量为" + m2Count);

    }
}
