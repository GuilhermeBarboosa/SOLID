package com.rocha.solid.clean_code.service;



import com.rocha.solid.clean_code.entity.Product;
import com.rocha.solid.clean_code.validator.ProductValidator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductCalculator {

    private final ProductValidator productValidator;

    ProductCalculator(ProductValidator productValidator) {
        this.productValidator = productValidator;
    }


    public BigDecimal calculateTotalPrice(List<Product> products) {
        BigDecimal total = BigDecimal.ZERO;

        for (Product p : products) {

            this.productValidator.validate(p);

            total = total.add(
                    p.getPrice()
                            .multiply(new BigDecimal(p.getQuantity()))
            );
        }

        return total;
    }

}
