package io.jsonparsing;

import java.time.LocalDate;

public class Response {

    @JsonProperty(value = "Time Series (Daily)")
    private Map<LocalDate, Candle> candles;

    public Map<LocalDate, Candle> getCandles() {
        return candles;
    }

    public void setCandles(
            Map<LocalDate, Candle> candles) {
        this.candles = candles;
    }
}
