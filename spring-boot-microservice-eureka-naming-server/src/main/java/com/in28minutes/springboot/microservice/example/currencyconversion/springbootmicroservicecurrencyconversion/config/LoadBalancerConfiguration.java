package com.in28minutes.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion.config;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class LoadBalancerConfiguration {

    @Bean
    @Primary
    public ServiceInstanceListSupplier discoveryClientServiceInstanceSupplier() {
        return new StaticServiceInstanceListSupplier("forex-service");
    }
}



