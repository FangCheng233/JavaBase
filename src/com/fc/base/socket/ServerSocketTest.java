package com.fc.base.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName ServerSocket
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/3 11:06 下午
 * @Version 1.0
 */
public class ServerSocketTest {
    public static void main(String[] args) throws Exception{
     receive() ;
    }
    private static void receive() throws Exception{
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(10086);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        InputStreamReader inr = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(inr);
        String info = null;
        byte[] byteLength = new byte[6];
        in.read(byteLength, 0, 6);

        System.out.println(byteLength.toString());

        while ((info = bf.readLine()) !=  null){
            System.out.println("我是服务器，客户端说：" + info);
            socket.shutdownInput();
        }
//        socket.shutdownInput();

        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write("收到了！");
        pw.flush();
        pw.close();
        os.close();

        bf.close();
        inr.close();
        in.close();
        socket.close();
        serverSocket.close();
    }
}
