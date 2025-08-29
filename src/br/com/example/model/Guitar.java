package br.com.example.model;

public class Guitar extends Instrument {
    public String material;

    public Guitar() {
        super();
    }

    public Guitar(String name, String brand, String material) {
        super(name, brand);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public Guitar setMaterial(String material) {
        this.material = material;
        return this;
    }

    @Override
    public String getShippingMethod() {
        return "Shippment by mail available";
    }

    @Override
    public String toString() {
        return "Guitar material: " + material + ", Name: " + name + ", Brand: " + brand;
    }
}
