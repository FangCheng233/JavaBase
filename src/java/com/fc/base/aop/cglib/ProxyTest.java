package com.fc.base.aop.cglib;

import com.fc.base.aop.cglib.CglibProxy;
import com.fc.base.aop.cglib.LiuDeHua;
import com.fc.base.aop.cglib.Star;
import org.springframework.cglib.core.DebuggingClassWriter;

import java.io.IOException;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/11 5:33 下午
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) throws IOException
    {
        int times = 100;

//        Star ldh = new LiuDeHua();
//        StarProxy proxy = new StarProxy();
//        proxy.setTarget(ldh);
//
//        long time1 = System.currentTimeMillis();
//        Star star = (Star)proxy.CreatProxyedObj();
//        long time2 = System.currentTimeMillis();
//        System.out.println("jdk创建时间：" + (time2 - time1));

        CglibProxy proxy2 = new CglibProxy();
//        long time5 = System.currentTimeMillis();
        LiuDeHua star2 = (LiuDeHua)proxy2.createProxyedObj(LiuDeHua.class);
//        long time6 = System.currentTimeMillis();
//        System.out.println("cglib创建时间：" + (time6 - time5));

//        long time3 = System.currentTimeMillis();
//        for (int i = 1; i <= times; i++)
//        {
//            star.sing("ss");
//
//            star.dance("ss");
//        }
//        long time4 = System.currentTimeMillis();


        long time7 = System.currentTimeMillis();
        for (int i = 1; i <= 2; i++) {
            star2.sing("ss");

            star2.dance("ss");
        }

//        long time8 = System.currentTimeMillis();
//        System.out.println("jdk执行时间" + (time4 - time3));
//        System.out.println("cglib执行时间" + (time8 - time7));
    }
}
