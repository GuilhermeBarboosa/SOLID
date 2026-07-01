package com.rocha.solid.clean_code.interfaces;

import java.math.BigDecimal;

public interface ShippingInterface {
    public BigDecimal calculateShipping(BigDecimal totalPrice);
    public String getTypeShipping();
}
