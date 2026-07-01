package com.rocha.solid.SRP.service;

import com.rocha.solid.SRP.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    public void generateLogProduct(Product product){
        System.out.println("Generating log for product: " + product.getName());
    }
}
