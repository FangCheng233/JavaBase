package com.fc.base.designpatterns.gongchangfangfa;

import com.fc.base.designpatterns.gongchangfangfa.Sender;

/**
 * @ClassName SmsSender
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/10 6:14 下午
 * @Version 1.0
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
