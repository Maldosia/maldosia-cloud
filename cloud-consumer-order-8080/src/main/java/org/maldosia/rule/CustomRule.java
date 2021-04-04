package org.maldosia.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create date: 2020/5/28 17:36
 **/
@Configuration
public class CustomRule {

    @Bean
    public IRule getCustomRule(){
        return new RandomRule();
    }
}
