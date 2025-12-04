package br.com.nandodev.practice.models;

public class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String name, double price, int amount, String expirationDate) {
        super(name, price, amount);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "{Perishable product: " + getName() + ", price= " + getPrice()
                + ", amount= " + getAmount() + ", expirationDate= " + this.expirationDate + "}";
    }
}
