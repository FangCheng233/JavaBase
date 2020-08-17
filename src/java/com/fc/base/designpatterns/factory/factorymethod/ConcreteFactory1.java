package com.fc.base.designpatterns.factory.factorymethod;

/**
 * @ClassName ConcreteFactory1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/16 11:10 上午
 * @Version 1.0
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct()
    {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
