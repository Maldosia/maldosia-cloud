package org.maldosia.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.maldosia.springcloud.entities.CommonResult;
import org.maldosia.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * create date: 2020/5/29 11:24
 **/
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/order/consumer/feign/payment/{id}")
    public CommonResult getPaymentIById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String getServerPortByFeignTimeout(){
        return paymentFeignService.getServerPortByFeignTimeout();
    }
}
