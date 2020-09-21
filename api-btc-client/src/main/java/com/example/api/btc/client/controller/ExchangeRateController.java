package com.example.api.btc.client.controller;

import com.example.api.btc.client.dto.ExchangeRateDto;
import com.example.api.btc.client.service.CoinApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeRateController {

  private final CoinApiService coinApiService;

  public ExchangeRateController(CoinApiService coinApiService) {
    this.coinApiService = coinApiService;
  }

  @GetMapping(value = "/exchange-rate/{base}/{quote}")
  public ResponseEntity<ExchangeRateDto> getQuery(
      @PathVariable String base,
      @PathVariable String quote
  ) {
    ExchangeRateDto response = coinApiService.get(base, quote);
    return ResponseEntity.ok(response);
  }

}
