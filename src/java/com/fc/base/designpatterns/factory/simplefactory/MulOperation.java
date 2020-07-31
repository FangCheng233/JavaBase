package com.fc.base.designpatterns.factory.simplefactory;

/**
 * @ClassName MulOperation
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/13 1:16 下午
 * @Version 1.0
 */
public class MulOperation implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
