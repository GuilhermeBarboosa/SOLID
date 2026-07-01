package com.rocha.solid.clean_code.service;

import com.rocha.solid.clean_code.entity.Order;
import com.rocha.solid.clean_code.service.plan.CalculatePriceService;
import com.rocha.solid.clean_code.service.shipping.ShippingCalculateService;
import com.rocha.solid.clean_code.validator.OrderValidator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {

    private final OrderValidator orderValidator;
    private final ProductCalculator productCalculator;
    private final CalculatePriceService calculatePriceService;
    private final ShippingCalculateService shippingCalculateService;
    private final OrderPersistenceService orderPersistenceService;
    public OrderService(OrderValidator orderValidator,
                        ProductCalculator productCalculator,
                        CalculatePriceService calculatePriceService,
                        ShippingCalculateService shippingCalculateService,
                        OrderPersistenceService orderPersistenceService) {
        this.orderValidator = orderValidator;
        this.productCalculator = productCalculator;
        this.calculatePriceService = calculatePriceService;
        this.shippingCalculateService = shippingCalculateService;
        this.orderPersistenceService = orderPersistenceService;
    }

    public void process(Order order) {
        this.orderValidator.validate(order);
        BigDecimal totalPrice = this.productCalculator.calculateTotalPrice(order.getProducts());
        totalPrice = this.calculatePriceService.calculatePrice(order, totalPrice);
        BigDecimal totalShipping = this.shippingCalculateService.calculateShipping(totalPrice, order);
        totalPrice =  totalPrice.add(totalShipping);

        this.orderPersistenceService.persistOrder(order, totalPrice, totalShipping);
    }


}
