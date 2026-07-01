package com.rocha.solid.OCP.service;

import com.rocha.solid.OCP.ENUM.ShippingType;
import com.rocha.solid.OCP.interfaces.ShippingInterface;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PacShippingService implements ShippingInterface {

    @Override
    public BigDecimal calculate(BigDecimal weight) {
        System.out.println("Calculating PAC shipping cost for weight: " + weight);
        return weight.multiply(new BigDecimal("0.5"));
    }

    @Override
    public String getType() {
        return String.valueOf(ShippingType.PAC);
    }
}
