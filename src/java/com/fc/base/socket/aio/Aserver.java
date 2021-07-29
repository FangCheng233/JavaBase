package com.fc.base.socket.aio;

/**
 * @ClassName Aserver
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/7 3:59 下午
 * @Version 1.0
 */
public class Aserver {
    private final int port;
    public static void main(String[] args) {
        int port = 8080;
        new Aserver(port);
    }

    public Aserver(int port) {
        this.port = port;
    }
}
