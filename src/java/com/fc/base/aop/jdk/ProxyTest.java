package com.fc.base.aop.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/11 5:33 下午
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) throws IOException {
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        MyIntf proxyObj = (MyIntf) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),new MyIntfImpl().getClass().getInterfaces(),new MyInvocationHandler(new MyIntfImpl()));
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{MyIntf.class});
        FileOutputStream os = new FileOutputStream("/Users/fangcheng/project/java/JavaBase/src/java/com/fc/base/aop/cglib/$Proxy0.class");
        os.write(bytes);
        os.close();
        proxyObj.helloWorld("");
    }
}
