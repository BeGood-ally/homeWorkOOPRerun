package org.example;

public class Main {
    public static void main(String[] args) {
        Product smartfone1 = new Product("nokia", 12000, "90%");
        Product smartfone2 = new Product("baccara", 15000, "40%");
        Product smartfone3 = new Product("samsung", 18000, "95%");
        Category smartfones = new Category("smartfones", smartfone1, smartfone2, smartfone3);
        Product notebook1 = new Product("asus", 42000, "80%");
        Product notebook2 = new Product("hp", 55000, "60%");
        Product notebook3 = new Product("dns", 30000, "90%");
        Category notebooks = new Category("notebooks", notebook1, notebook2, notebook3);
        Product computer1 = new Product("aser", 67000, "60%");
        Product computer2 = new Product("lenovo", 56000, "50%");
        Product computer3 = new Product("intel", 70000, "80%");
        Category computers = new Category("computers", computer1, computer2, computer3);
        System.out.println("Ассортимент магазина представлен следующими товарами:");
        Shop.Show();
        Busket busket1 = new Busket();
        Busket busket2 = new Busket();
        Busket busket3 = new Busket();
        busket1.Buy(computer2);
        busket1.Buy(smartfone2);
        busket2.Buy(notebook1);
        busket3.Buy(smartfone3);
        busket3.Buy(notebook3);
        User serg = new User("serg", "123", busket1);
        User jonn = new User("jonn", "567", busket2);
        User bob = new User("bob", "890", busket3);
        System.out.println("Пользователь " + serg.login + " приобрел:");
        busket1.Show();
        System.out.println("Пользователь " + jonn.login + " приобрел:");
        busket2.Show();
        System.out.println("Пользователь " + bob.login + " приобрел:");
        busket3.Show();
        System.out.println("В магазине остались следующие товары:");
        Shop.Show();
    }
}