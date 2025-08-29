package br.com.example.model;

public class Instrument {
    public String name;
    public String brand;

    public Instrument(){}

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShippingMethod() {
        return "We will ship it to you soon";
    }

    @Override
    public String toString() {
        return "Name: " + name + " Brand: " + brand;
    }
}
