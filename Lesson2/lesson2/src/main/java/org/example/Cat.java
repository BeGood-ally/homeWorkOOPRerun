package org.example;

public class Cat extends Creation{
    int runLength;
    int jumpHeight;

    public Cat(int runLength, int jumpHeight, String name) {
        super(name, runLength, jumpHeight);
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        Competitors.addCreation(this);
    }

    void Run(){
        System.out.println("Cat run");
    }

    void Jump(){
        System.out.println("Cat jump");
    }
}
