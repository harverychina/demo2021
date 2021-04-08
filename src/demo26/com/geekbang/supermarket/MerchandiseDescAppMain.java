package demo26.com.geekbang.supermarket;

public class MerchandiseDescAppMain {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise();

        merchandise.name = "书桌";
        merchandise.soldPrice = 999.9;  // 单价
        merchandise.purchasePrice = 500; // 进货价
        merchandise.count = 40; // 库存量
        merchandise.id = "DESK9597";

        System.out.println("商品名字叫做" + merchandise.name + "，id是" + merchandise.id + "。商品售价是" + merchandise.soldPrice
                + "。商品进价是" + merchandise.purchasePrice + "。商品库存量是" + merchandise.count +
                "。销售一个的毛利润是" + (merchandise.soldPrice - merchandise.purchasePrice));
    }
}
