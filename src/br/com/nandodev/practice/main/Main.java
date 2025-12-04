package br.com.nandodev.practice.main;

import br.com.nandodev.practice.models.PerishableProduct;
import br.com.nandodev.practice.models.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();

        var p1 = new Product("Knife", 100, 50);
        var p2 = new Product("Fork", 50, 89);
        var p3 = new Product("Spon", 23.50, 45);
        var perishableP4 = new PerishableProduct("Cookies", 15, 32, "12-05-2026");

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(perishableP4);

        System.out.println("Size off array: " + products.size());
        System.out.println("Product 1: " + products.get(0).getName());
        System.out.println(products);
    }
}