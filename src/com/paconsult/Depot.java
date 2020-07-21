package com.paconsult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Depot {
    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() { return this.products; }

    public List<Product> getProfitableProducts() {
        List<Product> allProducts = getProducts();
        return allProducts.stream().filter(product -> !product.isExpired()).collect(Collectors.toList());
    }

    public int getNumberOfSourProducts() {
        List<Product> allProducts = getProducts();
        return (int) allProducts.stream().filter(Product::isExpired).count();
    }
}
