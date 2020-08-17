package com.fc.base.designpatterns.factory.factorymethod;

/**
 * @ClassName ConcreteProduct1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/16 11:08 上午
 * @Version 1.0
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show()
    {
        System.out.println("具体产品1显示...");
    }
}
