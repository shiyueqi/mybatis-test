package com.unionpay.mybatis.test.mapper;

import com.unionpay.mybatis.test.domain.ConsumerDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * date: 2017/04/28 17:35.
 * author: Yueqi Shi
 */
@Repository
public interface ConsumerMapper {

    int getConsumersCount();

    List<ConsumerDO> getConsumerByServiceId(String serviceId);
}
