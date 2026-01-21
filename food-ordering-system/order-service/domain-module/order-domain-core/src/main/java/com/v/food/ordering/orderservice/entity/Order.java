package com.v.food.ordering.orderservice.entity;

import com.v.food.ordering.common.entity.AggregateRoots;
import com.v.food.ordering.common.valueobjects.*;
import com.v.food.ordering.orderservice.valueobject.StreetAddress;
import com.v.food.ordering.orderservice.valueobject.TrackingId;

import java.util.List;


public class Order extends AggregateRoots<OrderId> {

    private final CustomerId customerId;

    private final RestaurantId restaurantId;

    private final StreetAddress deliveryAddress;

    private final Money price;

    private final List<OrderItem> orderItems;

    private TrackingId trackingId;

    private OrderStatus orderStatus;

    private List<String> failureMessages;

}
