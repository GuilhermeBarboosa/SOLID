package com.rocha.solid.clean_code.service.plan;

import com.rocha.solid.clean_code.entity.Order;
import com.rocha.solid.clean_code.interfaces.CalculatePlanPrice;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Service
public class CalculatePriceService {
   private final List<CalculatePlanPrice> calculatePlanPrices;

   public CalculatePriceService(List<CalculatePlanPrice> calculatePlanPrices) {
        this.calculatePlanPrices = calculatePlanPrices;
    }

    public BigDecimal calculatePrice(Order order, BigDecimal totalPrice) {
        CalculatePlanPrice calculatePlanPrice = calculatePlanPrices.stream()
                .filter(s -> Objects.equals(s.getTypePlan(), order.getOrderType()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Order type not found: " + order.getOrderType()));

        return calculatePlanPrice.calculateDiscountPlan(totalPrice);
    }


}
