package com.rocha.solid.SRP.service;

import com.rocha.solid.SRP.entity.Notification;
import com.rocha.solid.SRP.entity.Product;
import com.rocha.solid.SRP.repository.ProductRepository;
import com.rocha.solid.SRP.validator.ProductValidator;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductValidator productValidator;
    private final ProductRepository productRepository;
    private final NotificationService notificationService;
    private final LogService logService;

    public ProductService(ProductValidator productValidator,
                          ProductRepository productRepository,
                          NotificationService notificationService,
                          LogService logService) {

        this.productValidator = productValidator;
        this.productRepository = productRepository;
        this.notificationService = notificationService;
        this.logService = logService;
    }

    public void save(Product product) {
        this.productValidator.validate(product);
        this.productRepository.save(product);
        this.notificationService.send(new Notification("Product saved: " + product.getName()));
        this.logService.generateLogProduct(product);
    }

}
