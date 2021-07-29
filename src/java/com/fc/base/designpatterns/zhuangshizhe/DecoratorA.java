package com.fc.base.designpatterns.zhuangshizhe;

/**
 * @ClassName Decorator
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:59 上午
 * @Version 1.0
 */
public class DecoratorA extends Decorator {

    public DecoratorA(Sourceable source){
        super(source);
    }
    @Override
    public void method() {
        super.method();
        System.out.println("A");
    }
}
