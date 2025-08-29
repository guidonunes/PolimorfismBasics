package br.com.example.model;

public class SalesForce extends Employee {
    @Override
    public String getGreeting() {
        return "We've sold the whole stock!";
    }

    public double getBonus() {return 12;}
}
