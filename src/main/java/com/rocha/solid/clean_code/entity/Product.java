package com.rocha.solid.clean_code.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Product {

    private String name;

    private Integer quantity;

    private BigDecimal price;

}
