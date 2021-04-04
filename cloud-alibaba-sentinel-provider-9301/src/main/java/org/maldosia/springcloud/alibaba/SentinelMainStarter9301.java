package org.maldosia.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * create date: 2020/6/15 17:21
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMainStarter9301 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelMainStarter9301.class, args);
    }
}
