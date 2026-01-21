package com.v.food.ordering.orderservice.valueobject;

import com.v.food.ordering.common.valueobjects.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    protected TrackingId(UUID value) {
        super(value);
    }
}
