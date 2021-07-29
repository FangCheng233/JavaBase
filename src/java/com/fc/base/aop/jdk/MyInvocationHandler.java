package com.fc.base.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyInvocationHandler
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/11 5:32 下午
 * @Version 1.0
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(1);
        method.invoke(object,args);
        System.out.println(method);
        return null;
    }
}
