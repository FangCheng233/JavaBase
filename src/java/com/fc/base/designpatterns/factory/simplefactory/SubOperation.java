package com.fc.base.designpatterns.factory.simplefactory;

/**
 * @ClassName SubOperation
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/13 1:15 下午
 * @Version 1.0
 */
public class SubOperation implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
