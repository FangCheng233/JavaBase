package com.fc.base.rpc.rmi;

import java.io.Serializable;

/**
 * @ClassName Entity
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/23 9:25 上午
 * @Version 1.0
 */
public class Entity implements Serializable  {
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

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                '}';
    }
}
