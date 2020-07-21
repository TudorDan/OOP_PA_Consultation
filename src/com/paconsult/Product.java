package com.paconsult;

public abstract class Product {
    protected String name;
    protected int id;
    protected int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.id = 0;
    }

    protected boolean isExpired() { return false; }
}
