package org.example;

public class Category {
    String nameC;
    public Product [] subproduct = new Product[3];

    public Category(String nameC, Product a, Product b, Product c) {
        this.nameC = nameC;
        this.subproduct = subproduct;
        this.subproduct[0] = a;
        this.subproduct[1] = b;
        this.subproduct[2] = c;
    }

    public String returnUnit(int cell){
        return subproduct[cell].nameP;
    }

    public Product Buying(String q){
        int t = 0;
        for (int i = 0; i < subproduct.length; i++) {
            if(q == subproduct[i].nameP){
                t = i; break;
            }
        }
        return subproduct[t];
    }
}
