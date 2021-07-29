package com.fc.base.collections.collection.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * @ClassName VectorTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/21 11:03 上午
 * @Version 1.0
 */
public class VectorTest1 {
    public static void main(String[] args) throws Exception{
        Vector<byte[]> vector = new Vector<>(2);
        for (int i = 0; i < 100; i++) {
            byte[] bytes = new byte[1024 * 1024*10];

//            Thread.sleep(5000);
            vector.add(null);
            vector.add(null);
        }
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(Arrays.toString(vector.toArray()));
    }
    public static class l{
    }
}
