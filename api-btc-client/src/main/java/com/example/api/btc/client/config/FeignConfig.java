package com.example.api.btc.client.config;

import feign.Logger;
import feign.Logger.Level;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

  @Value("${keys.coinapi}")
  private String coinApiKey;

  @Bean
  public RequestInterceptor requestInterceptor() {
    return requestTemplate -> requestTemplate.header("X-CoinAPI-Key", coinApiKey);
  }

  @Bean
  public Logger.Level feignLoggerLevel() {
    return Level.HEADERS;
  }
}
