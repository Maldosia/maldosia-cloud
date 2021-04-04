package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * create date: 2020/5/28 11:20
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZKMainStarter8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZKMainStarter8004.class, args);
    }
}
