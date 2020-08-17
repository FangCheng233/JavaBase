package com.fc.base.designpatterns;

/**
 * @ClassName Resume
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/3 10:01 上午
 * @Version 1.0
 */
public class Resume {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

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
     * Gets the value of sex. *
     *
     * @return the value of sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the sex. *
     * <p>You can use getSex() to get the value of sex</p>
     * * @param sex sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Gets the value of age. *
     *
     * @return the value of age
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the age. *
     * <p>You can use getAge() to get the value of age</p>
     * * @param age age
     */
    public void setAge(String age) {
        this.age = age;
    }
}
