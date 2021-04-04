package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * create date: 2020/6/1 22:20
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatewayMainStarter9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMainStarter9527.class, args);
    }
}
