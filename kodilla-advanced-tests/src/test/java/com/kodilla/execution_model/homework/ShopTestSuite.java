//package com.kodilla.execution_model.homework;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class ShopTestSuite {
//    private Shop shop;
//    private Order order1, order2, order3;
//
//    @BeforeEach
//    public void initializeOrder() {
//        shop = new Shop();
//        order1 = new Order(100.0, "2025-01-06", "user1");
//        order2 = new Order(200.0, "2025-01-05", "user2");
//        order3 = new Order(300.0, "2025-01-02", "user3");
//        shop.addOrder(order1);
//        shop.addOrder(order2);
//        shop.addOrder(order3);
//    }
//
//    @Test
//    public void shouldAddNewOrder() {
//        // given
//        Order newOrder = new Order(150.0, "2025-01-03", "user4");
//
//        // when
//        shop.addOrder(newOrder);
//
//        // then
//
//    }
//
//    @Test
//    public void shouldReturnOrdersWithinDateRange() {
//        // when
//
//
//        // then
//
//    }
//
//    @Test
//    public void shouldReturnOrdersWithinValueRange() {
//        // when
//
//
//        // then
//
//    }
//
//    @Test
//    public void shouldReturnCorrectNumberOfOrders() {
//        // then
//
//    }
//
//    @Test
//    public void shouldSumOrderValues() {
//        // then
//
//    }
//}
//
