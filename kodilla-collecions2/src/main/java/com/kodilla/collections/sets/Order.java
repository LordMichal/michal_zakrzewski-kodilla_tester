package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productName;
    private double quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Order order = (Order) o;
        return Double.compare(quantity, order.quantity) == 0 && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(productName, order.productName);
    }
    public Order(String orderNumber, String  orderName, double quantity) {
        this.productName = orderName;
        this.orderNumber = orderNumber;
        this.quantity = quantity;

    }

        public String getOrderName() {
        return productName;
        }
        public  String getOrderNumber() {
        return orderNumber;
        }
        public double getQuantity() {
        return quantity;
        }



    @Override public int hashCode() {
        return Objects.hash(orderNumber, productName, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", orderName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
