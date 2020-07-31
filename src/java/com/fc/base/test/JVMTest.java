package com.fc.base.test;

import sun.jvm.hotspot.memory.HeapBlock;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JVMTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/8 8:00 上午
 * @Version 1.0
 */
public class JVMTest {
    private static int[] array = new int[1024*20];
    public static void main(String[] args) throws InterruptedException {

        run();
    }
    private static void run(){
        List<String> list = new ArrayList<>();
        int i = 0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }

}
