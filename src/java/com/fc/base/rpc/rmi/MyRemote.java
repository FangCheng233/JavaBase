package com.fc.base.rpc.rmi;

/**
 * @ClassName MyRemote
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/23 9:02 上午
 * @Version 1.0
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by lxh on 2019/4/2.
 */
public interface MyRemote extends Remote{

    public String sayHello(Entity str) throws RemoteException;
}


