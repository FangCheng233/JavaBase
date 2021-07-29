package com.fc.base.jvm.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AllocationTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/2 2:09 下午
 * @Version 1.0
 */
public class AllocationTest {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM 参数： -verbose:gc -Xms1M -Xmx1M -Xmn2M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
     */
    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[1 * 100];
//        allocation2 = new byte[2 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[4 * _1MB];

        List<byte[]> bytes = new ArrayList<>();
        new Thread(()->{
            for(int i=0;i <1000000;i++){
                byte[] allocation = new byte[2*1024];
                bytes.add(allocation);
                System.out.println(123);
            }

        }).start();
        try {
            for(;;){
                Thread.sleep(1000);
                System.out.println(1);
            }
        }catch (InterruptedException E){

        }


    }
}
