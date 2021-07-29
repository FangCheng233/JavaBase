package com.fc.base.rpc.rmi;

/**
 * @ClassName MyRemoteClient
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/23 9:01 上午
 * @Version 1.0
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.time.format.DateTimeFormatter;

/**
 * Created by lxh on 2019/4/2.
 */
public class MyRemoteClient {

    public MyRemoteClient(){

    }


    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go(){
        try {
            MyRemote myRemote = (MyRemote)Naming.lookup("rmi://127.0.0.1:6600/helloworld");
            Entity entity = new Entity();
            entity.setName("hi  ");
            String res = myRemote.sayHello(entity);
            System.out.println(res);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}


