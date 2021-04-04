package org.maldosia.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * create date: 2020/6/15 17:22
 **/
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "TEST A !!!!!!!!!!!!!!";
    }

    @GetMapping("/testB")
    public String testB(){
        return "TEST B !!!!!!!!!!!!!!";
    }

    @GetMapping("/testC")
    public String testC(){
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int age = 10 / 0;

        System.out.println("TEST C 测试RT");
        return "TEST C!!!!!!";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "TEST testHotKey!!!!!!";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "TEST deal_testHotKey,/(ㄒoㄒ)/~~!!!!!!";
    }
}
