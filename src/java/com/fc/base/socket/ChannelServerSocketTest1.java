package com.fc.base.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * @ClassName ChannelServerSocket1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/25 4:41 下午
 * @Version 1.0
 */
public class ChannelServerSocketTest1 {
    public static void main(String[] args) {
        ServerSocketChannel serverSocketChannel;
        try {
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(5555));
            for (;;){
                new Thread(()->new Runnable(){
                    @Override
                    public void run(){

                    }
                });
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
