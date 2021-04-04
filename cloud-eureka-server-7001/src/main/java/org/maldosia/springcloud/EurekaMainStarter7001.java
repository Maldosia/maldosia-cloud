package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * create date: 2020/5/27 22:08
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMainStarter7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMainStarter7001.class, args);
    }
}
