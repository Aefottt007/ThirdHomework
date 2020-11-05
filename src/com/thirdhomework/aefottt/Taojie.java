package com.thirdhomework.aefottt;

public class Taojie implements Users{
    @Override
    public void buyGoods(Shops shop, Goods goods) {
        System.out.println("涛姐花了"+goods.getGoodsPrice()+"元买了"+goods.getGoodsName());
        shop.receive(goods);
    }

    @Override
    public void searchProgress(Shops shop, Goods goods) {
        shop.status(goods);
    }

    @Override
    public void getGoods(Goods goods) {
        System.out.println("涛姐成功拿到了他的"+goods.getGoodsName());
    }
}
