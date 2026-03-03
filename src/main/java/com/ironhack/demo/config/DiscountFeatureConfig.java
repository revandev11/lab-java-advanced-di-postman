package com.ironhack.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ironhack.demo.service.EarlyBirdDiscountService;

@Configuration
public class DiscountFeatureConfig {
    @Bean
    @ConditionalOnProperty(value = "feature.earlybird.enabled", havingValue = "true")
    public EarlyBirdDiscountService earlyBirdDiscountService() {
        return new EarlyBirdDiscountService();
    }
}
