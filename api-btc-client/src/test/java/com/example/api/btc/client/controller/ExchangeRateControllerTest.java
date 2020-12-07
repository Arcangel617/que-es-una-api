package com.example.api.btc.client.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.example.api.btc.client.dto.ExchangeRateDto;
import com.example.api.btc.client.service.CoinApiService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class ExchangeRateControllerTest {

  @Mock
  private CoinApiService coinApiService;
  @InjectMocks
  private ExchangeRateController exchangeRateController;

  @Test
  void getQuery() {
    final String base = "BTC";
    final String quote = "ARS";
    when(coinApiService.get(base, quote)).thenReturn(null);
    ResponseEntity<ExchangeRateDto> response = exchangeRateController.getQuery(base, quote);
    assertEquals(HttpStatus.OK, response.getStatusCode());
  }
}
