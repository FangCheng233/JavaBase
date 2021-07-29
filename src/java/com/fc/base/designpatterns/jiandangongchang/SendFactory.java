package com.fc.base.designpatterns.jiandangongchang;

/**
 * @ClassName SendFactory
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/10 6:14 下午
 * @Version 1.0
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
    public static Sender produceMail_static(){
        return new MailSender();
    }
    public static Sender produceSms_static(){
        return new SmsSender();
    }
}
