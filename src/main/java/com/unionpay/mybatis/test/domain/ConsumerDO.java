package com.unionpay.mybatis.test.domain;

import java.util.Date;

/**
 * date: 2017/04/28 17:26.
 * author: Yueqi Shi
 */
public class ConsumerDO {
    String serviceId;

    String dc;

    String address;

    String appId;

    String appDesc;

    Date createTime;

    Date updateTime;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ConsumerDO{" +
                "serviceId='" + serviceId + '\'' +
                ", dc='" + dc + '\'' +
                ", address='" + address + '\'' +
                ", appId='" + appId + '\'' +
                ", appDesc='" + appDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
