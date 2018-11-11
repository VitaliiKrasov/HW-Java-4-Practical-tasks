/**
 * HW4 Practical tasks4
 * Create class Product with fields name, price and quantity.
 * Create four instances of type Product.
 * Display the name and quantity of the most expensive item.
 * Display the name of the items, which has the biggest quantity.
 */

package com.soft.task4.product;

public class Product {
    private String name;
    private int price;
    private int quantity;
    static int maxPrice = 0;
    static int maxQuontity = 0;
    static Object mostExpensiveProduct;
    static Object bigestQuontityProduct;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        checkPrice(price);
        checkQuantity(quantity);

    }

    private void checkQuantity(int quantity) {
        if (quantity > maxQuontity) {
            maxQuontity = quantity;
            bigestQuontityProduct = this;
        }
    }

    private void checkPrice(int price) {
        if (price > maxPrice) {
            maxPrice = price;
            mostExpensiveProduct = this;
        }
    }

        public String toString() {
        return String.format( "\nName = %1$s, Price = %2$s, Quantity = %3$s", name, price, quantity);
    }

    public static void printInfo() {
        String info = String.format("Most expensive product: %1$s,\nThe biggest quantity product: %2$s",
                mostExpensiveProduct.toString(), bigestQuontityProduct.toString());
        System.out.println(info);
    }

    public static void main(String[] args) {

        Product product1 = new Product("Apple", 1, 40);
        Product product2 = new Product("Avocado", 20, 4);
        Product product3 = new Product("Pear", 2, 20);
        Product product4 = new Product("Quince", 5, 15);
        printInfo();

    }
}
