package com.samsung.testwork171222.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product implements Serializable {

    // Fields
    private String name;
    private String dateIn;
    private int amount;
    private int price;

    public Product(String name, String dateIn, int amount, int price) {
        this.name = name;
        this.dateIn = dateIn;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", dateIn='" + dateIn + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDateIn() {
        return dateIn;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
