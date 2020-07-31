package com.fc.base.designpatterns.factory.simplefactory;

import java.util.Scanner;

/**
 * @ClassName Calculator
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/13 1:30 下午
 * @Version 1.0
 */
public class Calculator {
    public static void main(String[] args) throws Exception{
        Operation operation = null;
        Scanner scanner = new Scanner(System.in);
        double numberA = 0;
        double numberB = 0;
        String operator = "";
        numberA = scanner.nextDouble();
        operator = scanner.next();
        numberB = scanner.nextDouble();
        operation = new OperationFactory().getInstance(operator);
        double result = operation.getResult(numberA, numberB);
        System.out.println(result);
    }
}
