package com.summahto.multipledatasources.jsonparsing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    @JsonProperty(value = "Time Series (Daily)")
    private Map<LocalDate, Candle> candles;

    public Map<LocalDate, Candle> getCandles() {
        return candles;
    }

    public void setCandles( Map<LocalDate, Candle> candles) {
        this.candles = candles;
    }

    @Override
    public String toString() {
        return "Response{" +
                "candles=" + candles +
                '}';
    }
}
