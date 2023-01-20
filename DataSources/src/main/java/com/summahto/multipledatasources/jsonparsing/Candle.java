package com.crio.jsonparsing;

import java.time.LocalDate;

public class Candle {

    private Double open;
    private Double close;
    private Double high;
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
}
