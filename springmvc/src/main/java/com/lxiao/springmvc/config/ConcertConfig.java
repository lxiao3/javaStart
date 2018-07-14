package com.lxiao.springmvc.config;

import com.lxiao.springmvc.aop.IndexAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {

    @Bean
    public IndexAspect indexAspect() {
        return new IndexAspect();
    }
}
