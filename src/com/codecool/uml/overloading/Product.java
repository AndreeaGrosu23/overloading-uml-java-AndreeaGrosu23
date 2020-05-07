package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Locale;

public class Product {
    private static int setterId=0;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;

    public Product() {
        setterId++;
        id = setterId;
        this.name = "None";
        this.defaultPrice = 1.23F;
        this.defaultCurrency = Currency.getInstance(Locale.US);
        this.productCategory = null;
        this.supplier = null;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        setterId++;
        id = setterId;
        productCategory = null;
        supplier = null;
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

    public float getDefaultPrice() {
        return this.defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String toString() {
        return "ID: " + this.id + ", NAME: " + this.name + ", DEFAULT PRICE: " + this.defaultPrice + this.defaultCurrency + ", CATEGORY: " + this.productCategory + ", SUPPLIER: " + this.supplier;
    }

}
