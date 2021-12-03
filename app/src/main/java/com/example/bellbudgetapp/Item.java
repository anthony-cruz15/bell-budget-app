package com.example.bellbudgetapp;

public class Item {
    private String name;
    private Integer price, quantity;
    private final Integer DEFAULT_QUANTITY = 1;

    public Item() {
        name = "";
        price = 0;
        quantity = DEFAULT_QUANTITY;
    }

    public Item(String name, Integer price) {
        this.name = name;
        this.price = price;
        quantity = DEFAULT_QUANTITY;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price * quantity;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
