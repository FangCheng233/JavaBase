package com.fc.base.designpatterns.guanchazhe;

/**
 *@ClassName Observer
 *@Description
 *@Author fangcheng
 *@Date 2020/12/6 11:08 上午
 *@Version 1.0
 */
public interface Observer {
    /**
     * TODO
     * @Description 接口中定义的默认处理方法
     * @Author fangcheng
     * @return void
     * @throws
     * @Date 2020/12/6 11:10 上午
     */
    default void response() {
        System.out.println(1);
    }

}
