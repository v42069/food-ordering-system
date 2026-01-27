package com.v.food.ordering.orderservice.event;

import com.v.food.ordering.orderservice.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent extends OrderEvent {

    public OrderCreatedEvent(com.v.food.ordering.orderservice.entity.Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
