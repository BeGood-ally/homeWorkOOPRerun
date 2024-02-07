package org.example;

import java.util.ArrayList;

public class Busket {
    ArrayList<Product>purchases = new ArrayList<Product>();

    public void Buy(Product a){
        purchases.add(a);
        Shop.Rem(a);
    }

    void Ret(Product a){
        purchases.remove(a);
        Shop.Add(a);
    }

    void Show(){
        for (int i = 0; i < purchases.size(); i++) {
            System.out.println(purchases.get(i).nameP);
        }
    }
}

