package com.rocha.solid.OCP.service;

import com.rocha.solid.OCP.ENUM.ShippingType;
import com.rocha.solid.OCP.interfaces.ShippingInterface;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SedexShippingService implements ShippingInterface {

    @Override
    public BigDecimal calculate(BigDecimal weight) {
        System.out.println("Calculating SEDEX shipping cost for weight: " + weight);
        return weight.multiply(new BigDecimal("1.0"));
    }

    @Override
    public String getType() {
        return String.valueOf(ShippingType.SEDEX);
    }
}
