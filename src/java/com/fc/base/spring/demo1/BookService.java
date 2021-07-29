package com.fc.base.spring.demo1;

import javax.annotation.PostConstruct;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/26 8:11 上午
 * @Version 1.0
 */
public class BookService {
    private OtherService otherService;

    public BookService() {
    }

    /**
     * Gets the value of otherService. *
     *
     * @return the value of otherService
     */
    public OtherService getOtherService() {
        return otherService;
    }

    /**
     * Sets the otherService. *
     * <p>You can use getOtherService() to get the value of otherService</p>
     * * @param otherService otherService
     */
    public void setOtherService(OtherService otherService) {
        this.otherService = otherService;
    }

    public BookService(OtherService otherService) {
        this.otherService = otherService;
    }
}
