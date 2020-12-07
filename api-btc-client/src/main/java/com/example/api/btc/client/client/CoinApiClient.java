package com.example.api.btc.client.client;

import com.example.api.btc.client.config.FeignConfig;
import com.example.api.btc.client.dto.ExchangeRateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "coinApiClient",
    url = "${provider.coinapi.url}",
    configuration = FeignConfig.class)
public interface CoinApiClient {

  @GetMapping(value = "/v1/exchangerate/{base}/{quote}")
  ExchangeRateDto getSpecificRate(
      @PathVariable("base") String base, @PathVariable("quote") String quote);
}
