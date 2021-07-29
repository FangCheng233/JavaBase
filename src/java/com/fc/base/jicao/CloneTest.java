package com.fc.base.jicao;

import com.google.gson.Gson;
import lombok.Data;
import org.apache.commons.lang.SerializationUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName CloneTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/18 10:02 上午
 * @Version 1.0
 */
@Data
public class CloneTest implements Cloneable, Serializable {
    private String name;
    private int age;
    private char sex;
    private Integer height;
    private ArrayList<String> hobbies;
    private ArrayList<HashMap<String,String>> gf;
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneTest object = new CloneTest();
        object.setName("li");
        object.setAge(20);
        object.setSex('1');

        ArrayList<String> hobby = new ArrayList<>();
        hobby.add("study");
        hobby.add("eat");
        hobby.add("sleep");
        object.setHobbies(hobby);
        //
        ArrayList<HashMap<String, String>> gf = new ArrayList<>();
        HashMap<String, String> girlFriend1 = new HashMap<>();
        girlFriend1.put("name", "huahua");
        girlFriend1.put("age", "18");
        girlFriend1.put("hight", "175");
        gf.add(girlFriend1);
        HashMap<String, String> girlFriend2 = new HashMap<>();
        girlFriend2.put("name", "xiaomei");
        girlFriend2.put("age", "19");
        girlFriend2.put("hight", "180");
        gf.add(girlFriend2);
        object.setGf(gf);
        CloneTest cloneTest = (CloneTest)object.clone();
        // 修改克隆对象的数据值 string
        cloneTest.setName("wang");
        System.out.println("修改string");
        System.out.println(object);
        System.out.println(cloneTest);
        // 修改克隆对象的数据值 int
        cloneTest.setAge(13);
        System.out.println("修改int");
        System.out.println(object);
        System.out.println(cloneTest);
        // 修改克隆对象的数据值 char
        cloneTest.setSex('0');
        System.out.println("修改char");
        System.out.println(object);
        System.out.println(cloneTest);
        // 修改克隆对象的对象属性
        HashMap<String, String> girlFriend3 = new HashMap<>();
        girlFriend3.put("name", "lijie");
        girlFriend3.put("age", "55");
        girlFriend3.put("hight", "160");
        cloneTest.getGf().add(girlFriend3);
        System.out.println("修改对象引用");
        System.out.println(object);
        System.out.println(cloneTest);
    }
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        CloneTest cloneTest = (CloneTest)super.clone();
//        cloneTest.hobbies = (ArrayList<String>)getHobbies().clone();
//        cloneTest.gf = (ArrayList<HashMap<String,String>>)getGf().clone();
//        return cloneTest;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Gson gson = new Gson();
        CloneTest cloneTest = gson.fromJson(gson.toJson(this),CloneTest.class);
        return cloneTest;
    }
}
