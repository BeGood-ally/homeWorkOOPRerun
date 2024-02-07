package org.example;

public class Product {
    public String nameP;
    Integer cost;
    String rating;

    public Product(String name, Integer cost, String rating) {
        this.nameP = name;
        this.cost = cost;
        this.rating = rating;
        Shop.Add(this);
    }

    public String getNameP() {
        return nameP;
    }

    public Integer getCost() {
        return cost;
    }

    public String getRating() {
        return rating;
    }
}
