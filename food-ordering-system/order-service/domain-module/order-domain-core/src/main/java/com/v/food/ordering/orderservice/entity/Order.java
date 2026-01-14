package com.v.food.ordering.orderservice.entity;

import com.v.food.ordering.common.entity.AggregateRoots;
import com.v.food.ordering.common.valueobjects.CustomerId;
import com.v.food.ordering.common.valueobjects.Money;
import com.v.food.ordering.common.valueobjects.OrderId;
import com.v.food.ordering.common.valueobjects.RestaurantId;
import com.v.food.ordering.orderservice.valueobject.StreetAddress;

import java.util.List;


public class Order extends AggregateRoots<OrderId> {

    private final CustomerId customerId;

    private final RestaurantId restaurantId;

    private final StreetAddress deliveryAddress;

    private final Money price;

    private final List<OrderItems> orderItems;

}
