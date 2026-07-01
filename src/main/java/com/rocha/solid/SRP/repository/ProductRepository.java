package com.rocha.solid.SRP.repository;

import com.rocha.solid.SRP.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public void save(Product product) {
        System.out.println("Saving product: " + product.getName());
    }
}
