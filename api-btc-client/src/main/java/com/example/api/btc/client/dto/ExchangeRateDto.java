package com.example.api.btc.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRateDto {

  @JsonProperty(value = "time")
  private String time;

  @JsonProperty(value = "asset_id_base")
  private String assetIdBase;

  @JsonProperty(value = "asset_id_quote")
  private String assetIdQuote;

  @JsonProperty(value = "rate")
  private double rate;
}
