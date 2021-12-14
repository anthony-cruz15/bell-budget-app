package com.example.bellbudgetapp;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private Integer price, quantity;
    private boolean isBells;
    private final Integer DEFAULT_QUANTITY = 1;

    public Item() {
        name = "";
        price = 0;
        quantity = DEFAULT_QUANTITY;
    }

    public Item(String name, Integer price, boolean isBells) {
        this.name = name;
        this.price = price;
        quantity = DEFAULT_QUANTITY;
        this.isBells = isBells;
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

}
