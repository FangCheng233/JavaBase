package com.fc.base.socket.netty;

/**
 * @ClassName ClientTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/22 3:24 下午
 * @Version 1.0
 */

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.NettyRuntime;
import io.netty.util.internal.SystemPropertyUtil;

/**
 * 客户端消费者对象
 * This is an netty Client
 * @author ZX
 * @date   2018年6月7日
 */
public class ClientTest {
    public void connect(String host, int port) throws Exception {
        EventLoopGroup worker = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();

            /**
             *EventLoop的组
             */
            bootstrap.group(worker);
            /**
             * 用于构造socketchannel工厂
             */
            bootstrap.channel(NioSocketChannel.class);
            /**设置选项
             * 参数：Socket的标准参数（key，value），可自行百度
             保持呼吸，不要断气！
             * */
            bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
            /**
             * 自定义客户端Handle（客户端在这里搞事情）
             */
            bootstrap.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new SimpleClientHandler());
                }
            });
            /** 开启客户端监听*/
            ChannelFuture channelFuture = bootstrap.connect(host, port);
            //添加监听器
            channelFuture.addListener(new ChannelFutureListener() {
                //使用匿名内部类，ChannelFutureListener接口
                //重写operationComplete方法
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    //判断是否操作成功
                    if (future.isSuccess()) {
                        System.out.println("连接成功");
                    } else {
                        System.out.println("连接失败");
                    }
                }
            });
            /**等待数据直到客户端关闭*/
            channelFuture.channel().closeFuture().sync();
        } finally {
            worker.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {
        ClientTest client = new ClientTest();
        client.connect("127.0.0.1", 9999);

    }
}
