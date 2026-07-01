package com.rocha.solid.clean_code.interfaces;

import com.rocha.solid.clean_code.ENUM.OrderType;

import java.math.BigDecimal;

public interface CalculatePlanPrice {
    public BigDecimal calculateDiscountPlan(BigDecimal price);
    public OrderType getTypePlan();
}
