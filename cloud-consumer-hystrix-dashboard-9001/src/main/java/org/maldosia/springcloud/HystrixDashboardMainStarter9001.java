package org.maldosia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * create date: 2020/6/1 16:47
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMainStarter9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMainStarter9001.class, args);
    }

}
