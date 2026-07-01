package com.rocha.solid.SRP.validator;

import com.rocha.solid.SRP.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductValidator {
    public void validate(Product product) {
        System.out.println("Validating product: " + product.getName());
    }
}
