package org.maldosia.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * create date: 2020/6/8 20:57
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMainStarter9002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMainStarter9002.class, args);
    }
}
