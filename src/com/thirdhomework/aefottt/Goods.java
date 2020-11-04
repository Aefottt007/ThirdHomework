package com.thirdhomework.aefottt;

public class Goods {
    private String goodsName;
    private int goodsPrice;
    /**
     * 0表示查无此商品订单
     * 1表示商品已成功到达
     * 2表示商品还在路上
     */
    private int status;
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Goods(String goodsName, int goodsPrice){
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.status = 0;
    }
}
