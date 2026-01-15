package com.v.food.ordering.orderservice.valueobject;

import com.v.food.ordering.common.valueobjects.BaseId;

public class OrderItemId extends BaseId<Long> {
    protected OrderItemId(Long value) {
        super(value);
    }
}
