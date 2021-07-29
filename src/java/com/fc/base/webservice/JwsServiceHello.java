package com.fc.base.webservice;

/**
 * @ClassName JwsServiceHello
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/2 6:33 下午
 * @Version 1.0
 */


import com.alibaba.fastjson.JSONObject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Binding;
import javax.xml.ws.Endpoint;
import javax.xml.ws.handler.Handler;
import java.util.LinkedList;
import java.util.List;

/**
 * Title: ServiceHello
 * Description: 基于jdk1.6以上的javax.jws 发布webservice接口
 @WebService － 它是一个注解，用在类上指定将此类发布成一个ws。
 Endpoint – 此类为端点服务类，它的方法publish用于将一个已经添加了@WebService注解
 对象绑定到一个地址的端口上。
  * Version:1.0.0
  * @author panchengming
 */
@WebService

public class JwsServiceHello {

    /** 供客户端调用方法  该方法是非静态的，会被发布
     * @param object  传入参数
     * @return String 返回结果
     * */
    @WebMethod(exclude = false,operationName = "getValue")
    public String getValue(@WebParam(name = "name",mode = WebParam.Mode.IN,partName = "name") String object){

        return "欢迎你！" + object;
    }
    public String setValue(String name){
        System.out.println(name);
        return name+"asdasd";
    }
    /**
     * 方法上加@WebMentod(exclude=true)后，此方法不被发布；
     * @param name
     * @return
     */
    @WebMethod(exclude=true)
    public String getHello(String name){
        return "你好！ "+name;
    }

    /** 静态方法不会被发布
     * @param name
     * @return
     */
    public static String getString(String name){
        return "再见！"+name;
    }


    //通过EndPoint(端点服务)发布一个WebService
    public static void main(String[] args) {
     /*参数:1,本地的服务地址;
           2,提供服务的类;
      */
        JwsServiceHello jwsServiceHello = new JwsServiceHello();
        Endpoint endpoint = Endpoint.publish("http://localhost:8080/hello", jwsServiceHello);
        Binding binding = endpoint.getBinding();
        List<Handler> handlerChain = new LinkedList<Handler>();
//        handlerChain.add(new TraceHandler());
        binding.setHandlerChain(handlerChain);

        Endpoint.publish("http://127.0.0.1:8080/Service/ServiceHello", new JwsServiceHello());
        Endpoint.publish("http://127.0.0.1:8081/Service/ServiceHello", new JwsServiceHello());
        System.out.println("发布成功!");
        //发布成功后 在浏览器输入 http://192.168.1.105:8080/Service/ServiceHello?wsdl
    }
    public class Param{
        private String name;
        private int age;

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
    }
}
