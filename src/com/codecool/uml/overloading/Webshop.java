package com.codecool.uml.overloading;

import java.util.Calendar;
import java.util.Date;

public class Webshop {

    public static void main(String[] args) {
        Warehouse Emag = new Warehouse();
        Supplier Lg = new Supplier("Lg", "tv");
        System.out.println(Lg.toString());
        ProductCategory electronics = new ProductCategory("Electronics", "house", "expensive stuff");
        System.out.println(electronics.toString());
        ProductCategory laptops = new FeaturedProductCategory();
        System.out.println(laptops.toString());
        Date d1 = new Date(2020, Calendar.MAY,1);
        Date d2 = new Date(2010, Calendar.MAY,30);
        ((FeaturedProductCategory) laptops).schedule(d1, d2);
        System.out.println(laptops.toString());
    }
}
