package com.example.api.btc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiBtcClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(ApiBtcClientApplication.class, args);
  }

}
