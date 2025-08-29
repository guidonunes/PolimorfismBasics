package br.com.example.model;

public class Product {
    private String name;
    private double price;

    public Product(){}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateDiscount(double discountValue) {
        return price - discountValue;
    }

    public double calculateDiscount(String coupon) {
        if(coupon.equals("FIAP20"))
            return price * 0.8;
        return price;
    }

    public double calculateDiscount(int percentage) {
        return price - price * percentage/100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
