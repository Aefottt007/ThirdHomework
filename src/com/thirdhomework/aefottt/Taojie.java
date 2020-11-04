package com.thirdhomework.aefottt;

public class Taojie implements Users{
    private final Shops shop = new JD();
    @Override
    public void buyGoods(Goods goods) {
        System.out.println("涛姐花了"+goods.getGoodsPrice()+"元买了"+goods.getGoodsName());
    }

    @Override
    public void searchProgress(Goods goods) {
        shop.status(goods);
    }

    @Override
    public void getGoods(Goods goods) {
        System.out.println("涛姐成功拿到了他的"+goods.getGoodsName());
    }
}
