package com.example.billing.domain;

import java.math.BigDecimal;
import java.time.Instant;

public class SaleDetail {
    private int id;
    private int user_id;
    private BigDecimal total;
    private Instant order_date;
}
