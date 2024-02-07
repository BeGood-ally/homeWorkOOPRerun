package org.example;

public class Human extends Creation {

    public Human(int runLength, int jumpHeight, String name) {
        super(name,runLength,jumpHeight);
        Competitors.addCreation(this);
    }

    void Run(){
        System.out.println("Human run");
    }

    void Jump(){
        System.out.println("Human jump");
    }
}
