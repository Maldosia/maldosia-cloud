package org.maldosia.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.maldosia.springcloud.entities.CommonResult;
import org.maldosia.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * create date: 2020/5/28 14:53
 **/
@RestController
@Slf4j
public class OrderZKController {
    public static final String PAYMENT_URL = "http://cloud-providerzk-payment-8004";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumerZK/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }

}
