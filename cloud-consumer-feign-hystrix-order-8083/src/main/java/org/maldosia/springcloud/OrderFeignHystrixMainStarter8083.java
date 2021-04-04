package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * create date: 2020/5/29 17:54
 **/
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class OrderFeignHystrixMainStarter8083 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixMainStarter8083.class, args);
    }
}
