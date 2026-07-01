package com.rocha.solid.OCP.service;

import com.rocha.solid.SRP.entity.Product;
import com.rocha.solid.OCP.interfaces.ShippingInterface;
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

    public void calculate(Product product) {

        ShippingInterface shipping = shippings.stream()
                .filter(s -> Objects.equals(s.getType(), product.getShippingType()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Shipping type not found: " + product.getShippingType()));

        BigDecimal calculate = shipping.calculate(product.getWeight());
        System.out.println("Shipping type: " + shipping.getType() + ", Weight: " + product.getWeight() + ", Shipping cost: " + calculate);
    }

}
