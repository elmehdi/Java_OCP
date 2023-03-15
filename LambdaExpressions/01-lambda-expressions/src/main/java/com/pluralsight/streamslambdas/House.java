package com.pluralsight.streamslambdas;

import java.util.List;

public class House {
    private Integer bathroom;
    private Integer rooms;
    private float electricityBill;
    private float waterBill;
    private List<Product> productList; // This one has no meaning, actually the whole class doesn't make sens, but it is just for quick play test

    public House() {
    }

    public House(int bathroom, int rooms, float electricityBill, float waterBill, List<Product> productList) {
        this.bathroom = bathroom;
        this.rooms = rooms;
        this.electricityBill = electricityBill;
        this.waterBill = waterBill;
        this.productList = productList;
    }

    public Integer getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public float getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(float electricityBill) {
        this.electricityBill = electricityBill;
    }

    public float getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(float waterBill) {
        this.waterBill = waterBill;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "House{" +
                "bathroom=" + bathroom +
                ", rooms=" + rooms +
                ", electricityBill=" + electricityBill +
                ", waterBill=" + waterBill +
                ", productList=" + productList +
                '}';
    }
}