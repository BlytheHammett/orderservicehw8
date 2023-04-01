package com.example.orderservice.model;

import java.util.Objects;

public class Return {

    private int orderId;
    private int itemId;
    private String reason;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Return aReturn = (Return) o;
        return orderId == aReturn.orderId && itemId == aReturn.itemId && Objects.equals(reason, aReturn.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, itemId, reason);
    }
}
