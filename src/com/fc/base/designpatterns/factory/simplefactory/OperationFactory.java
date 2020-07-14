package com.fc.base.designpatterns.factory.simplefactory;

/**
 * @ClassName OperationFactory
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/13 1:18 下午
 * @Version 1.0
 */
public class OperationFactory {
    public Operation getInstance(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
        }

        return operation;
    }
}
