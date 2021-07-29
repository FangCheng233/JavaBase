package com.fc.base.jdbc.mybatis.entit;

import javax.persistence.*;

/**
 * @ClassName SERVICE_DISCOVERY
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/10 10:47 下午
 * @Version 1.0
 */
@Table(name = "SERVICE_DISCOVERY")
public class ServiceDiscovery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ID;
    @Column(name = "SERVICE_NAME")
    private String serviceName;
    @Column(name = "INSTANCE")
    private String instance;
    @Column(name = "CONFIG")
    private String config;
    @Column(name = "API")
    private String api;
    @Column(name = "CREATE_TIME")
    private String createTime;
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * Gets the value of ID. *
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets the ID. *
     * <p>You can use getID() to get the value of ID</p>
     * * @param ID ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Gets the value of serviceName. *
     *
     * @return the value of serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the serviceName. *
     * <p>You can use getServiceName() to get the value of serviceName</p>
     * * @param serviceName serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Gets the value of instance. *
     *
     * @return the value of instance
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Sets the instance. *
     * <p>You can use getInstance() to get the value of instance</p>
     * * @param instance instance
     */
    public void setInstance(String instance) {
        this.instance = instance;
    }

    /**
     * Gets the value of config. *
     *
     * @return the value of config
     */
    public String getConfig() {
        return config;
    }

    /**
     * Sets the config. *
     * <p>You can use getConfig() to get the value of config</p>
     * * @param config config
     */
    public void setConfig(String config) {
        this.config = config;
    }

    /**
     * Gets the value of api. *
     *
     * @return the value of api
     */
    public String getApi() {
        return api;
    }

    /**
     * Sets the api. *
     * <p>You can use getApi() to get the value of api</p>
     * * @param api api
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     * Gets the value of createTime. *
     *
     * @return the value of createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the createTime. *
     * <p>You can use getCreateTime() to get the value of createTime</p>
     * * @param createTime createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Gets the value of updateTime. *
     *
     * @return the value of updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the updateTime. *
     * <p>You can use getUpdateTime() to get the value of updateTime</p>
     * * @param updateTime updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
