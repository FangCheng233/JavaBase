package com.fc.base.rpc.rmi;

/**
 * @ClassName MyRemoteImpl
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/23 9:01 上午
 * @Version 1.0
 */

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by lxh on 2019/4/2.
 */
@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(Entity str) throws RemoteException{

        return str.getName() + "Hello world";
    }

    public static void main(String[] args){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'日期：'yyyy-MM-dd '时间：' HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.now();
            System.out.println(formatter.format(dateTime));
            // 结果 日期：2020-11-23 时间： 09:50:10
            MyRemote myRemote = new MyRemoteImpl();
            LocateRegistry.createRegistry(6600);
            Naming.bind("rmi://127.0.0.1:6600/helloworld",myRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


