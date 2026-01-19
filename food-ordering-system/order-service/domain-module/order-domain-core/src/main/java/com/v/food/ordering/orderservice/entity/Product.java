package com.v.food.ordering.orderservice.entity;

import com.v.food.ordering.common.entity.BaseEntity;
import com.v.food.ordering.common.valueobjects.Money;
import com.v.food.ordering.common.valueobjects.ProductId;


public class Product extends BaseEntity<ProductId> {
    public Product(ProductId productId,String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }


    private String name;

    private Money price;

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
