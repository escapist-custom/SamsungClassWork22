package com.samsung.model;

public class Product {

    private String name;
    private int price;
    private int count;

    public static int proCount = 0;

    public Product(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
        proCount++;
    }

    @Override
    public String toString() {
        /*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Name: ")*/
        String res =
                "Name: " + name + "\n"
                + "Price: " + price + "\n"
                + "Count: " + count;
        return res;
    }

    public static void changeCount(Product product, int newCount) {
        product.count += newCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
