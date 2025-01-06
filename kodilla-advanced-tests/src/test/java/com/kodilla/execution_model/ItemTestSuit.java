package com.kodilla.execution_model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTestSuit  {
    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoice() {
        // Given
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);

        // When
        int numberOfItems = invoice.getSize();

        // Then
        assertEquals(3, numberOfItems);
    }

}