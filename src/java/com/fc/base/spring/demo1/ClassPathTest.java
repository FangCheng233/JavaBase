package com.fc.base.spring.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ClassPathTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/26 8:06 上午
 * @Version 1.0
 */
public class ClassPathTest {
    //service依赖dio才能工作
    public static void main(String[] args) {
        //1.加载资源文件applicationContext.xml
        ApplicationContext axt = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.注册的bean类
        BookService bookService = (BookService) axt.getBean("bservice");
        //3.调用bean类的sava方法
    }
}
