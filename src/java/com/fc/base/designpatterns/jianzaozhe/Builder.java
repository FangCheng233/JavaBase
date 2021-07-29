package com.fc.base.designpatterns.jianzaozhe;

/**
 * @ClassName Builder
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:12 上午
 * @Version 1.0
 */
public abstract class Builder {
    //地基
    abstract void bulidA();
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();
}
