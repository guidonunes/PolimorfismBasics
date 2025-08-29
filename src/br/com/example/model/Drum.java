package br.com.example.model;

public class Drum extends Instrument {
    public int drumSize;

    public Drum() {
        super();
    }

    public Drum(String name, String brand, int drumSize) {
        super(name, brand);
        this.drumSize = drumSize;
    }

    public int getDrumSize() {
        return drumSize;
    }

    public Drum setDrumSize(int drumSize) {
        this.drumSize = drumSize;
        return this;
    }

    @Override
    public String getShippingMethod() {
        return "Redeem in store only";
    }

    @Override
    public String toString() {
        return "Drum size: " + drumSize + ", Name: " + name + ", Brand: " + brand;
    }
}
