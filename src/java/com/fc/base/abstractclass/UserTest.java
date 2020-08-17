package com.fc.base.abstractclass;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/16 12:43 下午
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) throws Exception{
//        // new 关键字创建实例对象
//        User user = new User();
//        // 反射创建实例对象
//        User user1 = User.class.newInstance();
//        user.setAge(20);
//        System.out.println(user.getName());
//        System.out.println(user1.getName());
        Class aClass = Class.forName("com.fc.base.abstractclass.Employee");
        P p = (P)aClass.newInstance();
        System.out.println(p.toString());
    }
}
