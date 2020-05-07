package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsByCategory = new ArrayList<>();
        for (int i=0; i<productList.size();i++) {
            if (productList.get(i).getProductCategory() == productCategory)
                productsByCategory.add(productList.get(i));
        }

        return productsByCategory;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsBySupplier = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getSupplier() == supplier)
                productList.add(productList.get(i));
        }

        return productsBySupplier;
    }
}
