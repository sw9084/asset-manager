package com.pluralsight;
//this part class that holds general information about any type of asset

public abstract class Asset {

    protected String description;
    protected String dateAcquired;
    protected double originalCost;

    //constructor
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataAcquired() {
        return dateAcquired;
    }

    public void setDataAcquired(String dataAcquired) {
        this.dateAcquired = dataAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    // method: getValue
    public abstract getValue();

}

