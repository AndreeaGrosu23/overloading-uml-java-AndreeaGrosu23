package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {
    private static int setterId=0;
    private int id;
    private String name;
    private String description;

    public Supplier() {
        setterId++;
        id = setterId;
        name = "None";
        description = "None";
    }

    public Supplier(String name, String description) {
        this.name = name;
        this.description = description;
        setterId++;
        id = setterId;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts(Warehouse warehouse) {
        return Warehouse.getAllProductsBy(this);
    }

    public String toString() {
        return "ID: " + this.id + ", NAME: " + this.name + ", DESCRIPTION: " + this.description;
    }


}
