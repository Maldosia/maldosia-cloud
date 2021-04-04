package org.maldosia.springcloud;

import org.maldosia.rule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * create date: 2020/5/27 17:14
 **/
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT",configuration = CustomRule.class)
public class OrderMainStarter8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainStarter8080.class, args);
    }
}
