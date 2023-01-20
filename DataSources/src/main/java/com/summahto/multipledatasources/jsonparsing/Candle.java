package com.summahto.multipledatasources.jsonparsing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Candle {

    @JsonProperty("1. open")
    private Double open;

    @JsonProperty("4. close")
    private Double close;

    @JsonProperty("2. high")
    private Double high;

    @JsonProperty("3. low")
    private Double low;

    private LocalDate date;

    public Double getOpen() {
        return open;
    }

    public Double getClose() {
        return close;
    }

    public Double getHigh() {
        return high;
    }

    public Double getLow() {
        return low;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Candle{" +
                "open=" + open +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                ", date=" + date +
                '}';
    }
}
