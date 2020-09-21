package com.example.api.btc.client.service;

import static org.slf4j.LoggerFactory.getLogger;

import com.example.api.btc.client.client.CoinApiClient;
import com.example.api.btc.client.dto.ExchangeRateDto;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CoinApiService {

  private static final Logger log = getLogger(CoinApiService.class);
  private final CoinApiClient coinApiClient;

  public CoinApiService(CoinApiClient coinApiClient) {
    this.coinApiClient = coinApiClient;
  }

  public ExchangeRateDto get(String base, String quote) {
    log.info("calling coinapi client");
    return coinApiClient.getSpecificRate(base, quote);
  }
}
