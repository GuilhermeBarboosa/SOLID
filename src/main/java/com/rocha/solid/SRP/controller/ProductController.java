package com.rocha.solid.SRP.controller;

import com.rocha.solid.SRP.entity.Product;
import com.rocha.solid.SRP.service.ProductService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public void createProduct(@RequestBody Product product) {
        this.productService.save(product);
    }

}
