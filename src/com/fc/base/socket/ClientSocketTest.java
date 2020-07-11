package com.fc.base.socket;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName ClientSocket
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/3 11:06 下午
 * @Version 1.0
 */
public class ClientSocketTest {
    public static void main(String[] args) throws Exception {
        send();
    }
    private static void send() throws Exception{
        //客户端
//1、创建客户端Socket，指定服务器地址和端口
        Socket socket =new Socket("localhost",10086);
//2、获取输出流，向服务器端发送信息
        OutputStream os = socket.getOutputStream();//字节输出流
        PrintWriter pw =new PrintWriter(os);//将输出流包装成打印流
        pw.write("000006");
        pw.flush();
        socket.shutdownOutput();
        System.out.println(socket.isOutputShutdown());
//3、获取输入流，并读取服务器端的响应信息
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String info = null;
        String ss;
        ss = "";
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
