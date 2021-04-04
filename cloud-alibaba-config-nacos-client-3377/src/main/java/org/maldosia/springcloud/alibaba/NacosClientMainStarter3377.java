package org.maldosia.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * create date: 2020/6/9 21:07
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientMainStarter3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientMainStarter3377.class, args);
    }
}
