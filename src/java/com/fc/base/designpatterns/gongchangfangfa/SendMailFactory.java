package com.fc.base.designpatterns.gongchangfangfa;

/**
 * @ClassName SendMailFactory
 * @Description 只需扩展工厂类和具体实现类即可实现应用扩展
 * @Author fangcheng
 * @Date 2020/9/10 6:27 下午
 * @Version 1.0
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}
