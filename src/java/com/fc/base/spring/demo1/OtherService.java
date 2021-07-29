package com.fc.base.spring.demo1;

import javax.annotation.PostConstruct;

/**
 * @ClassName OtherService
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/26 9:04 下午
 * @Version 1.0
 */
public class OtherService {
    // 提供一个私有变量
    private BookService bookService;

    public OtherService() {
    }

    public OtherService(BookService bookService) {
        System.out.println("bookservice构造函数");
    }

    /**
     * Gets the value of bookService. *
     *
     * @return the value of bookService
     */
    public BookService getBookService() {
        return bookService;
    }

    /**
     * Sets the bookService. *
     * <p>You can use getBookService() to get the value of bookService</p>
     * * @param bookService bookService
     */
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
