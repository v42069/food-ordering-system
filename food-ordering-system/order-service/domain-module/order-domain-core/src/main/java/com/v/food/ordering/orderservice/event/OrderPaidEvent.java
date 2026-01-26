package com.v.food.ordering.orderservice.event;

import com.v.food.ordering.orderservice.entity.Order;
import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent {

    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
