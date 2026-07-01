package com.rocha.solid.clean_code.validator;

import com.rocha.solid.clean_code.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderValidator {

    public void validate(Order order) {
        if (order == null) {
            throw new RuntimeException("Order null");
        }

        if (order.getCustomerName() == null) {
            throw new RuntimeException("Customer null");
        }

        if (order.getProducts() == null || order.getProducts().size() == 0) {
            throw new RuntimeException("Products");
        }
    }

}
