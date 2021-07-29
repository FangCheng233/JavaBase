package com.fc.base.designpatterns.jianzaozhe;

/**
 * @ClassName ConcreteBuilder
 * @Description 具体建造者(工人)
 * @Author fangcheng
 * @Date 2020/9/11 9:13 上午
 * @Version 1.0
 */

public class ConcreteBuilder extends Builder{
    private Product product;
    public ConcreteBuilder() {
        product = new Product();
    }
    @Override
    void bulidA() {
        product.setBuildA("地基");
    }
    @Override
    void bulidB() {
        product.setBuildB("钢筋工程");
    }
    @Override
    void bulidC() {
        product.setBuildC("铺电线");
    }
    @Override
    void bulidD() {
        product.setBuildD("粉刷");
    }
    @Override
    Product getProduct() {
        return product;
    }
}
