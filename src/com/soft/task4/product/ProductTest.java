package com.soft.task4.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product1 = new Product("Apple", 1, 40);

    String actual = product1.toString();
    String expected = "\nName = Apple, Price = 1, Quantity = 40";

    @Test
    void toStringTest() {
        assertEquals(expected, actual);
    }
}