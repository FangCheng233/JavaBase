package com.fc.base.jdbc.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @ClassName SessionFactoryUtils
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/16 10:03 下午
 * @Version 1.0
 */
public class SessionFactoryUtils {
    private SessionFactory factory;
    private static SessionFactoryUtils factoryUtils;

    // 单例模式：把构造方法设置为私有的，说明不可以new这个类的实例。
    private SessionFactoryUtils() {
    }

    // 通过定义这个类的静态方法，并且返回类型与这个类的类型一样，来实现对这个类的访问
    public static SessionFactoryUtils getInstance() {
        if (factoryUtils == null) {
            factoryUtils = new SessionFactoryUtils();
        }
        return factoryUtils;
    }

    public SessionFactory openSessionFactory() {
        if (factory == null) {
            //加载主配置文件
            Configuration configuration = new Configuration().configure();

            //建立工厂
            factory = configuration.buildSessionFactory();
        }
        return factory;
    }
}
