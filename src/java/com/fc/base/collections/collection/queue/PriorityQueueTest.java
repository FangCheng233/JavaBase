package com.fc.base.collections.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassName PriorityQueueTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/30 11:04 上午
 * @Version 1.0
 */
public class PriorityQueueTest {
    // 自定义的实体类
     static class Viper {
        private int id; // id
        private String name; // 名称
        private int level; // 等级

        public Viper(int id, String name, int level) {
            this.id = id;
            this.name = name;
            this.level = level;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
    public static void main(String[] args) {
        new PriorityQueueTest().queue();
    }
    public void queue(){
//        PriorityQueue queue = new PriorityQueue(10, new Comparator<Viper>() {
//            @Override
//            public int compare(Viper v1, Viper v2) {
//                // 设置优先级规则（倒序，等级越高权限越大）
//                return v2.getLevel() - v1.getLevel();
//            }
//        });
        PriorityQueue queue = new PriorityQueue<Viper>(10,(a,b) -> {
            return b.getLevel() - a.getLevel();
        });
        // 构建实体类
        Viper v1 = new Viper(1, "Java", 1);
        Viper v2 = new Viper(2, "MySQL", 5);
        Viper v3 = new Viper(3, "Redis", 3);
        // 入列
        queue.offer(v1);
        queue.offer(v2);
        queue.offer(v3);
        while (!queue.isEmpty()) {
            // 遍历名称
            Viper item = (Viper) queue.poll();
            System.out.println("Name：" + item.getName() +
                    " Level：" + item.getLevel());
        }
    }
}
