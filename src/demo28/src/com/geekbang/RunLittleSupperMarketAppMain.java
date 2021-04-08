package demo28.src.com.geekbang;

import demo28.src.com.geekbang.supermarket.LittleSuperMarket;
import demo28.src.com.geekbang.supermarket.MerchandiseV2;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        // 创建一个小超市
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.superMarketName = "有家小超市";
        littleSuperMarket.address = "浦东新世纪大道666号";
        littleSuperMarket.parkingCount = 100;
        // 200种商品
        littleSuperMarket.merchandises = new MerchandiseV2[200];
        // 统计用的数组
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];
        // 为了使用方便，创建一个商品数组引用，和littleSupperMarket.merchandises指向同一个数组对象
        MerchandiseV2[] all = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            MerchandiseV2 m = new MerchandiseV2();
            m.name = "商品" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是一个数组对象
            all[i] = m;
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("今日超市大特惠，所有商品第二件半价！选择商品购买的商品索引：");
            int index = scanner.nextInt();
            if (index < 0) {
                System.out.println("欢迎再次光临！");
                break;
            }
            double price = littleSuperMarket.merchandises[index].purchasePrice;
            System.out.println("商品单价为" + price);

            System.out.println("请输入要购买的数量：");
            int count = scanner.nextInt();

            if (littleSuperMarket.merchandises[index].count < count) {
                System.out.println("商品库存不足。");
            }

            int fullPriceCount = count / 2 + count % 2;
            int halPriceCount = count - fullPriceCount;
            double totalCost = price * fullPriceCount + halPriceCount * price / 2;
            littleSuperMarket.merchandises[index].count -= count;
            System.out.println("商品总价为：" + totalCost);
        }
    }
}
