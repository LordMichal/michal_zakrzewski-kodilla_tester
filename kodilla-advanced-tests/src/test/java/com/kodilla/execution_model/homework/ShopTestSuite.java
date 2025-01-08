package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTestSuite {
    private Shop shop;
    private Order order1, order2, order3;

    @BeforeEach
    public void initializeOrder() {
        shop = new Shop();
        order1 = new Order(20.0, "2025-01-06", "user1");
        order2 = new Order(160.0, "2025-01-05", "user2");
        order3 = new Order(1440.0, "2025-01-02", "user3");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }
    @Test
    public void AddNewOrder(){
        //given
        Order newOrder = new Order(200, "2025-01-08", "user4");
        //when
        shop.addOrder(newOrder);

        //then
        assertEquals(4, shop.getNumberOfOrders());
    }
    @Test
    public void ReturnOrderWithDataRange(){
        //when
        Set<Order> ordersInValueRange = shop.getOrdersInValueRange(150.0, 250.0);
        //then
        assertEquals(1, ordersInValueRange.size());
        assertTrue(ordersInValueRange.contains(order2));
    }
    @Test
    public void SumOderValues(){
        assertEquals(1620.0, shop.sumOfOrderValues());
    }
}

