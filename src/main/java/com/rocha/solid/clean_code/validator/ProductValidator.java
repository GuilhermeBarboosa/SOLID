package com.rocha.solid.clean_code.validator;

import com.rocha.solid.clean_code.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductValidator {

    public void validate(Product product) {
        if (product == null) {
            throw new RuntimeException("Product null");
        }

        if (product.getName() == null || product.getName().isEmpty()) {
            throw new RuntimeException("Product name null or empty");
        }

        if (product.getPrice() == null || product.getPrice().doubleValue() <= 0) {
            throw new RuntimeException("Product price invalid");
        }

        if (product.getQuantity() <= 0) {
            throw new RuntimeException("Product quantity invalid");
        }
    }

}
