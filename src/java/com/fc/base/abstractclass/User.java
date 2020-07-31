package com.fc.base.abstractclass;

/**
 * @ClassName User
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/16 12:42 下午
 * @Version 1.0
 */
public class User {
    private String id;
    private int age;
    private String name;
    public User() {
        this("1", 2, "3");
    }

    public User(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    /**
     * Gets the value of id. *
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the value of age. *
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
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
     * Sets the id. *
     * <p>You can use getId() to get the value of id</p>
     * * @param id id
     */
    public synchronized void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the age. *
     * <p>You can use getAge() to get the value of age</p>
     * * @param age age
     */
    public void setAge(int age) {
        this.age = age;
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
