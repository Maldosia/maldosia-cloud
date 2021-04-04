package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * create date: 2020/5/29 11:16
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMainStarter8082 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMainStarter8082.class, args);
    }
}
