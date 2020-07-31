package com.fc.base.socket;

/**
 * @ClassName PlainOioServer
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/24 10:57 上午
 * @Version 1.0
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class PlainOioServer {
    public void serve(int port) throws IOException {
        // 开启Socket服务器，并监听端口
        final ServerSocket socket = new ServerSocket(port);
        try{
            for(;;){
                // 轮训接收监听
                final Socket clientSocket = socket.accept();
                // 创建新线程处理请求
                new Thread(()->{
                    OutputStream out;
                    InputStream in;
                    try{
                        in = clientSocket.getInputStream();
                        InputStreamReader inr = new InputStreamReader(in);
                        BufferedReader bf = new BufferedReader(inr);
                        String info = null;
                        while ((info = bf.readLine()) !=  null){
                            System.out.println("我是服务器，客户端说：" + info);
                        }
                        clientSocket.shutdownInput();
                        out = clientSocket.getOutputStream();
                        System.out.println("请回答：");
                        Scanner scanner = new Scanner(System.in);
                        out.write(scanner.nextLine().getBytes("UTF-8"));
                        out.flush();
                        clientSocket.shutdownOutput();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try{
                            clientSocket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        PlainOioServer server = new PlainOioServer();
        server.serve(5555);
    }
}
