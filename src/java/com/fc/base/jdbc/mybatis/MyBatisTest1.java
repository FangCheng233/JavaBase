package com.fc.base.jdbc.mybatis;

import com.fc.base.jdbc.mybatis.dao.ServiceDiscoveryMapper;
import com.fc.base.jdbc.mybatis.dao.UserMapper;
import com.fc.base.jdbc.mybatis.entit.ServiceDiscovery;
import com.fc.base.jdbc.mybatis.entit.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName MyBatisTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/28 10:35 上午
 * @Version 1.0
 */
public class MyBatisTest1 {
    public static void main(String[] args) throws Exception{
        new MyBatisTest1().findUserByIdTest();
//        new MyBatisTest1().findUserByNameTest();
        if (true){
            return;
        }
        new Thread(()->{
            try {
                new MyBatisTest1().insert();
            }catch (IOException E){

            }
        }).start();
        new Thread(()->{
            try {
                new MyBatisTest1().insert();
            }catch (IOException E){

            }
        }).start();
        new Thread(()->{
            try {
                new MyBatisTest1().insert();
            }catch (IOException E){

            }
        }).start();
    }
    public void insert() throws IOException {
        // mybatis配置文件
        String resource = "./log4j.properties";
        // 得到配置文件流
        InputStream fis = Resources.getResourceAsStream("./SqlMapConfig.xml");
//        InputStream inputStream =  fis;
        //创建会话工厂，传入mybatis配置文件的信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(fis);
        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        ServiceDiscoveryMapper userMapper = sqlSession.getMapper(ServiceDiscoveryMapper.class);
        ServiceDiscovery serviceDiscovery = new ServiceDiscovery();

        serviceDiscovery.setApi("/getName");
        serviceDiscovery.setServiceName("getServiceName");
        serviceDiscovery.setInstance("/192.168.1.11");
        serviceDiscovery.setConfig("name=eureka");
        serviceDiscovery.setCreateTime("20201117 21:15:35.280");
        serviceDiscovery.setUpdateTime("20201117 21:15:35.280");
        boolean registering = true;
        sqlSession.getConfiguration().getEnvironment();
        while (registering){
            userMapper.insert(serviceDiscovery);
            try {
                Thread.sleep(60000);
            }catch (InterruptedException e){

            }
            sqlSession.rollback();
        }
//        userMapper.insert(serviceDiscovery);
        // 通过SqlSession操作数据库
        // 第一个参数：映射文件中statement的id，等于=namespace+"."+statement的id
        // 第二个参数：指定和映射文件中所匹配的parameterType类型的参数
        // sqlSession.selectOne结果 是与映射文件中所匹配的resultType类型的对象
        // selectOne查询出一条记录
//        User user = sqlSession.selectOne("test.findUserById", 1);
//        sqlSession.commit();
        sqlSession.close();

    }
    public void findUserByIdTest() throws IOException {
        // mybatis配置文件
        String resource = "./log4j.properties";
        // 得到配置文件流
        InputStream fis = Resources.getResourceAsStream("./SqlMapConfig.xml");
//        InputStream inputStream =  fis;
        //创建会话工厂，传入mybatis配置文件的信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(fis);
        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<>();
//        ids.add(1);
//        ids.add(2);
//        ids.add(3);
        List<User> user = userMapper.findUserById(ids);
        // 通过SqlSession操作数据库
        // 第一个参数：映射文件中statement的id，等于=namespace+"."+statement的id
        // 第二个参数：指定和映射文件中所匹配的parameterType类型的参数
        // sqlSession.selectOne结果 是与映射文件中所匹配的resultType类型的对象
        // selectOne查询出一条记录
//        User user = sqlSession.selectOne("test.findUserById", 1);

        System.out.println(user);

        // 释放资源
        sqlSession.close();

    }
    // 根据用户名称模糊查询用户列表
    public void findUserByNameTest() throws IOException {
        // mybatis配置文件
        String resource = "./SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂，传入mybatis的配置文件信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);

        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // list中的user和映射文件中resultType所指定的类型一致
        List<User> list = sqlSession.selectList("findUserByName", "asd");
        System.out.println(list);
        sqlSession.close();

    }

}
