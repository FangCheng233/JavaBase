package com.fc.base.designpatterns.factory.factorymethod;

/**
 * @ClassName ConcreteFactory2
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/16 11:11 上午
 * @Version 1.0
 */
//具体工厂2：实现了厂品的生成方法
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct()
    {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
