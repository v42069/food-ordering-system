package com.v.food.ordering.orderservice.service;


import com.v.food.ordering.orderservice.entity.Order;
import com.v.food.ordering.orderservice.entity.Restaurant;
import com.v.food.ordering.orderservice.event.OrderCancelledEvent;
import com.v.food.ordering.orderservice.event.OrderCreatedEvent;
import com.v.food.ordering.orderservice.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}
