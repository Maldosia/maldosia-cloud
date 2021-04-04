package org.maldosia.springcloud.loadBalance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * create date: 2020/5/28 17:50
 **/
public interface ICustomLoadBalance {

    ServiceInstance getInstances(List<ServiceInstance> serviceInstances);
}
