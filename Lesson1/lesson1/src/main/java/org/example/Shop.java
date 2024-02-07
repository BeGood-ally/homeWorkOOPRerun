package org.example;

import java.util.ArrayList;

public class Shop {
    static ArrayList<Product>items = new ArrayList<Product>();

    static void Add(Product a){
        items.add(a);
    }

    static void Rem(Product a){
        items.remove(a);
    }

    static void Show(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).nameP);
        }
    }
}
