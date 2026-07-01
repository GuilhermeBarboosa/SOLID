package com.rocha.solid.clean_code.service.plan;

import com.rocha.solid.clean_code.ENUM.OrderType;
import com.rocha.solid.clean_code.interfaces.CalculatePlanPrice;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PremiumCalculatePriceService implements CalculatePlanPrice {

    BigDecimal discount = new BigDecimal("0.15");

    @Override
    public BigDecimal calculateDiscountPlan(BigDecimal price) {
        return price.multiply(discount);
    }

    @Override
    public OrderType getTypePlan() {
        return OrderType.PREMIUM;
    }
}
