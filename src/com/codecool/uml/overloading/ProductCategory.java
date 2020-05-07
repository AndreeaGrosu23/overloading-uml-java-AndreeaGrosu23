package com.codecool.uml.overloading;

public class ProductCategory {
    private static int setterId = 0;
    private int id;
    private String name;
    private String department;
    private String description;

    public ProductCategory() {
        setterId++;
        id = setterId;
        name = "None";
        department = "None";
        description = "None";

    }

    public ProductCategory(String name, String department, String description) {
        this.name = name;
        this.department = department;
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

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "ID: " + this.id + ", NAME: " + this.name + ", DEPARTMENT: " + this.department + ", DESCRIPTION: " + this.description;
    }

}
