package com.rocha.solid.OCP.interfaces;

import java.math.BigDecimal;

public interface ShippingInterface {
    public BigDecimal calculate(BigDecimal weight);
    public String getType();
}
