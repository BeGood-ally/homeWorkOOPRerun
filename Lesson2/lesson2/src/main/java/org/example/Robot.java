package org.example;

public class Robot extends Creation{
    int runLength;
    int jumpHeight;


    public Robot(int runLength, int jumpHeight, String name) {
        super(name, runLength, jumpHeight);
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        Competitors.addCreation(this);
    }

    void Run(){
        System.out.println("Robot run");
    }

    void Jump(){
        System.out.println("Robot jump");
    }
}
