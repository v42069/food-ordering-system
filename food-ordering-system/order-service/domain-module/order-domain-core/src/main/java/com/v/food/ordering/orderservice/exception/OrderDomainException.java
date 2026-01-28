package com.v.food.ordering.orderservice.exception;

import com.v.food.ordering.common.exception.DomainException;

public class OrderDomainException extends DomainException {
    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message,Throwable cause) {
        super(message,cause);
    }
}
