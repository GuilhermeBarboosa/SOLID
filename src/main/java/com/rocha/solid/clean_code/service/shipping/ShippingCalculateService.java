package com.rocha.solid.clean_code.service.shipping;


import com.rocha.solid.clean_code.entity.Order;
import com.rocha.solid.clean_code.entity.Product;
import com.rocha.solid.clean_code.interfaces.ShippingInterface;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Service
public class ShippingCalculateService {

    private final List<ShippingInterface> shippings;

    public ShippingCalculateService(List<ShippingInterface> shippings) {
        this.shippings = shippings;
    }

    public BigDecimal calculateShipping(BigDecimal totalPrice, Order order) {
        ShippingInterface shipping = shippings.stream()
                .filter(s -> Objects.equals(s.getTypeShipping(), order.getShippingType()))
                .findFirst().orElse(new GenericShippingService());

        return shipping.calculateShipping(totalPrice);
    }

    private BigDecimal calculateShippingIsNull(BigDecimal totalPrice) {
        return  totalPrice.subtract(totalPrice);
    }


}
