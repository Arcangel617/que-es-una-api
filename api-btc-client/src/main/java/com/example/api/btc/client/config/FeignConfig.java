package com.example.api.btc.client.config;

import feign.Logger;
import feign.Logger.Level;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

  @Bean
  public RequestInterceptor requestInterceptor() {
    return requestTemplate -> requestTemplate
        .header("X-CoinAPI-Key", "PLACE_YOUR_API_KEY_HERE");
  }

  @Bean
  public Logger.Level feignLoggerLevel() {
    return Level.HEADERS;
  }

}
