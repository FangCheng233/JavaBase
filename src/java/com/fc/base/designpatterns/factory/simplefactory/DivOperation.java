package com.fc.base.designpatterns.factory.simplefactory;

/**
 * @ClassName DivOperation
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/13 1:17 下午
 * @Version 1.0
 */
public class DivOperation implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception{
        if(numberB == 0){
            throw new Exception("除数不能为0");
        }
        return numberA / numberB;
    }
}
