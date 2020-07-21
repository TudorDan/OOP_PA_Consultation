package com.paconsult;

public class Truck extends Product {
    private int numOfWheels;

    public Truck(String name, int quantity, int numOfWheels) {
        super(name, quantity);
        this.numOfWheels = numOfWheels;
    }
}
