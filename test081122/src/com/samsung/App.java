package com.samsung;

import com.samsung.model.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Chees", 305, 10);

        Product product1 = new Product("Bread", 100, 10);

        //String res = product.toString();

        // Math.sin(); every method in this class is static

        Product.changeCount(product, -5);

        System.out.println(product);
    }
}