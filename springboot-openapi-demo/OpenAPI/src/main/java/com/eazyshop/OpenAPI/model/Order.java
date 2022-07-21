package com.eazyshop.OpenAPI.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products = new ArrayList<>();

    private Address address = null;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
