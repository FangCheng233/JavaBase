package com.fc.base.jvm.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CloneTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/6 9:25 下午
 * @Version 1.0
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Prototype prototype = new Prototype();
        prototype.setAge(2);
        prototype.setName("prototype");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("chi");
        hobbies.add("he");
        hobbies.add("wan");
        prototype.setHobbies(hobbies);
        //System.out.println(prototype);

        Prototype prototype1 = prototype.clone();
//        List<String> hobbies1 = new ArrayList<>();
//        prototype1.setHobbies(hobbies1);
        prototype1.getHobbies().add("piao");
        prototype1.setAge(21);
        System.out.println(prototype);
        System.out.println(prototype1);
    }
}
class Prototype implements Cloneable{
    private Integer age = new Integer(0);
    private String name = new String();
    private List<String> hobbies;

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
        this.name.intern();
    }

    /**
     * Gets the value of hobbies. *
     *
     * @return the value of hobbies
     */
    public List<String> getHobbies() {
        return hobbies;
    }

    /**
     * Sets the hobbies. *
     * <p>You can use getHobbies() to get the value of hobbies</p>
     * * @param hobbies hobbies
     */
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}