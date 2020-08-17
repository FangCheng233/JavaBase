package com.fc.base.thread.threadlocal;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadLocalDemo
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/2 4:24 下午
 * @Version 1.0
 */
public class ThreadLocalDemo {
    private static ThreadLocal<Student> threadLocal = new ThreadLocal<>();
    private static Student student = new Student("a");

    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            threadLocal.set(student);
            while (true) {
                System.out.println(threadLocal.get());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {}
            }
        }).start();

        TimeUnit.SECONDS.sleep(2);
        student.setName("b"); // 修改共享变量
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
