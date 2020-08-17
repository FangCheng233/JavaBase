package com.fc.base.collections.map;

import java.util.Hashtable;

/**
 * @ClassName HashTableTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/3 2:00 下午
 * @Version 1.0
 */
public class HashTableTest1 {
    public static void main(String[] args) {
        HashTableTest1 hashTableTest1 = new HashTableTest1();
        hashTableTest1.main();
    }
    public void main(){
        Hashtable<String, String> objectObjectHashtable = new Hashtable<>();
        objectObjectHashtable.put("test", "asdada");
        objectObjectHashtable.put(null, "asdasd");
        System.out.println(objectObjectHashtable.toString());
    }
}
