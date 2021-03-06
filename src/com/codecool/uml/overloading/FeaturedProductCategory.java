package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {
    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + ", NAME: " + this.getName() + ", DEPARTMENT: " + this.getDepartment() + ", DESCRIPTION: " + this.getDescription() + this.startDate + ", " + this.endDate;
    }
}
