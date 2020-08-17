package com.fc.base.designpatterns.factory.factorymethod;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/16 11:06 上午
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args)
    {
        try
        {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
