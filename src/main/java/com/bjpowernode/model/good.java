package com.bjpowernode.model;

public class good {

    private String goodsName;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "good{" +
                "goodsName='" + goodsName + '\'' +
                '}';
    }
}
