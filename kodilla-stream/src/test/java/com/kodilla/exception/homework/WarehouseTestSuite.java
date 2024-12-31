package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testOrder() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("121"));
        warehouse.addOrder(new Order("122"));
        warehouse.addOrder(new Order("123"));
        //when
        //tehn
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder(""));
    }

}