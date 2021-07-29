package com.fc.base.jdbc.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import javax.transaction.Transactional;
import com.fc.base.jdbc.mybatis.entit.ServiceDiscovery;
import static javax.transaction.Transactional.TxType.NOT_SUPPORTED;

/**
 * @ClassName ServiceDiscovery
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/10 10:13 下午
 * @Version 1.0
 */
@Mapper
public interface ServiceDiscoveryMapper {
    @Transactional(NOT_SUPPORTED)
    void insert(ServiceDiscovery serviceDiscovery);
}
