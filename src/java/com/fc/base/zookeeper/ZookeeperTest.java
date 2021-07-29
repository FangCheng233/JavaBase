package com.fc.base.zookeeper;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName ZookeeperTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/17 11:26 上午
 * @Version 1.0
 */
public class ZookeeperTest {

    public static void main(String[] args) {
        ZooKeeper client;

        try {
            client = new ZooKeeper("192.168.31.43:12181",60000,null);
            List<String> name = client.getChildren("/zookeeper",null);
            System.out.println(name);
            client = null;
            while (true){

            }
        }catch (IOException e){

        }catch (KeeperException e){

        }catch (InterruptedException e){

        }
    }
}
