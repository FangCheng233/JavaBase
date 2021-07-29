package com.fc.base.jdbc.hibernate;

import com.fc.base.jdbc.hibernate.en.Department;
import com.fc.base.jdbc.hibernate.en.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



/**
 * @ClassName ManyToOneTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/16 10:06 下午
 * @Version 1.0
 */
public class ManyToOneTest {
    private SessionFactory factory;


    public void init() {
        //调用前面的工具类来创建并打开session工厂
        factory = SessionFactoryUtils.getInstance().openSessionFactory();
    }


    public void add() {
        // 所有的公用的都是一个session，它的内容也不会清空。事务是提交之后就关闭了。
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();

        Department department = new Department();
        department.setDepartname("售后部");

        Employee e1 = new Employee();
        e1.setEname("呵呵");
        e1.setEsex("男");
        e1.setDepartment(department);

        Employee e2 = new Employee();
        e2.setEname("嘻嘻");
        e2.setEsex("女");
        e2.setDepartment(department);

        try {
            // 单向：也就是说也可通过save员工之前把部门save到数据库，但是不能通过save部门达到save员工的作用
            session.save(e1);           //因为设置了级联cascade为all，所以在保存Employee的时候会同时保存Department
            session.save(e2);
            ts.commit();           //增、删、改都徐亚用到事务，通过事务来commit，查询则不需要用到事务
        } catch (Exception e) {
            ts.rollback();
        }
    }
}
