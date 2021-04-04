package org.maldosia.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * create date: 2020/6/8 21:29
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainStarter9003 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainStarter9003.class,args);
    }
}
