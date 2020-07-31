package com.fc.base.abstractclass;

public class Person {
    private static final long UUID = 9189631L;
    /**
      * @Description 用户ID
      * @Author fangcheng
      * @Date 2020/6/23 6:12 下午
      */
    private String id;
    /**
     * @Description 姓名
     * @Author fangcheng
     * @Date 2020/6/23 6:09 下午
     */
    private String name;

    /**
      * @Description 年龄
      * @Author fangcheng
      * @Date 2020/6/23 6:09 下午
      */
    private int age;
    /**
      * @Description 性别
      * @Author fangcheng
      * @Date 2020/6/23 6:10 下午
      */
    private int sex;

    /**
     * Gets the value of id. *
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id. *
     * <p>You can use getId() to get the value of id</p>
     * * @param id id
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * Gets the value of age. *
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
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
     * Gets the value of sex. *
     *
     * @return the value of sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * Sets the sex. *
     * <p>You can use getSex() to get the value of sex</p>
     * * @param sex sex
     */
    public void setSex(int sex) {
        this.sex = sex;
    }
}
