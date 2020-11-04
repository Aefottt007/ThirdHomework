package com.thirdhomework.aefottt;

public class JD implements Shops{
    @Override
    public void receive(Goods goods) {
        System.out.println("JD已成功接到【"+goods.getGoodsName()+"】的订单");
        goods.setStatus(2);
        this.deliver(goods);
    }

    @Override
    public void deliver(Goods goods) {
        System.out.println("正在配送商品【"+goods.getGoodsName()+"】");
    }

    @Override
    public void status(Goods goods) {
        switch (goods.getStatus()){
            case 0 -> System.out.println("暂无该商品的订单");
            case 1 -> System.out.println("商品已成功送达");
            case 2 -> System.out.println("快递小哥还在配送该商品，请不要急哦");
            default -> System.out.println("错误指令");
        }
    }

    @Override
    public void inform(Users user,Goods goods) {
        goods.setStatus(1);
        user.getGoods(goods);
    }
}
