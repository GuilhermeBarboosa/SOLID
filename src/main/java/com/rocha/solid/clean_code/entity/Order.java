package com.rocha.solid.clean_code.entity;

import com.rocha.solid.clean_code.ENUM.OrderType;
import com.rocha.solid.clean_code.ENUM.ShippingType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {

    private String customerName;
    private String customerType;
    private String deliveryType;
    private List<Product> products;
    private OrderType orderType;
    private ShippingType shippingType;

}