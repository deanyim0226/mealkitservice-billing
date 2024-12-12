package com.example.billing.domain;

import java.math.BigDecimal;
import java.time.Instant;

public class Sale {

    private int saleId;
    private BigDecimal total;
    private Instant orderDate;
}
