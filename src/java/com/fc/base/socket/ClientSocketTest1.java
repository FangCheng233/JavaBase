package com.fc.base.socket;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

/**
 * @ClassName ClientSocket
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/3 11:06 下午
 * @Version 1.0
 */
public class ClientSocketTest1 {
    public static void main(String[] args) throws Exception {
        send();
    }
    private static void send() throws Exception{
        //客户端
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
        //1、创建客户端Socket，指定服务器地址和端口
//        Socket socket =new Socket("localhost",5555);
        Socket socket =new Socket();
        socket.connect(new InetSocketAddress("localhost", 5555));
        //2、获取输出流，向服务器端发送信息
        OutputStream os = socket.getOutputStream();
        //将输出流包装成打印流
        PrintWriter pw =new PrintWriter(os);
        pw.write(scanner.next());
        pw.flush();
        socket.shutdownOutput();
        //3、获取输入流，并读取服务器端的响应信息
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String info = null;
        while((info = br.readLine()) != null){
            System.out.println("我是客户端，服务器说："+info);
        }
//4、关闭资源
        br.close();
        is.close();
        pw.close();
        os.close();
        socket.close();
        }
    }
}
