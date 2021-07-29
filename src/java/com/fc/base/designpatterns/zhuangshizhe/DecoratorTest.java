package com.fc.base.designpatterns.zhuangshizhe;

/**
 * @ClassName DecoratorTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:59 上午
 * @Version 1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable objA = new DecoratorA(source);
        Sourceable objB = new DecoratorB(objA);
        Sourceable objC = new DecoratorC(objB);
        Sourceable objD = new DecoratorD(objC);
        objD.method();
    }
}
