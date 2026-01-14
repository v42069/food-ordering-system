package com.v.food.ordering.orderservice.entity;

import com.v.food.ordering.common.entity.BaseEntity;
import com.v.food.ordering.common.valueobjects.Money;
import com.v.food.ordering.common.valueobjects.OrderId;
import com.v.food.ordering.orderservice.valueobject.OrderItemId;
import lombok.Builder;
import lombok.Getter;


@Getter
public class OrderItems extends BaseEntity<OrderItemId> {

    private OrderId orderId;

    private final Product Product;

    private final int quantity;

    private final Money price;

    private final Money subTotal;


}
