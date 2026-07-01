package com.rocha.solid.OCP.controller;

import com.rocha.solid.SRP.entity.Product;
import com.rocha.solid.OCP.service.ShippingCalculateService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/shipping")
public class ShippingController {

    private final ShippingCalculateService shippingCalculateService;

    public ShippingController(ShippingCalculateService shippingCalculateService) {
        this.shippingCalculateService = shippingCalculateService;
    }

    @GetMapping("/calculate")
    public void createProduct(@RequestBody Product product) {
        this.shippingCalculateService.calculate(product);
    }

}
