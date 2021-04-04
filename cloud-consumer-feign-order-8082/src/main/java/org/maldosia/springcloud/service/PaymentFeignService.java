package org.maldosia.springcloud.service;

import org.maldosia.springcloud.entities.CommonResult;
import org.maldosia.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * create date: 2020/5/29 11:20
 **/
@Component
@FeignClient(value = "cloud-provider-payment")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String getServerPortByFeignTimeout();
}
