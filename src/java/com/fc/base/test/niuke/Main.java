package com.fc.base.test.niuke;

/**
 * @ClassName Main
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/3/1 10:51 下午
 * @Version 1.0
 */

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            //
            calculation(sc.nextLine());
        }
    }
    // 3+2*{1+2*[-4/(8-6)+7]}
    public static String calculation(String expr){
        //  根据表达式计算  出栈入栈
        Stack<String> exp = new Stack<>();
        expr = expr == null?"":expr;
        // 第一个花括号
        if(expr.contains("{")){
            //
            int index = expr.indexOf("{") + 1;
            int end = expr.indexOf("}");
            expr = expr.substring(0, index) + calculation(expr.substring(index, end)) + expr.substring(end);
        }
        if(expr.contains("[")){
            int index = expr.indexOf("[") + 1;
            int end = expr.indexOf("]");
            expr = expr.substring(0, index) + calculation(expr.substring(index, end)) + expr.substring(end);
        }
        if(expr.contains("(")){
            int index = expr.indexOf("(") + 1;
            int end = expr.indexOf(")");
            expr = expr.substring(0, index) + calculation(expr.substring(index, end)) + expr.substring(end);
        }
        // 去括号之后 开始四则运算

        return operation(expr);
    }
    public static String operation(String expr){
        BigDecimal bigDecimal = new BigDecimal(0);
        if(expr.contains("*")){

        }

        return "";
    }
}
