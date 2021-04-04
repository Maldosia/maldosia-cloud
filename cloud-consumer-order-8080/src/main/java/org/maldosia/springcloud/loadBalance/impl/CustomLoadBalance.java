package org.maldosia.springcloud.loadBalance.impl;

import lombok.extern.slf4j.Slf4j;
import org.maldosia.springcloud.loadBalance.ICustomLoadBalance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * create date: 2020/5/28 17:51
 **/
@Component
@Slf4j
public class CustomLoadBalance implements ICustomLoadBalance {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement() {
        int current, next;

        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!atomicInteger.compareAndSet(current, next));
        log.info("第"+next+" 次访问！");
        return next;
    }

    @Override
    public ServiceInstance getInstances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
