package com.rocha.solid.SRP.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Product {

    String name;
    String description;
    BigDecimal price;
    String shippingType;
    BigDecimal weight;

}
