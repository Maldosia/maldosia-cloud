package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * create date: 2020/5/28 14:07
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMainStarter8081 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKMainStarter8081.class, args);
    }
}
