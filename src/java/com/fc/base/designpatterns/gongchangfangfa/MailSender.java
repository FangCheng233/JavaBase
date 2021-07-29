package com.fc.base.designpatterns.gongchangfangfa;


/**
 * @ClassName MailSender
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/10 6:13 下午
 * @Version 1.0
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailSender!");
    }
}
