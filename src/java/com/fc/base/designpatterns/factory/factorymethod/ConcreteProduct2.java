package com.fc.base.designpatterns.factory.factorymethod;

import com.fc.base.abstractclass.P;

/**
 * @ClassName ConcreteProduct2
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/16 11:08 上午
 * @Version 1.0
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show()
    {
        System.out.println("具体产品2显示...");
    }
}
