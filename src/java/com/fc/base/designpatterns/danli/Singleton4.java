package com.fc.base.designpatterns.danli;

/**
 * @ClassName Singleton
 * @Description TODO  枚举单例模式
 * @Author fangcheng
 * @Date 2020/9/10 6:43 下午
 * @Version 1.0
 */
public enum  Singleton4 {
    INSTANCE();
    private String name;

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
}
