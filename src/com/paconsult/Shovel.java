package com.paconsult;

public class Shovel extends Product {
    private Dimension dimension;
    private Material material;

    public Shovel(String name, int quantity, Dimension dimension, Material material) {
        super(name, quantity);
        this.dimension = dimension;
        this.material = material;
    }
}
