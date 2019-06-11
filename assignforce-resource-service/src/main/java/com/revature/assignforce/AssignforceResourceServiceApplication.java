package com.revature.assignforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(exclude = ContextRegionProviderAutoConfiguration.class)
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrix
@EnableWebSecurity
@EnableSqs
public class AssignforceResourceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignforceResourceServiceApplication.class, args);
    }

}
