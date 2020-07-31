package com.fc.base.collections.collection.queue;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @ClassName PriorityQueueTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/21 5:38 下午
 * @Version 1.0
 */
public class PriorityQueueTest1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++){
            priorityQueue.offer(rand.nextInt(i + 10));
        }
    }
}
