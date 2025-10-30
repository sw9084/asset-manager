package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareft;
    private int lotsize;

 public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareft, int lotsize) {
        super(description, dateAcquired,originalCost);
        this.address = address;
        this.condition = condition;
        this.squareft = squareft;
        this.lotsize = lotsize;
 }
 //getter/setters


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareft() {
        return squareft;
    }

    public void setSquareft(int squareft) {
        this.squareft = squareft;
    }

    public int getLotsize() {
        return lotsize;
    }

    public void setLotsize(int lotsize) {
        this.lotsize = lotsize;
    }
    //override
    @Override
    public double getvalue() {
       double valuePerSquarft;
       // value per squareft
        switch(condition) {
            case 1: valuePerSquarft= 180.0; break;
            case 2: valuePerSquarft= 130.0; break;
            case 3: valuePerSquarft= 90.0; break;
            case 4: valuePerSquarft= 80.0; break;
            default:valuePerSquarft= 100.0; break;
        }
        return (valuePerSquarft * squareft) + (0.25 * lotsize);
    }
}
