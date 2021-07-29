package com.fc.base.designpatterns.gongchangfangfa;

/**
 * @ClassName SendSmsFactory
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/10 6:25 下午
 * @Version 1.0
 */
public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
