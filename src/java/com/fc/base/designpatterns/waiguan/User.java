package com.fc.base.designpatterns.waiguan;

/**
 * @ClassName User
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 10:55 上午
 * @Version 1.0
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
