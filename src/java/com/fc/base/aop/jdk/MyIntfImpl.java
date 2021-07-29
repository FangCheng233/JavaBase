package com.fc.base.aop.jdk;

/**
 * @ClassName MyIntfImpl
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/11 5:36 下午
 * @Version 1.0
 */
public class MyIntfImpl implements MyIntf {

    @Override
    final public void helloWorld(String str) {
        System.out.println("测试数据");
    }
}
