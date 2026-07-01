package com.rocha.solid.clean_code.service.shipping;

import com.rocha.solid.clean_code.interfaces.ShippingInterface;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GenericShippingService implements ShippingInterface {


    BigDecimal shippingCost = new BigDecimal("3");

    @Override
    public BigDecimal calculateShipping(BigDecimal totalPrice) {
        return totalPrice.multiply(shippingCost);
    }

    @Override
    public String getTypeShipping() {
        return "GENERIC";
    }
}
