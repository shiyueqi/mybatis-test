package com.unionpay.mybatis.test;

import com.unionpay.mybatis.test.domain.ConsumerDO;
import com.unionpay.mybatis.test.service.ConsumerDataService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * date: 2017/04/28 16:27.
 * author: Yueqi Shi
 */
public class MybatisMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        ConsumerDataService consumerDataService = (ConsumerDataService)applicationContext.getBean("consumerDataService");

        int consumersCount = consumerDataService.getConsumersCount();
        System.out.println("cousumersCount: " + consumersCount);

        String serviceId = "com.unionpay.ldap.service.FunctionService:1.0";
        List<ConsumerDO> consumerDOs = consumerDataService.getConsumerByServiceId(serviceId);
        if (consumerDOs != null) {
            for (ConsumerDO consumerDO : consumerDOs) {
                System.out.println(consumerDO.toString());
            }
        } else {
            System.out.println("consumerDO is null.");
        }
    }
}
