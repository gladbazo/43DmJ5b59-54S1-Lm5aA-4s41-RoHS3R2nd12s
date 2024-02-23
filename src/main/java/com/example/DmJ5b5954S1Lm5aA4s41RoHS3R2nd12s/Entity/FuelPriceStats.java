package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Entity;

import java.math.BigDecimal;

public class FuelPriceStats {
    private BigDecimal medianPrice;
    private BigDecimal maxPrice;
    private BigDecimal minPrice;

    public FuelPriceStats(BigDecimal medianPrice, BigDecimal maxPrice, BigDecimal minPrice) {
        this.medianPrice = medianPrice;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }


    public BigDecimal getMedianPrice() {
        return this.medianPrice;
    }

    public BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    public BigDecimal getMinPrice() {
        return this.minPrice;
    }
}

