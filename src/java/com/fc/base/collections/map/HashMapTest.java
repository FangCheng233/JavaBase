package com.fc.base.collections.map;

/**
 * @ClassName HashMapTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/26 12:14 下午
 * @Version 1.0
 */
import java.util.HashMap;
import java.util.UUID;

public class HashMapTest {

    public static void main(String[] args) throws Exception {
        HashMap<String,String> map = new HashMap<String, String>();
        TestDeadLock t1 = new TestDeadLock(map);
        t1.start();
        TestDeadLock t2 = new TestDeadLock(map);
        t2.start();
        TestDeadLock t3 = new TestDeadLock(map);
        t3.start();
    }
}

class TestDeadLock extends Thread {

    private HashMap<String,String> map;

    public TestDeadLock(HashMap<String, String> map) {
        super();
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 0; i<500000; i++) {
            map.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
            System.out.println("Running ~~");
        }
    }
}
