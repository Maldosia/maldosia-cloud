package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * create date: 2020/5/27 15:40
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMainStarter8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMainStarter8002.class, args);
    }
}
