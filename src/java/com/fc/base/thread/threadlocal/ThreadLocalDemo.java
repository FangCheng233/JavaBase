package com.fc.base.thread.threadlocal;

import org.apache.log4j.helpers.ThreadLocalMap;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadLocalDemo
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/2 4:24 下午
 * @Version 1.0
 */
public class ThreadLocalDemo {
    public static ThreadLocal<Student> threadLocal = new ThreadLocal<>();
    private static Student student = new Student("a");
    private static Student student2 = new Student("b");
    private static Student student3 = new Student("c");

    public static void main(String[] args) throws Exception {
        Object object = threadLocal.get();
        System.out.println(object);
        threadLocal.set(student);
        Thread tt = Thread.currentThread();
        System.out.println(tt.getName() + " " + threadLocal.get());
        new Thread(() -> {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " " + threadLocal.get());
            threadLocal.set(student3);
            while (true) {
                System.out.println(t.getName() + " " + threadLocal.get());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {}
            }
        }).start();
        new Thread(() -> {
            Thread t = Thread.currentThread();
            threadLocal.set(student2);
            while (true) {
                System.out.println(t.getName() + " " + threadLocal.get());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {}
            }
        }).start();
        TimeUnit.SECONDS.sleep(2);
    }
    public void get1(){
        Thread t = Thread.currentThread();
        System.out.println();
    }
    private static class Student {
        public String name;
        public Student(String name) {
            this.name = name;
        }

        /**
         * Gets the value of name. *
         *
         * @return the value of name
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the name. *
         * <p>You can use getName() to get the value of name</p>
         * * @param name name
         */
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
