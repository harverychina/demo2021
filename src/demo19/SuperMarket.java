package demo19;

// >> TODO 使用new操作符，可以创建一个类的实例/对象( instance / object)
// >> TODO 使用new创建一个类的实例后，类中定义的每种变量都会被赋以其类型的初始值
// >> TODO 这个和数组也是一样的
// >> TODO 使用一个同类型的对象变量，可以指定并操作这个实例。这两点和数组很类似
// 创建一个Merchandise的实例，用m1指向它。
public class SuperMarket {
    public static void main(String[] args) {
        Merchandise m1 = new Merchandise();
        m1.name = "红茶茶包 20 包";
        m1.id = "000099518";
        m1.count = 1000;
        m1.price = 99.9;

        Merchandise m2 = new Merchandise();
        m2.name = "雪碧 330ml";
        m2.id = "000099519";
        m2.count = 1000;
        m2.price = 3.0;

        // 卖出一个商品1
        int m1ToSold = 1;

        System.out.println("感谢购买" + m1ToSold + "包" + m1.name + "。商品单价为" + m1.price + "。消费总价为" + m1.price * m1ToSold + "。");
        m1.count -= m1ToSold;
        System.out.println(m1.id + "剩余的库存数量为" + m1.count);

        // 卖出3个商品2
        int m2ToSold = 3;
        System.out.println("感谢购买" + m2ToSold + "瓶" + m2.name + "。商品单价为" + m2.price + "。消费总价为" + m2.price * m2ToSold + "。");
        m2.count -= m2ToSold;
        System.out.println(m1.id + "剩余的库存数量为" + m2.count);
    }
}
