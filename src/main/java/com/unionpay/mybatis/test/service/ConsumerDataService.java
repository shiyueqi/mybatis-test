package com.unionpay.mybatis.test.service;

import com.unionpay.mybatis.test.domain.ConsumerDO;
import com.unionpay.mybatis.test.mapper.ConsumerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * date: 2017/04/28 19:03.
 * author: Yueqi Shi
 */
@Service("consumerDataService")
public class ConsumerDataService {

    @Resource
    private ConsumerMapper consumerMapper;

    public int getConsumersCount() {
        return consumerMapper.getConsumersCount();
    }

    public List<ConsumerDO> getConsumerByServiceId(String serviceId) {
        List<ConsumerDO> consumerDOs = consumerMapper.getConsumerByServiceId(serviceId);
        return consumerDOs;
    }

}
