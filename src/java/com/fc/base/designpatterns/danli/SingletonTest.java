package com.fc.base.designpatterns.danli;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName SingletonTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/18 1:59 下午
 * @Version 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
        try {

            for(int a = 0;a<100;a++){
                TimeUnit.SECONDS.sleep(10);
            }
        }catch (Exception e){

        }
    }
}
